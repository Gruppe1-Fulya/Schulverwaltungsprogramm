/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package schulverwaltungssystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HinfugenTest {

    @Test
    public void testInsertDataIntoDatabase() {
        // Mocking the input values for the test
        String t1Value = "1";
        String t2Value = "Muhammed";
        String t3Value = "alobayd";
        String t4Value = "12";
        String t5Value = "09";
        String t6Value = "a";
        String t7Value = "Baykoz";

        try {
            // Connect to the database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");

            // Execute the insertion query
            String sql = "INSERT INTO muhm VALUES ('" + t1Value + "', '" + t2Value + "', '" + t3Value + "', '" + t4Value + "', '" + t5Value + "', '" + t6Value + "', '" + t7Value + "')";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            // Verify that the data was inserted correctly
            String selectSql = "SELECT * FROM muhm WHERE id = '" + t1Value + "'";
            ResultSet rs = stmt.executeQuery(selectSql);
            if (rs.next()) {
                String retrievedT2Value = rs.getString("t2");
                String retrievedT3Value = rs.getString("t3");
                String retrievedT4Value = rs.getString("t4");
                String retrievedT5Value = rs.getString("t5");
                String retrievedT6Value = rs.getString("t6");
                String retrievedT7Value = rs.getString("t7");

                Assertions.assertEquals(t2Value, retrievedT2Value);
                Assertions.assertEquals(t3Value, retrievedT3Value);
                Assertions.assertEquals(t4Value, retrievedT4Value);
                Assertions.assertEquals(t5Value, retrievedT5Value);
                Assertions.assertEquals(t6Value, retrievedT6Value);
                Assertions.assertEquals(t7Value, retrievedT7Value);
            } else {
                // Fail the test if no data was found
                Assertions.fail("No data found in the database");
            }

            // Close the database connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail("Exception occurred: " + e.getMessage());
        }
    }
}
