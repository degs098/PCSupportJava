/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import negocios.UsuarioN;
import static persistencia.SQLHelper.getValidarIngreso;

/**
 *
 * @author zamuel
 */
public class Ingresar extends javax.swing.JPanel {

    /**
     * Creates new form Software,
     */
    public Ingresar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        Cancelar = new javax.swing.JPanel();
        jLabelCancelar = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 106, 193));
        setPreferredSize(new java.awt.Dimension(650, 530));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PC Support");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");

        Aceptar.setBackground(new java.awt.Color(0, 106, 193));
        Aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Aceptar.setPreferredSize(new java.awt.Dimension(107, 39));
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AceptarMouseExited(evt);
            }
        });

        jLabelAceptar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout AceptarLayout = new javax.swing.GroupLayout(Aceptar);
        Aceptar.setLayout(AceptarLayout);
        AceptarLayout.setHorizontalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AceptarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelAceptar)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        AceptarLayout.setVerticalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Cancelar.setBackground(new java.awt.Color(0, 106, 193));
        Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarMouseExited(evt);
            }
        });

        jLabelCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCancelar.setText("Cancelar");
        jLabelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelCancelar)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCancelar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Help.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3))))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)))
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseEntered

        Aceptar.setBackground(new java.awt.Color(244, 244, 244));
        jLabelAceptar.setForeground(Color.black);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Aceptar.setBorder(BorderFactory.createLineBorder(Color.black));


    }//GEN-LAST:event_AceptarMouseEntered

    private void AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseExited
        Aceptar.setBackground(new java.awt.Color(0, 106, 193));
        jLabelAceptar.setForeground(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Aceptar.setBorder(BorderFactory.createLineBorder(Color.white));

        
    }//GEN-LAST:event_AceptarMouseExited

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Cancelar.setBackground(new java.awt.Color(244, 244, 244));
        jLabelCancelar.setForeground(Color.black);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Cancelar.setBorder(BorderFactory.createLineBorder(Color.black));
        
    }//GEN-LAST:event_CancelarMouseEntered

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Cancelar.setBackground(new java.awt.Color(0, 106, 193));
        jLabelCancelar.setForeground(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Cancelar.setBorder(BorderFactory.createLineBorder(Color.white));
    }//GEN-LAST:event_CancelarMouseExited

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        super.setVisible(false);
        Bienvenida b = new Bienvenida();
        b.setVisible(true);
    }//GEN-LAST:event_CancelarMouseClicked

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        // TODO add your handling code here:
        String user = txtUsuario.getText();
        String pwd = txtClave.getText();
        UsuarioN un = new UsuarioN();
        Usuario u = new Usuario();

        u = un.validarIngreso(user, pwd);
        
        if (user.length() == 0 || pwd.length() == 0) {
            JOptionPane.showMessageDialog(null, "Clave y/o usuario vacios", "Error", 0);
        } else {

            if (u.getUsuario() != "0") {
                if(u.getPerfil().equals("Administrador")){
                    ((java.awt.Window) getRootPane().getParent()).dispose();
                    InicioAdministrador ia = new InicioAdministrador();
                    ia.setVisible(true);
                }else{
                    ((java.awt.Window) getRootPane().getParent()).dispose();
                    InicioSoporte is = new InicioSoporte();
                    is.setVisible(true);
                }
            } else {
                this.setVisible(true);

            }
        }
    }//GEN-LAST:event_AceptarMouseClicked

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        super.setVisible(false);
        Bienvenida b = new Bienvenida();
        b.setVisible(true);
        txtUsuario.setText("");
        txtClave.setText("");
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void jLabelCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseEntered
        CancelarMouseEntered(evt);
    }//GEN-LAST:event_jLabelCancelarMouseEntered

    private void jLabelCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseExited
        CancelarMouseExited(evt);
    }//GEN-LAST:event_jLabelCancelarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aceptar;
    private javax.swing.JPanel Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
     
}
