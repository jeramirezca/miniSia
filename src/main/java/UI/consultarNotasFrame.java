
package UI;
import Logica.prueba2;
import Datos. *;

public class ConsultarNotasFrame extends javax.swing.JFrame {


    public ConsultarNotasFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarNota = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota = new javax.swing.JPanel();
        jLabelTituloConsultarNota = new javax.swing.JLabel();
        jSeparator060 = new javax.swing.JSeparator();
        jSeparator061 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota = new javax.swing.JPanel();
        jButtonSalirConsultarNota = new javax.swing.JButton();
        jButtonVolverConsultarNota = new javax.swing.JButton();
        jLabelIngresarNombreConsultarNota = new javax.swing.JLabel();
        jButtonBuscarConsultarNota = new javax.swing.JButton();
        jTextField060 = new javax.swing.JTextField();
        jLabelResultadoConsultarNota = new javax.swing.JLabel();
        jLabelInstruc1ConsultarNota = new javax.swing.JLabel();
        jLabelInstruct2ConsultarNota = new javax.swing.JLabel();
        jLabelInstruct3ConsultarNota = new javax.swing.JLabel();
        jLabelInstruct4ConsultarNota = new javax.swing.JLabel();
        jTextField061 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota.setText("CONSULTAR NOTA");

        jSeparator061.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarNota.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarNota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarNota.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarNotaLayout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarNota);
        jPanelEncabezadoConsultarNota.setLayout(jPanelEncabezadoConsultarNotaLayout);
        jPanelEncabezadoConsultarNotaLayout.setHorizontalGroup(
            jPanelEncabezadoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator060, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloConsultarNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator061, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaConsultarNota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoConsultarNotaLayout.setVerticalGroup(
            jPanelEncabezadoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator061, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator060, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMiniSiaConsultarNota)
                .addContainerGap())
        );

        jPanelPiePaginaConsultarNota.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota.setText("SALIR");
        jButtonSalirConsultarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNotaActionPerformed(evt);
            }
        });

        jButtonVolverConsultarNota.setText("VOLVER");
        jButtonVolverConsultarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConsultarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNotaLayout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota);
        jPanelPiePaginaConsultarNota.setLayout(jPanelPiePaginaConsultarNotaLayout);
        jPanelPiePaginaConsultarNotaLayout.setHorizontalGroup(
            jPanelPiePaginaConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverConsultarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirConsultarNota)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNotaLayout.setVerticalGroup(
            jPanelPiePaginaConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNotaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultarNota)
                    .addComponent(jButtonVolverConsultarNota))
                .addContainerGap())
        );

        jLabelIngresarNombreConsultarNota.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelIngresarNombreConsultarNota.setText("Ingrese el nombre de la materia:");

        jButtonBuscarConsultarNota.setText("BUSCAR");
        jButtonBuscarConsultarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarConsultarNotaActionPerformed(evt);
            }
        });

        jLabelResultadoConsultarNota.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelResultadoConsultarNota.setText("RESULTADO");

        jLabelInstruc1ConsultarNota.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jLabelInstruc1ConsultarNota.setText("Si no ingresa la materia que");

        jLabelInstruct2ConsultarNota.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jLabelInstruct2ConsultarNota.setText("desea buscar el sistema le ");

        jLabelInstruct3ConsultarNota.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jLabelInstruct3ConsultarNota.setText("mostrará la nota de todas");

        jLabelInstruct4ConsultarNota.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        jLabelInstruct4ConsultarNota.setText("las materias inscritas");

        javax.swing.GroupLayout jPanelFondoConsultarNotaLayout = new javax.swing.GroupLayout(jPanelFondoConsultarNota);
        jPanelFondoConsultarNota.setLayout(jPanelFondoConsultarNotaLayout);
        jPanelFondoConsultarNotaLayout.setHorizontalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                                .addComponent(jTextField060, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonBuscarConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelIngresarNombreConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelResultadoConsultarNota)
                            .addComponent(jTextField061, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstruc1ConsultarNota)
                            .addComponent(jLabelInstruct2ConsultarNota)
                            .addComponent(jLabelInstruct4ConsultarNota)
                            .addComponent(jLabelInstruct3ConsultarNota))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanelFondoConsultarNotaLayout.setVerticalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelIngresarNombreConsultarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField060, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultadoConsultarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addComponent(jTextField061)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addComponent(jLabelInstruc1ConsultarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabelInstruct2ConsultarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInstruct3ConsultarNota)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelInstruct4ConsultarNota)
                        .addGap(23, 23, 23)))
                .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirConsultarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNotaActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirConsultarNotaActionPerformed

    private void jButtonVolverConsultarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConsultarNotaActionPerformed
        // TODO add your handling code here:
        
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            prueba2.CrearInterfazEst();
        }else{
            if(user.getClass() == Profesor.class){
                prueba2.CrearInterfazProf();;
            }else{
                prueba2.CrearInterfazPapa();
            }
        }
        this.dispose();
    }//GEN-LAST:event_jButtonVolverConsultarNotaActionPerformed

    private void jButtonBuscarConsultarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarConsultarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarConsultarNotaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarNotasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarConsultarNota;
    private javax.swing.JButton jButtonSalirConsultarNota;
    private javax.swing.JButton jButtonVolverConsultarNota;
    private javax.swing.JLabel jLabelIngresarNombreConsultarNota;
    private javax.swing.JLabel jLabelInstruc1ConsultarNota;
    private javax.swing.JLabel jLabelInstruct2ConsultarNota;
    private javax.swing.JLabel jLabelInstruct3ConsultarNota;
    private javax.swing.JLabel jLabelInstruct4ConsultarNota;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota;
    private javax.swing.JLabel jLabelResultadoConsultarNota;
    private javax.swing.JLabel jLabelTituloConsultarNota;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota;
    private javax.swing.JPanel jPanelFondoConsultarNota;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota;
    private javax.swing.JSeparator jSeparator060;
    private javax.swing.JSeparator jSeparator061;
    private javax.swing.JTextField jTextField060;
    private javax.swing.JTextField jTextField061;
    // End of variables declaration//GEN-END:variables
}
