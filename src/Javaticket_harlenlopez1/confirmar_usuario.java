/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Javaticket_harlenlopez1;

import static Javaticket_harlenlopez1.Crear_Usuario.users;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class confirmar_usuario extends javax.swing.JFrame {

    /**
     * Creates new form confirmar_usuario
     */
    public confirmar_usuario() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public static String usuarioLogin="";
    public static String contraseñaLogin="";
    public static int pos=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioTextbox = new javax.swing.JTextField();
        PasswordTextbox = new javax.swing.JPasswordField();
        backgroundLabel = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(UsuarioTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 283, -1));
        getContentPane().add(PasswordTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 283, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/confirmar_usuario.png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 566, 272));

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 60));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
        usuarioLogin=UsuarioTextbox.getText();
        contraseñaLogin=PasswordTextbox.getText();
        boolean noExiste=false;
        if(usuarioLogin.isEmpty()||contraseñaLogin.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, llenar todos los campos.");
        }else{
        for(int indice=0;indice<users.size();indice++){
            if(users.get(indice)!=null){
                if(users.get(indice).getUser().equals(usuarioLogin)){
                    if(users.get(indice).getPassword().equals(contraseñaLogin)){
                        if(users.get(indice).getTipo()==0){
                            noExiste=true;
                        }else{
                        pos=indice;
                        noExiste=false;
                        Editar_Usuario pasar=new Editar_Usuario();
                        pasar.setVisible(true);
                        this.setVisible(false);
                        break;
                        }
                    }else{
                        noExiste=true;
                    }
                }else{
                    noExiste=true;
                }
            }
        }
        if(noExiste==true){
            JOptionPane.showMessageDialog(null, "Usuario no existe.");
        }
    }  
    }//GEN-LAST:event_IngresarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        Administracion_de_usuarios pasar=new Administracion_de_usuarios();
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(confirmar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirmar_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Ingresar;
    private javax.swing.JPasswordField PasswordTextbox;
    private javax.swing.JTextField UsuarioTextbox;
    private javax.swing.JLabel backgroundLabel;
    // End of variables declaration//GEN-END:variables
}
