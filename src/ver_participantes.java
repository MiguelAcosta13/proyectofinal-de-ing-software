
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;
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
public class ver_participantes extends javax.swing.JFrame {
    
        Connection con = null;
        Statement stmt = null;
        String titulos[] = {"id_participantes","nombre", "apellido", "nickname", "pass"};
        String fila[] = new String [5];
        DefaultTableModel modelo;
        
    

    public ver_participantes() {
        initComponents();
        
        this.setTitle("consulta de participantes");
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
               ResultSet rs = stmt.executeQuery("select* from participantes");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(rs.next()) {
                   
                   fila[0] = rs.getString("id_participantes");
                   fila[1] = rs.getString("nombre");
                   fila[2] = rs.getString("apellido");
                   fila[3] = rs.getString("nick");
                   fila[4] = rs.getString("pass");

                   
                   modelo.addRow(fila);     
               }
               tabla_participantes.setModel(modelo);
                
                TableColumn ci = tabla_participantes.getColumn("id_participantes");
                ci.setMaxWidth(25);
                TableColumn cn = tabla_participantes.getColumn("nombre");
                cn.setMaxWidth(165);
                TableColumn ca = tabla_participantes.getColumn("apellido");
                ca.setMaxWidth(160);
                TableColumn cnick = tabla_participantes.getColumn("nick");
                cnick.setMaxWidth(72);
                TableColumn cp = tabla_participantes.getColumn("pass");
                cp.setMaxWidth(72);

               
        }
        catch (Exception e) {
            
            
        }
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_menu = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_participantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("REGRESAR AL MENU");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 170, 40));

        btn_eliminar.setText("ELIMINAR FILA");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 40));

        tabla_participantes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_participantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
         Menu men =new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int fila= tabla_participantes.getSelectedRow();
        String valor=tabla_participantes.getValueAt(fila, 0).toString();
        if (fila>=0) {
            try {
                PreparedStatement pps = con.prepareStatement("DELETE FROM participantes WHERE id_participantes='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fila eliminada");
                ver_admin ver2= new ver_admin();
                ver2.setVisible(false);
                this.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ver_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ver_participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ver_participantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_participantes;
    // End of variables declaration//GEN-END:variables
}
