
package UI;

import Logica.prueba2;
import Datos.*;
public class ConsultarInfoFrame extends javax.swing.JFrame {

    public ConsultarInfoFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarNota = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota1 = new javax.swing.JPanel();
        jLabelTituloConsultarNota1 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota1 = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota1 = new javax.swing.JPanel();
        jButtonSalirConsultarNota1 = new javax.swing.JButton();
        jButtonVolverConsultarNota1 = new javax.swing.JButton();
        jLabelIngresarNombreConsultarNota1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoInfopersonal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota1.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota1.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota1.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota1.setText("CONSULTAR INFORMACIÓN ");

        jSeparator62.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarNota1.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarNota1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarNota1.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarNota1Layout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarNota1);
        jPanelEncabezadoConsultarNota1.setLayout(jPanelEncabezadoConsultarNota1Layout);
        jPanelEncabezadoConsultarNota1Layout.setHorizontalGroup(
            jPanelEncabezadoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarNota1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloConsultarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaConsultarNota1)
                .addGap(27, 27, 27))
        );
        jPanelEncabezadoConsultarNota1Layout.setVerticalGroup(
            jPanelEncabezadoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator62, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarNota1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloConsultarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoConsultarNota1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMiniSiaConsultarNota1)
                .addContainerGap())
        );

        jPanelPiePaginaConsultarNota1.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota1.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota1.setText("SALIR");
        jButtonSalirConsultarNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNota1ActionPerformed(evt);
            }
        });

        jButtonVolverConsultarNota1.setText("VOLVER");
        jButtonVolverConsultarNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConsultarNota1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNota1Layout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota1);
        jPanelPiePaginaConsultarNota1.setLayout(jPanelPiePaginaConsultarNota1Layout);
        jPanelPiePaginaConsultarNota1Layout.setHorizontalGroup(
            jPanelPiePaginaConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverConsultarNota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirConsultarNota1)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNota1Layout.setVerticalGroup(
            jPanelPiePaginaConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultarNota1)
                    .addComponent(jButtonVolverConsultarNota1))
                .addContainerGap())
        );

        jLabelIngresarNombreConsultarNota1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelIngresarNombreConsultarNota1.setText("Esto es lo que el sistema sabe de ti:");

        campoInfopersonal.setColumns(20);
        campoInfopersonal.setRows(5);
        jScrollPane1.setViewportView(campoInfopersonal);

        javax.swing.GroupLayout jPanelFondoConsultarNotaLayout = new javax.swing.GroupLayout(jPanelFondoConsultarNota);
        jPanelFondoConsultarNota.setLayout(jPanelFondoConsultarNotaLayout);
        jPanelFondoConsultarNotaLayout.setHorizontalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addComponent(jLabelIngresarNombreConsultarNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelFondoConsultarNotaLayout.setVerticalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelIngresarNombreConsultarNota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPiePaginaConsultarNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelFondoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirConsultarNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNota1ActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirConsultarNota1ActionPerformed

    private void jButtonVolverConsultarNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConsultarNota1ActionPerformed
        // TODO add your handling code here:
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            prueba2.CrearInterfazEst();
        }else{
            if(user.getClass() == Profesor.class){
                prueba2.CrearInterfazProf();
            }else{
                prueba2.CrearInterfazPapa();
            }
        }
        this.dispose();
    }//GEN-LAST:event_jButtonVolverConsultarNota1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarInfoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea campoInfopersonal;
    private javax.swing.JButton jButtonSalirConsultarNota1;
    private javax.swing.JButton jButtonVolverConsultarNota1;
    private javax.swing.JLabel jLabelIngresarNombreConsultarNota1;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota1;
    private javax.swing.JLabel jLabelTituloConsultarNota1;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota1;
    private javax.swing.JPanel jPanelFondoConsultarNota;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    // End of variables declaration//GEN-END:variables
}
