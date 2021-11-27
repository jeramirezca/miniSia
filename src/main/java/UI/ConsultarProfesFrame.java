/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Logica.prueba2;
import Datos.Estudiante;

public class ConsultarProfesFrame extends javax.swing.JFrame {

    public ConsultarProfesFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarNota5 = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota5 = new javax.swing.JPanel();
        jLabelTituloConsultarNota5 = new javax.swing.JLabel();
        jSeparator69 = new javax.swing.JSeparator();
        jSeparator70 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota5 = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota5 = new javax.swing.JPanel();
        jButtonSalirConsultarNota5 = new javax.swing.JButton();
        jButtonVolverConsultarNota5 = new javax.swing.JButton();
        jLabelIngresarNombreConsultarNota3 = new javax.swing.JLabel();
        jTextField64 = new javax.swing.JTextField();
        jButtonSiguienteEst = new javax.swing.JButton();
        jButtonAnteriorEst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota5.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota5.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota5.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota5.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota5.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota5.setText("PROFESORES");

        jSeparator70.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarNota5.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarNota5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarNota5.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarNota5Layout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarNota5);
        jPanelEncabezadoConsultarNota5.setLayout(jPanelEncabezadoConsultarNota5Layout);
        jPanelEncabezadoConsultarNota5Layout.setHorizontalGroup(
            jPanelEncabezadoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarNota5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator69, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloConsultarNota5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator70, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaConsultarNota5)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelEncabezadoConsultarNota5Layout.setVerticalGroup(
            jPanelEncabezadoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator70, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarNota5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloConsultarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator69, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoConsultarNota5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMiniSiaConsultarNota5)
                .addContainerGap())
        );

        jPanelPiePaginaConsultarNota5.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota5.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota5.setText("SALIR");
        jButtonSalirConsultarNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNota5ActionPerformed(evt);
            }
        });

        jButtonVolverConsultarNota5.setText("VOLVER");
        jButtonVolverConsultarNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConsultarNota5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNota5Layout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota5);
        jPanelPiePaginaConsultarNota5.setLayout(jPanelPiePaginaConsultarNota5Layout);
        jPanelPiePaginaConsultarNota5Layout.setHorizontalGroup(
            jPanelPiePaginaConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverConsultarNota5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirConsultarNota5)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNota5Layout.setVerticalGroup(
            jPanelPiePaginaConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultarNota5)
                    .addComponent(jButtonVolverConsultarNota5))
                .addContainerGap())
        );

        jLabelIngresarNombreConsultarNota3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelIngresarNombreConsultarNota3.setText("Profesores del estudiante ");

        jButtonSiguienteEst.setText("Sig. >");

        jButtonAnteriorEst.setText("< Ant.");

        javax.swing.GroupLayout jPanelFondoConsultarNota5Layout = new javax.swing.GroupLayout(jPanelFondoConsultarNota5);
        jPanelFondoConsultarNota5.setLayout(jPanelFondoConsultarNota5Layout);
        jPanelFondoConsultarNota5Layout.setHorizontalGroup(
            jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                        .addComponent(jLabelIngresarNombreConsultarNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                        .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarNota5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAnteriorEst)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSiguienteEst, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelFondoConsultarNota5Layout.setVerticalGroup(
            jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelIngresarNombreConsultarNota3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSiguienteEst)
                            .addComponent(jButtonAnteriorEst))))
                .addGap(17, 17, 17)
                .addComponent(jPanelPiePaginaConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirConsultarNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNota5ActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirConsultarNota5ActionPerformed

    private void jButtonVolverConsultarNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConsultarNota5ActionPerformed
        // TODO add your handling code here:
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            prueba2.CrearInterfazEst();
        }else{
            prueba2.CrearInterfazPapa();
        }
        this.dispose();
    }//GEN-LAST:event_jButtonVolverConsultarNota5ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarProfesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProfesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarProfesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnteriorEst;
    private javax.swing.JButton jButtonSalirConsultarNota5;
    private javax.swing.JButton jButtonSiguienteEst;
    private javax.swing.JButton jButtonVolverConsultarNota5;
    private javax.swing.JLabel jLabelIngresarNombreConsultarNota3;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota5;
    private javax.swing.JLabel jLabelTituloConsultarNota5;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota5;
    private javax.swing.JPanel jPanelFondoConsultarNota5;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota5;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JTextField jTextField64;
    // End of variables declaration//GEN-END:variables
}
