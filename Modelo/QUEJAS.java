
package Modelo;

import conexion.ConexionQuejas;
import javax.swing.JOptionPane;

public class QUEJAS extends javax.swing.JFrame {

    public QUEJAS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbx_seleccion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_asunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_mensaje = new javax.swing.JTextArea();
        jbtn_regresar = new javax.swing.JButton();
        jbtn_registrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("REGISTRO DE QUEJA O SUGERENCIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 40));

        jcbx_seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione--", "Queja", "Sugerencia" }));
        jcbx_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_seleccionActionPerformed(evt);
            }
        });
        jPanel1.add(jcbx_seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("REDACTE SU MENSAJE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 400, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ASIGNE SU QUEJA O SUGERENCIA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 400, 30));

        jtxt_asunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_asuntoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("INDIQUE SU ASUNTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 400, 30));

        jtxt_mensaje.setColumns(20);
        jtxt_mensaje.setRows(5);
        jScrollPane1.setViewportView(jtxt_mensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 730, 150));

        jbtn_regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_regresar.setText("REGRESAR");
        jPanel1.add(jbtn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 210, 50));

        jbtn_registrar.setBackground(new java.awt.Color(51, 153, 255));
        jbtn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_registrar.setText("REGISTRAR");
        jbtn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 210, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Imagen1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 320, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbx_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_seleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_seleccionActionPerformed

    private void jtxt_asuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_asuntoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtxt_asuntoActionPerformed

    private void jbtn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_registrarActionPerformed
        // Obtener los valores de los campos
        String tipo = jcbx_seleccion.getSelectedItem().toString();
        String asunto = jtxt_asunto.getText();
        String mensaje = jtxt_mensaje.getText();

        // Verificar si se ha seleccionado un tipo y se ha ingresado un asunto y un mensaje
        if (tipo.equals("Seleccione--") || asunto.isEmpty() || mensaje.isEmpty()) {
            // Mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Intentar registrar la queja o sugerencia
            try {
                // Llamar al método estático de ConexionQuejas para insertar la queja o sugerencia
                ConexionQuejas.insertarQuejaSugerencia(tipo, asunto, mensaje);

                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Queja o sugerencia registrada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                // Limpiar los campos después del registro
                jcbx_seleccion.setSelectedIndex(0);
                jtxt_asunto.setText("");
                jtxt_mensaje.setText("");

            } catch (Exception e) {
                // Mostrar un mensaje de error en caso de problemas con la conexión o la inserción
                JOptionPane.showMessageDialog(this, "Error al registrar la queja o sugerencia: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(QUEJAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUEJAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUEJAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUEJAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUEJAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_registrar;
    private javax.swing.JButton jbtn_regresar;
    private javax.swing.JComboBox<String> jcbx_seleccion;
    private javax.swing.JTextField jtxt_asunto;
    private javax.swing.JTextArea jtxt_mensaje;
    // End of variables declaration//GEN-END:variables
}
