/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schulverwaltungssystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammed
 */
public class Gebühren_Einreichungmodel extends javax.swing.JFrame {

    /**
     * Creates new form Gebühren_Einreichungmodel
     */
    public Gebühren_Einreichungmodel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        v1 = new javax.swing.JTextField();
        v6 = new javax.swing.JTextField();
        v3 = new javax.swing.JTextField();
        v4 = new javax.swing.JTextField();
        v7 = new javax.swing.JTextField();
        v5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        v2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        r5 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel3.setText("Gebühren");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("bezahlen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 170, -1));

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Monatliche Gebühr");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 170, 35));

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Monatsname");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 120, 35));

        jLabel8.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jahresgebühr");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, 35));

        jLabel9.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sportgebühr");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, 40));

        jLabel10.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bibliotheksgebühr");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 150, 35));

        jLabel11.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, 35));
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 30));
        jPanel1.add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 170, 30));
        jPanel1.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));
        jPanel1.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, 30));

        v7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v7ActionPerformed(evt);
            }
        });
        jPanel1.add(v7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 412, 170, 30));

        v5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v5ActionPerformed(evt);
            }
        });
        jPanel1.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 30));

        jLabel12.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Schülername");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 35));
        jPanel1.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Zruck");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 620, 560));

        r5.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(r5);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 370, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             String ann = v4.getText();
        double a= Double.parseDouble(ann);
        String mon = v7.getText();
        double m= Double.parseDouble(mon);
        String lib = v6.getText();
        double l= Double.parseDouble(lib);
        String  spo= v5.getText();//initialize variable for sport fee
        double s= Double.parseDouble(spo);//convert string in double
        String mn= v3.getText(); //for month name
        
        double total= s+a+l+m;
        double rem=total-18000; //let's say 18000 is the total fee
        String status;
        if(rem ==0){
        status="paid";
        }
        else{
        status="unpaid";}
        
        r5.setText("\tSchulverwaltungssystem \n ************************************"
                + "\ninsgesamte zahlende Gesamtgebühr: 18000\n  ************************************\n Paid Fee \n\n\n"
                + "Sport FEE: "+spo+"\n Annual FEE:  "+ann+"\n Monthly FEE: "+mon+"\n Library FEE "+lib+
                "\nGesamtgebühr bezahlt: "+total+"\n Verblieben: "+rem);
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
        String sql= "insert into gebuhr values(?,?,?,?,?,?,?,?)";
        PreparedStatement ptst = conn.prepareStatement(sql);
        
        ptst.setString(1,v1.getText());
        ptst.setString(2,v2.getText());
        ptst.setString(3,mn);
        ptst.setDouble(4,a);
        ptst.setDouble(5,m);
        ptst.setDouble(6,s);
        ptst.setDouble(7,l);
        ptst.setString(8,status);
        ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Die Daten wurden erfolgreich gespeichert!");
            conn.close();
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void v7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v7ActionPerformed

    private void v5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Hallo obj =new Hallo();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gebühren_Einreichungmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gebühren_Einreichungmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gebühren_Einreichungmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gebühren_Einreichungmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gebühren_Einreichungmodel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane r5;
    private javax.swing.JTextField v1;
    private javax.swing.JTextField v2;
    private javax.swing.JTextField v3;
    private javax.swing.JTextField v4;
    private javax.swing.JTextField v5;
    private javax.swing.JTextField v6;
    private javax.swing.JTextField v7;
    // End of variables declaration//GEN-END:variables
}
