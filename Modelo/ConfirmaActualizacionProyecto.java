
package Modelo;


public class ConfirmaActualizacionProyecto extends javax.swing.JFrame {
private boolean confirmado;

 public ConfirmaActualizacionProyecto() {
      
        initComponents();
    }
    
    
    
    
 public boolean isConfirmado() {
        return confirmado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnNo = new javax.swing.JButton();
        jbtnSi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("¿ Desea guardar los datos actualizados ?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 380, 60));

        jbtnNo.setBackground(new java.awt.Color(255, 51, 51));
        jbtnNo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        jbtnNo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnNo.setText("Cancelar");
        jbtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jbtnSi.setBackground(new java.awt.Color(51, 51, 255));
        jbtnSi.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        jbtnSi.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSi.setText("Aceptar");
        jbtnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSiActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNoActionPerformed
     // Si el usuario hace clic en "No", establece la confirmación en falso
        confirmado = false;
        // Cierra el formulario
        dispose();
    }//GEN-LAST:event_jbtnNoActionPerformed

    private void jbtnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSiActionPerformed
      // Si el usuario hace clic en "Sí", establece la confirmación en verdadero
    confirmado = true;
    // Cierra el formulario
    dispose();
    }//GEN-LAST:event_jbtnSiActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmaActualizacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmaActualizacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmaActualizacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmaActualizacionProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmaActualizacionProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnNo;
    private javax.swing.JButton jbtnSi;
    // End of variables declaration//GEN-END:variables
}
