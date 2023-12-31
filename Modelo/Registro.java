
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtApellidos = new javax.swing.JTextField();
        jtxtDni = new javax.swing.JTextField();
        jtxtCelu = new javax.swing.JTextField();
        jtxtDirecc = new javax.swing.JTextField();
        jtxtReferencia = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jcbxVere = new javax.swing.JComboBox<>();
        jcbxGen = new javax.swing.JComboBox<>();
        jcbxMant = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jbtnRegistarRes = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnRegistrarInfo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("“El progreso es un proyecto a veces puede ser lento pero");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 470, -1));

        jLabel27.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("sigues avanzando, eventualmente llegarás a la meta”");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 440, -1));

        jLabel25.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel25.setText("¿Cuenta con veredas?");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel12.setText("DNI");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel15.setText("Dirección");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel14.setText("Celular");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel17.setText("Nombre ");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel24.setText("¿Falta de mantenimiento?");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/WhatsApp Image 2023-12-05 at 1.16.57 AM.jpeg"))); // NOI18N
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 530, 540));

        jLabel20.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel20.setText("Género");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel18.setText("Referencia");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel13.setText("Apellidos ");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("INFORMACIÓN DEL RESIDENTE");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, -1));

        jtxtApellidos.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 40));

        jtxtDni.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 210, 40));

        jtxtCelu.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtCelu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 40));

        jtxtDirecc.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtDirecc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 40));

        jtxtReferencia.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 40));

        jtxtNombre.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 40));

        jcbxVere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "SI", "NO" }));
        jPanel4.add(jcbxVere, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 200, 40));

        jcbxGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "Masculino", "Femenino" }));
        jPanel4.add(jcbxGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 200, 40));

        jcbxMant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "SI", "NO" }));
        jPanel4.add(jcbxMant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 200, 40));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, 230, 50));

        jbtnRegistarRes.setBackground(new java.awt.Color(51, 102, 255));
        jbtnRegistarRes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbtnRegistarRes.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistarRes.setText("Registrar Informacion");
        jbtnRegistarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistarResActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnRegistarRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 190, 50));

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Registrar Queja o Sugerencia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 230, 50));

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Editar");
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 190, 50));

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cargar Imagen");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 230, 50));

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Limpiar");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 200, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 750));

        jTabbedPane1.addTab("Registro de Residentes", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMACIÓN DEL PROYECTO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, -1));

        jLabel16.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel16.setText("Nombre del Ingeniero");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel5.setText("DNI del Ingeniero");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel19.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel19.setText("Género");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel6.setText("Apellidos del Ingeniero");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel7.setText("Teléfono del Ingeniero");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel8.setText("Inicio de la obra");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel9.setText("Fin de la obra");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel4.setText("Estado de la obra");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image 6_1.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 290, 540));

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("sigues avanzando, eventualmente llegarás a la meta”");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 300, -1));

        jLabel23.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("“El progreso es un proyecto a veces puede ser lento pero");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 300, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 40));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 210, 40));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 210, 40));

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 210, 40));

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE--", "En tramite", "En proceso", "Completado" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "Masculino", "Femenino" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 200, 40));

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 40));

        jLabel21.setFont(new java.awt.Font("Poppins Light", 0, 13)); // NOI18N
        jLabel21.setText("Presupuesto asignado");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jTextField7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 210, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 200, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 200, 40));

        jbtnRegistrarInfo.setBackground(new java.awt.Color(51, 51, 255));
        jbtnRegistrarInfo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jbtnRegistrarInfo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrarInfo.setText("Registrar Informacion");
        jPanel3.add(jbtnRegistrarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 200, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image 5.png"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 210, 190));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 700));

        jTabbedPane1.addTab("Registro de Proyectos", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        QUEJAS P1=new QUEJAS();
        P1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CargarImagen P1=new CargarImagen();
        P1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jbtnRegistarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistarResActionPerformed
ConfirmaRegistro confirmacion = new ConfirmaRegistro();
    confirmacion.setVisible(true);

    // Espera hasta que el formulario de confirmación se cierre
    confirmacion.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            // Verifica la confirmación del formulario
            if (confirmacion.isConfirmado()) {
                // Si se confirma, guarda la información
                guardarInformacion();
            } else {
                // Si no se confirma, realiza las acciones necesarias o simplemente no hagas nada
            }
        }
    });     
    }//GEN-LAST:event_jbtnRegistarResActionPerformed
private void guardarInformacion() {
    String nombre = jtxtNombre.getText();
    String apellidos = jtxtApellidos.getText();
    String celular = jtxtCelu.getText();
    String direccion = jtxtDirecc.getText();
    String referencia = jtxtReferencia.getText();
    String dni = jtxtDni.getText();
    String genero = jcbxGen.getSelectedItem().toString();
    String mantenimiento = jcbxMant.getSelectedItem().toString();
    String veredas = jcbxVere.getSelectedItem().toString();

    try {
        // Establecer la conexión con la base de datos
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registroresidentes", "usuario", "contraseña");

        // Crear la consulta SQL para la inserción de datos
        String query = "INSERT INTO registro (Nombre, Apellidos, DNI, Celular, Direccion, Referencia, Genero, Mantenimiento, Veredas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            // Establecer los parámetros de la consulta
            pst.setString(1, nombre);
            pst.setString(2, apellidos);
            pst.setString(3, dni);
            pst.setString(4, celular);
            pst.setString(5, direccion);
            pst.setString(6, referencia);
            pst.setString(7, genero);
            pst.setString(8, mantenimiento);
            pst.setString(9, veredas);

            // Ejecutar la consulta
            pst.executeUpdate();

            // Cerrar la conexión
            connection.close();

            // Limpiar los campos de entrada
            jtxtNombre.setText("");
            jtxtApellidos.setText("");
            jtxtCelu.setText("");
            jtxtDirecc.setText("");
            jtxtReferencia.setText("");
            jtxtDni.setText("");
            jcbxGen.setSelectedIndex(0);
            jcbxMant.setSelectedIndex(0);
            jcbxVere.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jbtnRegistarRes;
    private javax.swing.JButton jbtnRegistrarInfo;
    private javax.swing.JComboBox<String> jcbxGen;
    private javax.swing.JComboBox<String> jcbxMant;
    private javax.swing.JComboBox<String> jcbxVere;
    private javax.swing.JTextField jtxtApellidos;
    private javax.swing.JTextField jtxtCelu;
    private javax.swing.JTextField jtxtDirecc;
    private javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtReferencia;
    // End of variables declaration//GEN-END:variables
}
