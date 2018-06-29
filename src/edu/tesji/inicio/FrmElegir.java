package edu.tesji.inicio;

import edu.tesji.cliente.Archivo;
import java.awt.Toolkit;
import javax.swing.JFileChooser;

/**
 *
 * @author Navi
 */
public class FrmElegir extends javax.swing.JFrame {
    JFileChooser dl;

    public FrmElegir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        btnRecibir = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();
        btnRecibir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btnEnviar.setBackground(new java.awt.Color(0, 153, 51));
        btnEnviar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnRecibir.setBackground(new java.awt.Color(0, 153, 51));
        btnRecibir.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnRecibir.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibir.setText("Recibir");
        btnRecibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibirActionPerformed(evt);
            }
        });

        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnRecibir1.setBackground(new java.awt.Color(204, 102, 0));
        btnRecibir1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        btnRecibir1.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibir1.setText("Salir");
        btnRecibir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecibir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnEnviar)
                .addGap(31, 31, 31)
                .addComponent(btnRecibir)
                .addGap(35, 35, 35)
                .addComponent(btnRecibir1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecibir1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        this.dispose();
        Archivo nuevo = new Archivo();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibirActionPerformed
        this.dispose();
        FrmRecibir nuevo = new FrmRecibir();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnRecibirActionPerformed

    private void btnRecibir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnRecibir1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmElegir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRecibir;
    private javax.swing.JButton btnRecibir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
