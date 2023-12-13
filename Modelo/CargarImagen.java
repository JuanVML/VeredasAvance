
package Modelo;

import conexion.ConexionRegistro;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SubirImagen extends javax.swing.JFrame {

    public SubirImagen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jbtnSeleccionar = new javax.swing.JButton();
        jbtnrgresar = new javax.swing.JButton();
        jbtnSubir = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE DE LA IMAGEN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, -1));

        jtxtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 260, 50));

        jbtnSeleccionar.setBackground(new java.awt.Color(0, 0, 255));
        jbtnSeleccionar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jbtnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSeleccionar.setText("Seleccionar Imagen");
        jbtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, 60));

        jbtnrgresar.setBackground(new java.awt.Color(51, 255, 204));
        jbtnrgresar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jbtnrgresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/a.png"))); // NOI18N
        jbtnrgresar.setText("Regresar");
        jbtnrgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrgresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnrgresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 150, 60));

        jbtnSubir.setBackground(new java.awt.Color(0, 0, 255));
        jbtnSubir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jbtnSubir.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSubir.setText("Guardar Imagen");
        jbtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 150, 60));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 610, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/subir imagen (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jbtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String Ruta = "";
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif" );
        jFileChooser.setFileFilter(filtrado);
        
        int respuesta = jFileChooser.showOpenDialog(this);
        
        if(respuesta == jFileChooser.APPROVE_OPTION){
            Ruta = jFileChooser.getSelectedFile().getPath();
            
            Image mImagen = new ImageIcon(Ruta).getImage();
            ImageIcon mIcon = new ImageIcon(mImagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH));
            lblImagen.setIcon(mIcon);
        }
    }                                               

    private void jbtnSubirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            GuardarImagen();
        } catch (IOException ex) {
            Logger.getLogger(SubirImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void jbtnrgresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Registro P1=new Registro();
        P1.setVisible(true);
        dispose();
    }                                           

    
    public void GuardarImagen() throws IOException {
try {
        ConexionRegistro conectar = new ConexionRegistro();
        Connection connection = conectar.conectar();
        
        if (connection != null) {
            String nombre = jtxtNombre.getText();
            ImageIcon icon = (ImageIcon) lblImagen.getIcon();
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            
            try (PreparedStatement pst = connection.prepareStatement("INSERT INTO Imagenes (nombre, datosimagen) VALUES (?, ?)")) {
                pst.setString(1, nombre);
                
                // Convertir la imagen a bytes
                java.io.ByteArrayOutputStream stream = new java.io.ByteArrayOutputStream();
                java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(stream);
                oos.writeObject(new ImageIcon(scaledIcon.getImage()));
                pst.setBytes(2, stream.toByteArray());
                
                pst.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente en la base de datos.");
            connection.close();
        }
    } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar la imagen en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }


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
            java.util.logging.Logger.getLogger(SubirImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubirImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubirImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubirImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubirImagen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnSeleccionar;
    private javax.swing.JButton jbtnSubir;
    private javax.swing.JButton jbtnrgresar;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration                   
}
