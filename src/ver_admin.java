
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class ver_admin extends javax.swing.JFrame {
        Connection con = null;
        Statement stmt = null;
        String titulos[] = {"id_admin", "nombre", "apellido", "nickname", "pass"};
        String fila[] = new String [5];
        DefaultTableModel modelo;
   
    public ver_admin() {
        initComponents();
        
        this.setTitle("consulta de administradores");
        this.setLocation(335,200);
        this.setResizable(false);

        
        try {
            
            String url = "jdbc:mysql://localhost:3306/proyecto";
            String usuario = "root";
            String contraseña = "12345";  
            
               Class.forName("com.mysql.jdbc.Driver").newInstance();
               con = DriverManager.getConnection(url,usuario,contraseña);
               if (con!= null)
                   System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
               
               stmt = con.createStatement();
               ResultSet re = stmt.executeQuery("select* from administrador");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(re.next()) {
                   
                   fila[0] = re.getString("id_admin");
                   fila[1] = re.getString("nombre");
                   fila[2] = re.getString("apellido");
                   fila[3] = re.getString("nickname");
                   fila[4] = re.getString("pass");

                   
                   modelo.addRow(fila);     
               }
               
               tabla_admins.setModel(modelo);
                TableColumn ci = tabla_admins.getColumn("id_admin");
                ci.setMaxWidth(25);
                TableColumn cn = tabla_admins.getColumn("nombre");
                cn.setMaxWidth(165);
                TableColumn ca = tabla_admins.getColumn("apellido");
                ca.setMaxWidth(160);
                TableColumn cnick = tabla_admins.getColumn("nickname");
                cnick.setMaxWidth(72);
                TableColumn cp = tabla_admins.getColumn("pass");
                cp.setMaxWidth(72);


               
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error al extraer los datos de la tabla");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresarmenu = new javax.swing.JButton();
        tabla_admin = new javax.swing.JScrollPane();
        tabla_admins = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresarmenu.setText("REGRESAR AL MENU");
        btn_regresarmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresarmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 240, 160, 40));

        tabla_admins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_admin.setViewportView(tabla_admins);

        getContentPane().add(tabla_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarmenuActionPerformed
        // TODO add your handling code here:
        Menu men =new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarmenuActionPerformed

   
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
            java.util.logging.Logger.getLogger(ver_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ver_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresarmenu;
    private javax.swing.JScrollPane tabla_admin;
    private javax.swing.JTable tabla_admins;
    // End of variables declaration//GEN-END:variables
}
