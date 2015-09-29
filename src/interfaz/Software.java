/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import BaseDatos.conexion;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import persistencia.SQLHelperSoftware;

public class Software extends javax.swing.JPanel {

    /**
     * Creates new form Software
     */
    private DefaultListModel modeloLista = new DefaultListModel();
    Connection con = new conexion().getCon();
    public Software() {
        initComponents();
        jTCaso.setLineWrap(true);     //Para que haga un salto de linea en cualquier parte de la palabra
        jTCaso.setWrapStyleWord(true); // Para que haga el salto de línea buscando espacios entre las palabras        
        jTSoluciones.setEditable(false);
        llenarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCaso = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCasos = new javax.swing.JList();
        jScrollBar1 = new javax.swing.JScrollBar();
        Publicar = new javax.swing.JPanel();
        jLabelPublicar = new javax.swing.JLabel();
        Soluciones = new javax.swing.JPanel();
        jLabelSolucion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTSoluciones = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 106, 193));
        setPreferredSize(new java.awt.Dimension(650, 530));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("¿No encuentras tu caso de Software?, ¡Publícalo!");

        jTCaso.setColumns(20);
        jTCaso.setRows(5);
        jScrollPane1.setViewportView(jTCaso);

        jListCasos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListCasos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );

        Publicar.setBackground(new java.awt.Color(0, 106, 193));
        Publicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabelPublicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPublicar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPublicar.setText("Publicar");
        jLabelPublicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPublicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPublicarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PublicarLayout = new javax.swing.GroupLayout(Publicar);
        Publicar.setLayout(PublicarLayout);
        PublicarLayout.setHorizontalGroup(
            PublicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PublicarLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabelPublicar)
                .addGap(32, 32, 32))
        );
        PublicarLayout.setVerticalGroup(
            PublicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPublicar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        Soluciones.setBackground(new java.awt.Color(0, 106, 193));
        Soluciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Soluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolucionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SolucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SolucionesMouseExited(evt);
            }
        });

        jLabelSolucion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSolucion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSolucion.setText("Soluciones");
        jLabelSolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSolucionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSolucionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SolucionesLayout = new javax.swing.GroupLayout(Soluciones);
        Soluciones.setLayout(SolucionesLayout);
        SolucionesLayout.setHorizontalGroup(
            SolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolucionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelSolucion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SolucionesLayout.setVerticalGroup(
            SolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jTSoluciones.setColumns(20);
        jTSoluciones.setRows(5);
        jScrollPane4.setViewportView(jTSoluciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Publicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Soluciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Publicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soluciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSolucionMouseClicked
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM TBLCASOS_SW");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() == jListCasos.getSelectedIndex() + 1) {
                    jTSoluciones.setText("SOLUCIONES: \n" + rs.getString(3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabelSolucionMouseClicked

    private void SolucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolucionesMouseEntered
        Soluciones.setBackground(new java.awt.Color(244, 244, 244));
        jLabelSolucion.setForeground(Color.BLACK);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_SolucionesMouseEntered

    private void SolucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolucionesMouseExited
        Soluciones.setBackground(new java.awt.Color(0, 106, 193));
        jLabelSolucion.setForeground(Color.WHITE);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_SolucionesMouseExited

    private void SolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolucionesMouseClicked
        
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM TBLCASOS_SW");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() == jListCasos.getSelectedIndex() + 1) {
                    jTSoluciones.setText("SOLUCIONES: \n" + rs.getString(3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SolucionesMouseClicked

    private void jLabelSolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSolucionMouseEntered
        Soluciones.setBackground(new java.awt.Color(244, 244, 244));
        jLabelSolucion.setForeground(Color.BLACK);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabelSolucionMouseEntered

    private void jLabelSolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSolucionMouseExited
        Soluciones.setBackground(new java.awt.Color(0, 106, 193));
        jLabelSolucion.setForeground(Color.WHITE);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabelSolucionMouseExited

    private void jLabelPublicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPublicarMouseEntered
        Publicar.setBackground(new java.awt.Color(244, 244, 244));
        jLabelPublicar.setForeground(Color.BLACK);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabelPublicarMouseEntered

    private void jLabelPublicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPublicarMouseExited
        Publicar.setBackground(new java.awt.Color(0, 106, 193));
        jLabelPublicar.setForeground(Color.WHITE);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabelPublicarMouseExited
    public void llenarLista() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM TBLCASOS_SW");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                modeloLista.addElement("ID: " + rs.getString(1) + " " + "CASO: " + rs.getString(2) + " ");
                jListCasos.setModel(modeloLista);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Publicar;
    private javax.swing.JPanel Soluciones;
    private javax.swing.JLabel jLabelPublicar;
    private javax.swing.JLabel jLabelSolucion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList jListCasos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTCaso;
    private javax.swing.JTextArea jTSoluciones;
    // End of variables declaration//GEN-END:variables
}
