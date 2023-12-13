
package Modelo;

import com.sun.jdi.connect.spi.Connection;
import conexion.ConexionRegistro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mantenimiento extends javax.swing.JFrame {

  
    ConexionRegistro enlace = new ConexionRegistro();
    java.sql.Connection conect = enlace.conectar();
    public Mantenimiento() {
        initComponents();
        mostrarDatos(0);
        this.setLocationRelativeTo(this);
    }
     public void mostrarDatos(int estado) {
        DefaultTableModel datosMantenimiento = new DefaultTableModel();
        datosMantenimiento.addColumn("ID");
        datosMantenimiento.addColumn("Fecha");
        datosMantenimiento.addColumn("N°Proyecto");
        datosMantenimiento.addColumn("Estado");
        jtblMantenimiento.setModel(datosMantenimiento);

        String codsql = null;

        if (estado == 0 ) {
            codsql = "SELECT * FROM mantenimiento";
        } else {
            if (estado == 1 ) {
                codsql = "SELECT * FROM mantenimiento WHERE Estado = 'En tramite'";
            } else {
                if (estado == 2 ) {
                    codsql = "SELECT * FROM mantenimiento WHERE Estado = 'En proceso'";
                } else {
                    if (estado == 3 ) {
                        codsql = "SELECT * FROM mantenimiento WHERE Estado = 'Completado'";
                }
            }
        }
        }
        String[] datos = new String[4];
        try {
            java.sql.Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(codsql);

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);

                

                datosMantenimiento.addRow(datos);

            }
            jtblMantenimiento.setModel(datosMantenimiento);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtxtFechaMan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtNPro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jcbxEstado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jbtnRegresar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMantenimiento = new javax.swing.JTable();
        jbtnBuscar = new javax.swing.JButton();
        jbtnRegristrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Bell MT", 1, 20)); // NOI18N
        jLabel17.setText("MANTENIMIENTO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 230, 30));

        jtxtFechaMan.setBackground(new java.awt.Color(102, 102, 102));
        jtxtFechaMan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtxtFechaMan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtFechaMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 210, 40));

        jLabel13.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel13.setText("N° de proyecto:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jtxtNPro.setBackground(new java.awt.Color(102, 102, 102));
        jtxtNPro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtxtNPro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jtxtNPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 210, 40));

        jLabel20.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel20.setText("Estado:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jcbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "En tramite", "En proceso", "Completado" }));
        jPanel1.add(jcbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 40));

        jLabel19.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel19.setText("Fecha de mantenimiento");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jbtnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        jbtnRegresar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jbtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegresar.setText("Regresar");
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 150, 50));

        jbtnRegistrar.setBackground(new java.awt.Color(51, 51, 255));
        jbtnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("Editar Fecha");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 50));

        jtblMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblMantenimiento);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 520, 190));

        jbtnBuscar.setBackground(new java.awt.Color(102, 255, 255));
        jbtnBuscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/informacion.png"))); // NOI18N
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 40));

        jbtnRegristrar.setBackground(new java.awt.Color(51, 51, 255));
        jbtnRegristrar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jbtnRegristrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegristrar.setText("Registar");
        jbtnRegristrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegristrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegristrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 150, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 540, 500));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed

        Registro P1=new Registro();
        P1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        String Fecha= jtxtFechaMan.getText();
      String npro=jtxtNPro.getText();
      String estado=jcbxEstado.getSelectedItem().toString();
      
      //Registro p = new Registro(dni, nombre, apellido, horario, edad);
      //jtblMantenimiento.addRow(p.toArray());
      
      jtxtFechaMan.setText("");
      jtxtNPro.setText("");
      jcbxEstado.setSelectedItem("");
      
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed

        int estado = jcbxEstado.getSelectedIndex();
        
        mostrarDatos(estado);
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnRegristrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegristrarActionPerformed
 String fecha = jtxtFechaMan.getText();
    String nProyecto = jtxtNPro.getText();
    String estado = jcbxEstado.getSelectedItem().toString();

    // Insertar datos en la tabla
    DefaultTableModel model = (DefaultTableModel) jtblMantenimiento.getModel();
    model.addRow(new Object[]{null, fecha, nProyecto, estado});

    // Insertar datos en la base de datos
    try {
        ConexionRegistro conectarman = new ConexionRegistro();
        java.sql.Connection connection = conectarman.conectar();
        if (connection != null) {
            String query = "INSERT INTO mantenimiento (Fecha, N°Proyecto, Estado) VALUES (?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setString(1, fecha);
                pst.setString(2, nProyecto);
                pst.setString(3, estado);
                pst.executeUpdate();
            }
            connection.close();
        }
        JOptionPane.showMessageDialog(null, "Registro exitoso en la base de datos.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Limpiar los campos después de registrar
    jtxtFechaMan.setText("");
    jtxtNPro.setText("");
    jcbxEstado.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnRegristrarActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnRegristrar;
    private javax.swing.JComboBox<String> jcbxEstado;
    private javax.swing.JTable jtblMantenimiento;
    private javax.swing.JTextField jtxtFechaMan;
    private javax.swing.JTextField jtxtNPro;
    // End of variables declaration//GEN-END:variables
}
