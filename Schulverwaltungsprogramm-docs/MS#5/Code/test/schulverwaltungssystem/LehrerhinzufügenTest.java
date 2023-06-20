/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package schulverwaltungssystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LehrerhinzufügenTest {

    @Test
    public void testJButton1ActionPerformed() {
        // Prepare test data
        String id = "15667";
        String name = "Ali";
        String spezialisierung = "Algebra";
        String fach = "Mathematik";

      
        jButton1ActionPerformed(id, name, spezialisierung, fach);

      
        assertTrue(checkIfDataExists(id, name, spezialisierung, fach));
    }

    private void jButton1ActionPerformed(String id, String name, String spezialisierung, String fach) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
            String sql = "insert into lehrer values (?,?,?,?)";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.setString(1, id);
            ptst.setString(2, name);
            ptst.setString(3, spezialisierung);
            ptst.setString(4, fach);
            ptst.executeUpdate();
            conn.close();
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    private boolean checkIfDataExists(String id, String name, String spezialisierung, String fach) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
            String sql = "select * from lehrer where id = ?";
            PreparedStatement ptst = conn.prepareStatement(sql);
            ptst.setString(1, id);
            ResultSet rs = ptst.executeQuery();
            if (rs.next()) {
                String storedId = rs.getString("id");
                String storedName = rs.getString("name");
                String storedSpezialisierung = rs.getString("spezialisierung");
                String storedFach = rs.getString("fach");
                conn.close();
                return id.equals(storedId) && name.equals(storedName) &&
                       spezialisierung.equals(storedSpezialisierung) && fach.equals(storedFach);
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            fail("Exception occurred: " + e.getMessage());
        }
        return false;
    }
}
