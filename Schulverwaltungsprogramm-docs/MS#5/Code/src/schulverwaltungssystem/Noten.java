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
public class Noten extends javax.swing.JFrame {

    /**
     * Creates new form Noten
     */
    public Noten() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        y4 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y6 = new javax.swing.JTextField();
        y5 = new javax.swing.JTextField();
        y7 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        schreiben = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(137, 112, 88));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, 35));

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Studentennummer ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 35));

        jLabel8.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 60, 35));

        jLabel10.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Physik");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 70, 35));

        jLabel11.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Programmierung");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 35));

        jLabel12.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Klasse");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 35));

        jLabel13.setFont(new java.awt.Font("Swis721 Cn BT", 3, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mathematik");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 35));

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel3.setText("...........................................................");
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, -1));
        jPanel1.add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));
        jPanel1.add(y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));
        jPanel1.add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));
        jPanel1.add(y6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, -1));
        jPanel1.add(y5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 170, -1));
        jPanel1.add(y7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 170, -1));
        jPanel1.add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel4.setText("Noten");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 230, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Square721 Cn BT", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Klicken");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 110, -1));

        jLabel5.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 25)); // NOI18N
        jLabel5.setText("Bericht fuer Noten");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 230, -1));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 550));

        jScrollPane1.setViewportView(schreiben);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 360, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorMoved

    private void jLabel4AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorMoved

    private void jLabel5AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5AncestorMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
        String sql="insert into bericht values (?,?,?,?,?,?,?,?)";
        String p= y5.getText();
        double s1= Double.parseDouble(p);
        String m= y6.getText();
        double s2= Double.parseDouble(m);
        String c= y7.getText();
        double s3= Double.parseDouble(c);
        
        double total=((s1+s2+s3)*100)/300;
        
        String Noten;
        
        if(total>= 80){
        Noten= "A+";
        }
        else if(total>=70 && total <80){
        Noten="A";
        }
        
        else if(total>=60 && total <70){
        Noten="B";
        }
        
        else if(total>=50 && total <60){
        Noten="C";
        }
        
        else if(total>=40 && total <50){
        Noten="D";
        }
        else
        { Noten="Fail";
        }
        
        String n= y3.getText();
        String r=y2.getText();
        String cla= y4.getText();
        String ph= y6.getText();
        String mt= y5.getText();
        String ch= y7.getText();
        
        
            PreparedStatement ptst= conn.prepareStatement(sql);
            ptst.setString(1, y1.getText());
            ptst.setString(2, n);
            ptst.setString(3, cla);
            ptst.setString(4, ph);
            ptst.setString(5, ch);
            ptst.setString(6, mt);
            ptst.setString(7, r);
            ptst.setString(8, Noten);
            
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Daten wurden gespeichert");
            
            schreiben.setText("REPORT CARD\n\n Student Name: "+n+"\nClass: "+cla+"\n\n-----------------------\nNoten\n\nPhysik: "+ph+"\nProgrammierung: "+ch+
                    "\nMath: "+mt+"\nGrade: "+Noten);
            conn.close();
         
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
                                            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
           Hallo obj =new Hallo();
        obj.setVisible(true);
        dispose();
    
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Noten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Noten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Noten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Noten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Noten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane schreiben;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField y4;
    private javax.swing.JTextField y5;
    private javax.swing.JTextField y6;
    private javax.swing.JTextField y7;
    // End of variables declaration//GEN-END:variables
}
