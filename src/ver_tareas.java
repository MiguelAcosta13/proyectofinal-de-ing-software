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


public class ver_tareas extends javax.swing.JFrame {
        Connection con = null;
        Statement stmt = null;
        String titulos[] = {"Proyecto", "Participante", "Nombre_tarea", "objetivo", "fechaInicio", "fechatermino", "Prioridad"};
        String fila[] = new String [7];
        DefaultTableModel modelo;
        
        

    public ver_tareas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        
        this.setTitle("CONSULTAS DE TAREAS");
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
               ResultSet re = stmt.executeQuery("select * from tareas");
               
               modelo = new DefaultTableModel(null,titulos);
            
               while(re.next()) {
                   
                   fila[0] = re.getString("id_proyecto");
                   fila[1] = re.getString("id_participantes");
                   fila[2] = re.getString("nombreTarea");
                   fila[3] = re.getString("objetivo");
                   fila[4] = re.getString("fechaInicio");
                   fila[5] = re.getString("fechaTermino");
                   fila[6] = re.getString("prioridad");

                   
                   modelo.addRow(fila);     
               }
               
               tabla_tareas.setModel(modelo);
                TableColumn ci = tabla_tareas.getColumn("id_proyecto");
                ci.setMaxWidth(45);
                TableColumn ca = tabla_tareas.getColumn("id_participantes");
                ci.setMaxWidth(45);
                TableColumn cn = tabla_tareas.getColumn("nombreTarea");
                cn.setMaxWidth(165);
                TableColumn co = tabla_tareas.getColumn("objetivo");
                co.setMaxWidth(160);
                TableColumn cfe = tabla_tareas.getColumn("fechaInicio");
                cfe.setMaxWidth(72);
                TableColumn cte = tabla_tareas.getColumn("fechaTermino");
                cte.setMaxWidth(72);
                TableColumn cp = tabla_tareas.getColumn("Prioridad");
                cp.setMaxWidth(72);


               
        }
        catch (Exception e) {
            
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tareas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 190, 60));

        btn_eliminar.setText("ELIMINAR FILA");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 170, 60));

        tabla_tareas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_tareas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        
        int fila= tabla_tareas.getSelectedRow();
        String valor=tabla_tareas.getValueAt(fila, 0).toString();
        if (fila>=0) {
            try {
                PreparedStatement pps = con.prepareStatement("DELETE FROM tareas WHERE id_tareas='"+valor+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Fila eliminada");
                
            } catch (SQLException ex) {
                Logger.getLogger(ver_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ver_tareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_tareas;
    // End of variables declaration//GEN-END:variables
}
