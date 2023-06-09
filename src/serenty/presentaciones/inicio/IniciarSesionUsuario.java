/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serenty.presentaciones.inicio;

import serenty.clases.ConexionDB;
import serenty.presentaciones.psicologo.PrincipalPsicologo;
import serenty.presentaciones.prueba.IngresoPrueba;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import serenty.clases.Constantes;
import serenty.clases.ConsultasDB;
import serenty.clases.UsuarioActivo;
import serenty.presentaciones.paciente.PrincipalPaciente;
import serenty.presentaciones.prueba.ConclusionPrueba;

/**
 *
 * @author User
 */
public class IniciarSesionUsuario extends javax.swing.JFrame {
    ConexionDB connection = new ConexionDB ();
    Connection cn = connection.conectar();
    
    /**
     * Creates new form SESION
     */
    public IniciarSesionUsuario() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        AVISO.setVisible(false);
        correoUsuario.setBackground(new java.awt.Color(0,0,0,1));
        contrasenaUsuario.setBackground(new java.awt.Color(0,0,0,1));
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        correoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contrasenaUsuario = new javax.swing.JPasswordField();
        HIDE = new javax.swing.JLabel();
        SHOW = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cerrar1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AVISO = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 212, 187));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );

        jPanel2.setBackground(new java.awt.Color(241, 231, 197));

        jLabel2.setFont(new java.awt.Font("mariana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 60, 60));
        jLabel2.setText("Inicia Sesión");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/email.png"))); // NOI18N
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("COCOGOOSE ", 0, 12)); // NOI18N
        jLabel4.setText("Correo electrónico");

        correoUsuario.setBackground(new java.awt.Color(241, 231, 197));
        correoUsuario.setFont(new java.awt.Font("Comfortaa Light", 0, 12)); // NOI18N
        correoUsuario.setBorder(null);
        correoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoUsuarioActionPerformed(evt);
            }
        });
        correoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoUsuarioKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/padlock.png"))); // NOI18N
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("COCOGOOSE ", 0, 12)); // NOI18N
        jLabel6.setText("Contraseña");

        contrasenaUsuario.setBackground(new java.awt.Color(241, 231, 197));
        contrasenaUsuario.setFont(new java.awt.Font("Comfortaa Light", 0, 12)); // NOI18N
        contrasenaUsuario.setBorder(null);

        HIDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/hide (2).png"))); // NOI18N
        HIDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HIDEMouseClicked(evt);
            }
        });

        SHOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/show.png"))); // NOI18N
        SHOW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOWMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(182, 212, 187));
        jButton1.setFont(new java.awt.Font("COCOGOOSE ", 0, 14)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cerrar1.setFont(new java.awt.Font("mariana", 0, 18)); // NOI18N
        cerrar1.setForeground(new java.awt.Color(16, 60, 60));
        cerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar1.setText("x");
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("COCOGOOSE ", 0, 11)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serenty/imagenes/VOLVER.png"))); // NOI18N
        jLabel7.setText("VOLVER");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        AVISO.setFont(new java.awt.Font("COCOGOOSE ", 0, 12)); // NOI18N
        AVISO.setForeground(new java.awt.Color(204, 0, 0));
        AVISO.setText("Error en el correo");

        jButton2.setBackground(new java.awt.Color(182, 212, 187));
        jButton2.setFont(new java.awt.Font("COCOGOOSE ", 0, 14)); // NOI18N
        jButton2.setText("Recordar Contraseña");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AVISO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HIDE)
                                            .addComponent(SHOW)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AVISO)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(contrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HIDE)
                            .addComponent(SHOW))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String correo = correoUsuario.getText();
        String contrasena = contrasenaUsuario.getText();
        
        if (!correo.equals("")||!contrasena.equals("")) {
            if (Constantes.validarCorreo(correo)) {
                try {
                    PreparedStatement ps = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_ROLUSUARIO_CORREO_CONTRASENA, correo, contrasena));
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        String rol = rs.getString("ROL_USUARIO");

                        if (rol.equalsIgnoreCase("Paciente")) {
                            JOptionPane.showMessageDialog(null, "Iniciaste sesión correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                            PreparedStatement psId = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_IDUSUARIO_CORREO_CONTRASENA, correo, contrasena));
                            ResultSet rsId = psId.executeQuery();
                            rsId.next();
                            String id = rsId.getString("ID_USUARIO");

                            PreparedStatement psTest = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_TESTPRESENTADO_IDUSUARIO, id));
                            ResultSet rsTest = psTest.executeQuery();
                            rsTest.next();
                            String test = rsTest.getString("TEST_PRESENTADO");
                            
                            PreparedStatement psAnsi = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_ANSIEDADPACIENTE_IDUSUARIO, id));
                            ResultSet rsAnsi = psAnsi.executeQuery();
                            rsAnsi.next();
                            String ansiedad = rsAnsi.getString("ANSIEDAD_PACIENTE");

                            if (test.equals("1")) {
                                JOptionPane.showMessageDialog(null, "Ya presentaste la prueba", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                
                                if(ansiedad.equals("1")){
                                    UsuarioActivo usuarioActivo = UsuarioActivo.getInstance();
                                    String idUsuarioString = rsId.getString("ID_USUARIO");
                                    int idUsuario = Integer.parseInt(idUsuarioString);
                                    usuarioActivo.setIdUsuario(idUsuario);

                                    PrincipalPaciente principalPaciente = new PrincipalPaciente();
                                    principalPaciente.setVisible(true);
                                    this.setVisible(false);
                                }else{
                                    ConclusionPrueba conclusionPrueba = new ConclusionPrueba();
                                    conclusionPrueba.setVisible(true);
                                    this.setVisible(false);
                                }                                
                            } else {
                                UsuarioActivo usuarioActivo = UsuarioActivo.getInstance();
                                String idUsuarioString = rsId.getString("ID_USUARIO");
                                int idUsuario = Integer.parseInt(idUsuarioString);
                                usuarioActivo.setIdUsuario(idUsuario);

                                IngresoPrueba ingresoPrueba = new IngresoPrueba();
                                ingresoPrueba.setVisible(true);
                                this.setVisible(false);
                            }
                        } else if (rol.equalsIgnoreCase("Psicologo")) {
                            JOptionPane.showMessageDialog(null, "Iniciaste sesión correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                           
                            PreparedStatement psIdPsico = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_IDUSUARIO_CORREO_CONTRASENA, correo, contrasena));
                            ResultSet rsIdP = psIdPsico.executeQuery();
                            rsIdP.next();
                            
                            UsuarioActivo usuarioActivo = UsuarioActivo.getInstance();
                            String idUsuarioString = rsIdP.getString("ID_USUARIO");
                            int idUsuario = Integer.parseInt(idUsuarioString);
                            usuarioActivo.setIdUsuario(idUsuario);
                            
                            PrincipalPsicologo principalPsicologo = new PrincipalPsicologo();
                            principalPsicologo.setVisible(true);
                            this.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "Rol de usuario desconocido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                AVISO.setVisible(true);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HIDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HIDEMouseClicked
        // TODO add your handling code here:
        contrasenaUsuario.setEchoChar((char)0);

        HIDE.setVisible(false);
        HIDE.setVisible(false);
        SHOW.setVisible(true);
        SHOW.setVisible(true);
    }//GEN-LAST:event_HIDEMouseClicked

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar1MouseClicked

    private void SHOWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOWMouseClicked
        // TODO add your handling code here:
        contrasenaUsuario.setEchoChar((char)8226);

        HIDE.setVisible(true);
        HIDE.setVisible(true);
        SHOW.setVisible(false);
        SHOW.setVisible(false);
    }//GEN-LAST:event_SHOWMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        OpcionesUsuario opcionesUsuario = new OpcionesUsuario();
        opcionesUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void correoUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoUsuarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_correoUsuarioKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String correo = correoUsuario.getText();
        
        if (correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar el campo del correo", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (Constantes.validarCorreo(correo)) {
                try {
                    PreparedStatement ps = (PreparedStatement) cn.prepareStatement(String.format(ConsultasDB.SELECT_CONTRASENAUSUARIO_CORREO, correo));
                    ResultSet rs = ps.executeQuery();
                    rs.next();
                    String contra = rs.getString("CONTRASENA_USUARIO");
                    
                    jLabel8.setText("Su contraseña es: " + contra);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "No fue posible recordar la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IniciarSesion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AVISO;
    private javax.swing.JLabel HIDE;
    private javax.swing.JLabel SHOW;
    private javax.swing.JLabel cerrar1;
    private javax.swing.JPasswordField contrasenaUsuario;
    private javax.swing.JTextField correoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
