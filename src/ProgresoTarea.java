
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class ProgresoTarea extends javax.swing.JFrame {
        conexionsql2 con = new conexionsql2();
        Connection cn = con.conectar();

    
    public ProgresoTarea() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtparticipantes.removeAllItems();
        this.txtproyecto.removeAllItems();
        this.txttarea.removeAllItems();
        this.txtestado.removeAllItems();
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con.createStatement();
            ResultSet rs= Sent.executeQuery("select * from registro");
            
            
            while(rs.next()){
                this.txtproyecto.addItem(rs.getString("id_proyecto"));
                
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
         try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con.createStatement();
            ResultSet rs1= Sent.executeQuery("select * from tareas");
            
            
            while(rs1.next()){
                this.txttarea.addItem(rs1.getString("id_tareas"));
                
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl_tarea = new javax.swing.JLabel();
        lbl_participantes = new javax.swing.JLabel();
        txttarea = new javax.swing.JComboBox<>();
        txtparticipantes = new javax.swing.JComboBox<>();
        txt_participantes = new javax.swing.JTextField();
        lbl_estado = new javax.swing.JLabel();
        txtestado = new javax.swing.JComboBox<>();
        lbl_fechaestado = new javax.swing.JLabel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        btn_registrar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        lbl_proyecto = new javax.swing.JLabel();
        txtproyecto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_proyecto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_tarea = new javax.swing.JTextArea();
        lbl_back13 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tarea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tarea.setForeground(new java.awt.Color(240, 240, 240));
        lbl_tarea.setText("TAREA:");
        getContentPane().add(lbl_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        lbl_participantes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_participantes.setForeground(new java.awt.Color(240, 240, 240));
        lbl_participantes.setText("PARTICIPANTE:");
        getContentPane().add(lbl_participantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txttarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txttarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttareaActionPerformed(evt);
            }
        });
        getContentPane().add(txttarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 110, -1));

        txtparticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtparticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparticipantesActionPerformed(evt);
            }
        });
        getContentPane().add(txtparticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, -1));
        getContentPane().add(txt_participantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, -1));

        lbl_estado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_estado.setForeground(new java.awt.Color(240, 240, 240));
        lbl_estado.setText("ESTADO DE LA TAREA:");
        getContentPane().add(lbl_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 110, -1));

        lbl_fechaestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaestado.setForeground(new java.awt.Color(240, 240, 240));
        lbl_fechaestado.setText("FECHA:");
        getContentPane().add(lbl_fechaestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        txt_fecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, -1));

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, 50));

        btn_regresar.setText("REGRESAR");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 160, 50));

        lbl_proyecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_proyecto.setForeground(new java.awt.Color(240, 240, 240));
        lbl_proyecto.setText("PROYECTO:");
        getContentPane().add(lbl_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        txtproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproyectoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 110, -1));

        txt_proyecto.setColumns(20);
        txt_proyecto.setRows(5);
        jScrollPane1.setViewportView(txt_proyecto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 50));

        txt_tarea.setColumns(20);
        txt_tarea.setRows(5);
        jScrollPane2.setViewportView(txt_tarea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 40));

        lbl_back13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/3a245d83eef7a69961c7f19540e972c1.jpg"))); // NOI18N
        getContentPane().add(lbl_back13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
        
        txtestado.addItem("Iniciando");
        txtestado.addItem("Proceso");
        txtestado.addItem("Terminado");
    }//GEN-LAST:event_txtestadoActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        MenuParticipantes men = new MenuParticipantes();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txtproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproyectoActionPerformed
        // TODO add your handling code here:
        try{
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent1=con1.createStatement();
            ResultSet rs1= Sent1.executeQuery("select * from registro where id_proyecto= '"+this.txtproyecto.getSelectedItem()+"' ");
            rs1.next();
            this.txt_proyecto.setText(rs1.getString("nombreProyecto"));
            

            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
        
    }//GEN-LAST:event_txtproyectoActionPerformed

    private void txttareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttareaActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent1=con1.createStatement();
            ResultSet rs1= Sent1.executeQuery("select * from tareas where id_tareas= '"+this.txttarea.getSelectedItem()+"' ");
            rs1.next();
            this.txt_tarea.setText(rs1.getString("nombreTarea"));
            

            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con.createStatement();
            ResultSet rs= Sent.executeQuery("select * from participantes");
            
            
            while(rs.next()){
                this.txtparticipantes.addItem(rs.getString("id_participantes"));
                
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txttareaActionPerformed

    private void txtparticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparticipantesActionPerformed
        // TODO add your handling code here:
        try{
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con1.createStatement();
            ResultSet rs1= Sent.executeQuery("select * from participantes where id_participantes= '"+this.txtparticipantes.getSelectedItem()+"' ");
            rs1.next();
            this.txt_participantes.setText(rs1.getString("nombre"));
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }           
    }//GEN-LAST:event_txtparticipantesActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
        String proyecto =txtproyecto.getSelectedItem().toString();
        String tarea = txttarea.getSelectedItem().toString();
        String participante =txtparticipantes.getSelectedItem().toString();
        String estadotarea =txtestado.getSelectedItem().toString();
        String fecha =((JTextField) txt_fecha.getDateEditor().getUiComponent()).getText();;
        
        progresoTareas p = new progresoTareas(proyecto, tarea,  participante, estadotarea, Date.valueOf(fecha));
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO progreso (id_proyecto, id_tareas, id_participantes, estadotareas, fecha) VALUES (?,?,?,?,?)");
            ps.setString(1, proyecto);
            ps.setString(2, tarea);
            ps.setString(3, participante);
            ps.setString(4, estadotarea);
            ps.setDate(5, p.getFecha());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE GUARDAR DATOS");
        }
        
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(ProgresoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgresoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgresoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgresoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgresoTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_back13;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_fechaestado;
    private javax.swing.JLabel lbl_participantes;
    private javax.swing.JLabel lbl_proyecto;
    private javax.swing.JLabel lbl_tarea;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_participantes;
    private javax.swing.JTextArea txt_proyecto;
    private javax.swing.JTextArea txt_tarea;
    private javax.swing.JComboBox<String> txtestado;
    private javax.swing.JComboBox<String> txtparticipantes;
    private javax.swing.JComboBox<String> txtproyecto;
    private javax.swing.JComboBox<String> txttarea;
    // End of variables declaration//GEN-END:variables
}
