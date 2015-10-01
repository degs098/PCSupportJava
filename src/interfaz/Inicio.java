/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author samsung
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    String ruta = "/imagenes/";    
    ImageIcon imagen = new ImageIcon(ruta + "Help.png");
    Software sw = new Software();
    Hardware hw = new Hardware();
    Redes rd = new Redes();
    SistemaOperativo so = new SistemaOperativo();
    Login lg = new Login();
    Bienvenida B = new Bienvenida();
    
    
    public Inicio() {
        initComponents();
        super.setLocationRelativeTo(null);        
        super.setBackground(Color.white);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(sw);
        contentPane.add(hw);
        contentPane.add(rd);
        contentPane.add(so);
        contentPane.add(lg);
        contentPane.add(B);
        
        
        setIconImage(new ImageIcon(getClass().getResource(ruta + "Help.png")).getImage());
        B.setVisible(true);
        hw.setVisible(false);
        sw.setVisible(false);
        rd.setVisible(false);
        so.setVisible(false);
        lg.setVisible(false);
        
        
        hw.setBounds(417, 75, 650, 590);
        sw.setBounds(417, 75, 650, 530);
        rd.setBounds(417, 75, 650, 590);
        so.setBounds(417, 75, 650, 590);
        lg.setBounds(690, 75, 350, 314);
        


        B.setBounds(415, 75, 650, 530);
        hw.setBounds(415, 75, 650, 530);
        sw.setBounds(415, 75, 650, 530);
        rd.setBounds(415, 75, 650, 530);
        so.setBounds(415, 75, 650, 530);
        lg.setBounds(725, 75, 350, 314);
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
        PC_Support = new javax.swing.JLabel();
        Hw = new javax.swing.JPanel();
        jLabelHardware = new javax.swing.JLabel();
        Sw = new javax.swing.JPanel();
        jLabelSoftware = new javax.swing.JLabel();
        Rd = new javax.swing.JPanel();
        jLabelRedes = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        jLabelSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        So = new javax.swing.JPanel();
        jLabelSistemaOperativo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Principal"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        PC_Support.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        PC_Support.setForeground(new java.awt.Color(0, 106, 193));
        PC_Support.setText("PC Support");
        PC_Support.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PC_SupportMouseClicked(evt);
            }
        });

        Hw.setName("Hw"); // NOI18N
        Hw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HwMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HwMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HwMouseExited(evt);
            }
        });

        jLabelHardware.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelHardware.setText("Hardware");

        javax.swing.GroupLayout HwLayout = new javax.swing.GroupLayout(Hw);
        Hw.setLayout(HwLayout);
        HwLayout.setHorizontalGroup(
            HwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HwLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelHardware)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        HwLayout.setVerticalGroup(
            HwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HwLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHardware)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Sw.setName("Hw"); // NOI18N
        Sw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SwMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SwMouseExited(evt);
            }
        });

        jLabelSoftware.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelSoftware.setText("Software");

        javax.swing.GroupLayout SwLayout = new javax.swing.GroupLayout(Sw);
        Sw.setLayout(SwLayout);
        SwLayout.setHorizontalGroup(
            SwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelSoftware)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SwLayout.setVerticalGroup(
            SwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSoftware)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rd.setName("Hw"); // NOI18N
        Rd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RdMouseExited(evt);
            }
        });

        jLabelRedes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelRedes.setText("Redes");

        javax.swing.GroupLayout RdLayout = new javax.swing.GroupLayout(Rd);
        Rd.setLayout(RdLayout);
        RdLayout.setHorizontalGroup(
            RdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RdLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelRedes)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        RdLayout.setVerticalGroup(
            RdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRedes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir.setName("Hw"); // NOI18N
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        jLabelSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelSalir.setText("Salir");

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("©2015 Politécnico Colombiano Jaime Isaza Cadavid");

        So.setName("Hw"); // NOI18N
        So.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SoMouseExited(evt);
            }
        });

        jLabelSistemaOperativo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelSistemaOperativo.setText("Sistema Operativo");

        javax.swing.GroupLayout SoLayout = new javax.swing.GroupLayout(So);
        So.setLayout(SoLayout);
        SoLayout.setHorizontalGroup(
            SoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabelSistemaOperativo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SoLayout.setVerticalGroup(
            SoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSistemaOperativo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Sw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Rd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(So, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PC_Support))
                    .addComponent(jLabel3))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC_Support))
                .addGap(55, 55, 55)
                .addComponent(Hw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(So, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 106, 193));

        Login.setBackground(new java.awt.Color(0, 106, 193));
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setText("Login");
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabelLogin)
                .addGap(32, 32, 32))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HwMouseEntered
        Hw.setBackground(new java.awt.Color(0, 106, 193));
        jLabelHardware.setForeground(new java.awt.Color(255, 255, 255));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_HwMouseEntered

    private void HwMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HwMouseExited
        Hw.setBackground(new java.awt.Color(240, 240, 240));
        jLabelHardware.setForeground(new java.awt.Color(0, 0, 0));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_HwMouseExited

    private void SwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwMouseEntered
        Sw.setBackground(new java.awt.Color(0, 106, 193));
        jLabelSoftware.setForeground(new java.awt.Color(255, 255, 255));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_SwMouseEntered

    private void SwMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwMouseExited
        Sw.setBackground(new java.awt.Color(240, 240, 240));
        jLabelSoftware.setForeground(new java.awt.Color(0, 0, 0));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_SwMouseExited

    private void RdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdMouseEntered
        Rd.setBackground(new java.awt.Color(0, 106, 193));
        jLabelRedes.setForeground(new java.awt.Color(255, 255, 255));
        setCursor(Cursor.HAND_CURSOR);        
    }//GEN-LAST:event_RdMouseEntered

    private void RdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdMouseExited
        Rd.setBackground(new java.awt.Color(240, 240, 240));
        jLabelRedes.setForeground(new java.awt.Color(0, 0, 0));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_RdMouseExited

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new java.awt.Color(0, 106, 193));
        jLabelSalir.setForeground(new java.awt.Color(255, 255, 255));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new java.awt.Color(240, 240, 240));
        jLabelSalir.setForeground(new java.awt.Color(0, 0, 0));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_SalirMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la aplicación?", "Salir", JOptionPane.YES_NO_OPTION,0);

        if (JOptionPane.YES_OPTION == confirmar) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(new java.awt.Color(244, 244, 244));
        jLabelLogin.setForeground(Color.BLACK);
        setCursor(Cursor.HAND_CURSOR);
                
    }//GEN-LAST:event_LoginMouseEntered


    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(new java.awt.Color(0, 106, 193));
        jLabelLogin.setForeground(Color.WHITE);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_LoginMouseExited


    private void SwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwMouseClicked
        B.setVisible(false);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(true);
        so.setVisible(false);
        lg.setVisible(false);
    }//GEN-LAST:event_SwMouseClicked

    private void HwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HwMouseClicked
        B.setVisible(false);
        rd.setVisible(false);
        hw.setVisible(true);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(false);
    }//GEN-LAST:event_HwMouseClicked

    private void RdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdMouseClicked
        B.setVisible(false);
        rd.setVisible(true);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(false);
    }//GEN-LAST:event_RdMouseClicked

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        B.setVisible(false);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(true);
              
    }//GEN-LAST:event_jLabelLoginMouseClicked
    
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        B.setVisible(false);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(true);
               
    }//GEN-LAST:event_LoginMouseClicked

    private void jLabelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseEntered
        Login.setBackground(new java.awt.Color(244, 244, 244));
        jLabelLogin.setForeground(Color.BLACK);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_jLabelLoginMouseEntered

    private void jLabelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseExited
        Login.setBackground(new java.awt.Color(0, 106, 193));
        jLabelLogin.setForeground(Color.WHITE);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_jLabelLoginMouseExited

    private void PC_SupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PC_SupportMouseClicked
        B.setVisible(true);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(false);
        
    }//GEN-LAST:event_PC_SupportMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        B.setVisible(true);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(false);
        lg.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void SoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoMouseClicked
        B.setVisible(false);
        rd.setVisible(false);
        hw.setVisible(false);
        sw.setVisible(false);
        so.setVisible(true);
        lg.setVisible(false);
    }//GEN-LAST:event_SoMouseClicked

    private void SoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoMouseEntered
        So.setBackground(new java.awt.Color(0, 106, 193));
        jLabelSistemaOperativo.setForeground(new java.awt.Color(255, 255, 255));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_SoMouseEntered

    private void SoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoMouseExited
        So.setBackground(new java.awt.Color(240, 240, 240));
        jLabelSistemaOperativo.setForeground(new java.awt.Color(0, 0, 0));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_SoMouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hw;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel PC_Support;
    private javax.swing.JPanel Rd;
    private javax.swing.JPanel Salir;
    private javax.swing.JPanel So;
    private javax.swing.JPanel Sw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelHardware;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelRedes;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSistemaOperativo;
    private javax.swing.JLabel jLabelSoftware;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
