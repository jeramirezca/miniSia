
package UI;

import Datos.Estudiante;
import Logica.prueba2;
import Logica.asignar;
import Datos.Subsidio;
import java.util.ArrayList;


public class PedirSubsidioFrame extends javax.swing.JFrame {


    public PedirSubsidioFrame() {
        initComponents();
        meterElementos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubsidioPedido = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelFondoConsultarNota8 = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota9 = new javax.swing.JPanel();
        jLabelTituloConsultarNota9 = new javax.swing.JLabel();
        jSeparator77 = new javax.swing.JSeparator();
        jSeparator78 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota9 = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota6 = new javax.swing.JPanel();
        jButtonSalirConsultarNota6 = new javax.swing.JButton();
        jButtonVolverConsultarNota6 = new javax.swing.JButton();
        buttonEditarsubsidio = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanelPiePaginaConsultarNota8 = new javax.swing.JPanel();
        jButtonSalirConsultarNota8 = new javax.swing.JButton();
        jButtonVolverConsultarNota9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("AHORA ES BENEFICIARIO DE ESTE SUBSIDIO !!");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubsidioPedidoLayout = new javax.swing.GroupLayout(SubsidioPedido.getContentPane());
        SubsidioPedido.getContentPane().setLayout(SubsidioPedidoLayout);
        SubsidioPedidoLayout.setHorizontalGroup(
            SubsidioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubsidioPedidoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(SubsidioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubsidioPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubsidioPedidoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );
        SubsidioPedidoLayout.setVerticalGroup(
            SubsidioPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubsidioPedidoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota8.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota8.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota9.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota9.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota9.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota9.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota9.setText("PEDIR SUBSIDIO");

        jSeparator78.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarNota9.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarNota9.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarNota9.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarNota9Layout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarNota9);
        jPanelEncabezadoConsultarNota9.setLayout(jPanelEncabezadoConsultarNota9Layout);
        jPanelEncabezadoConsultarNota9Layout.setHorizontalGroup(
            jPanelEncabezadoConsultarNota9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarNota9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarNota9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator77, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloConsultarNota9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator78, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaConsultarNota9)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelEncabezadoConsultarNota9Layout.setVerticalGroup(
            jPanelEncabezadoConsultarNota9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator78, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarNota9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloConsultarNota9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator77, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoConsultarNota9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMiniSiaConsultarNota9)
                .addContainerGap())
        );

        jPanelPiePaginaConsultarNota6.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota6.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota6.setText("SALIR");
        jButtonSalirConsultarNota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNota6ActionPerformed(evt);
            }
        });

        jButtonVolverConsultarNota6.setText("VOLVER");
        jButtonVolverConsultarNota6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConsultarNota6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNota6Layout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota6);
        jPanelPiePaginaConsultarNota6.setLayout(jPanelPiePaginaConsultarNota6Layout);
        jPanelPiePaginaConsultarNota6Layout.setHorizontalGroup(
            jPanelPiePaginaConsultarNota6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverConsultarNota6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirConsultarNota6)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNota6Layout.setVerticalGroup(
            jPanelPiePaginaConsultarNota6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarNota6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultarNota6)
                    .addComponent(jButtonVolverConsultarNota6))
                .addContainerGap())
        );

        buttonEditarsubsidio.setText("CONFIRMAR SUBSIDIO");
        buttonEditarsubsidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarsubsidioActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jPanelPiePaginaConsultarNota8.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota8.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota8.setText("SALIR");
        jButtonSalirConsultarNota8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNota8ActionPerformed(evt);
            }
        });

        jButtonVolverConsultarNota9.setText("VOLVER");
        jButtonVolverConsultarNota9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverConsultarNota9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNota8Layout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota8);
        jPanelPiePaginaConsultarNota8.setLayout(jPanelPiePaginaConsultarNota8Layout);
        jPanelPiePaginaConsultarNota8Layout.setHorizontalGroup(
            jPanelPiePaginaConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverConsultarNota9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirConsultarNota8)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNota8Layout.setVerticalGroup(
            jPanelPiePaginaConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultarNota8)
                    .addComponent(jButtonVolverConsultarNota9))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("DURACIÓN SEMESTRES:");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("SUBSIDIO:");

        javax.swing.GroupLayout jPanelFondoConsultarNota8Layout = new javax.swing.GroupLayout(jPanelFondoConsultarNota8);
        jPanelFondoConsultarNota8.setLayout(jPanelFondoConsultarNota8Layout);
        jPanelFondoConsultarNota8Layout.setHorizontalGroup(
            jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota9, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota6, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarNota8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEditarsubsidio)
                .addGap(36, 36, 36))
            .addComponent(jPanelPiePaginaConsultarNota8, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNota8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47))
        );
        jPanelFondoConsultarNota8Layout.setVerticalGroup(
            jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNota8Layout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(jPanelFondoConsultarNota8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(buttonEditarsubsidio)
                .addGap(31, 31, 31)
                .addComponent(jPanelPiePaginaConsultarNota8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(jPanelPiePaginaConsultarNota6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoConsultarNota8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoConsultarNota8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirConsultarNota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNota6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirConsultarNota6ActionPerformed

    private void jButtonVolverConsultarNota6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConsultarNota6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverConsultarNota6ActionPerformed

    private void buttonEditarsubsidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarsubsidioActionPerformed
        // TODO add your handling code here:
        asignar asignador = new asignar();
        String seleccionTipo = jComboBox3.getSelectedItem().toString();
        String seleccionTiempo = jComboBox2.getSelectedItem().toString();
        Subsidio encontrado = asignador.buscarSubsidio(seleccionTipo, prueba2.subsidios);
        encontrado.setDuracionSemestres(Integer.valueOf(seleccionTiempo));
        if(encontrado.getTipo() != "desconocido"){
            Estudiante estudiante = (Estudiante) LoginMain.usuarioActual.get(0);
            asignador.asignarSubsidio(estudiante, encontrado);
            System.out.println(estudiante.getSubsidios());
            Exito();
        }
    }//GEN-LAST:event_buttonEditarsubsidioActionPerformed

    private void jButtonSalirConsultarNota8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNota8ActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
        
    }//GEN-LAST:event_jButtonSalirConsultarNota8ActionPerformed

    private void jButtonVolverConsultarNota9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverConsultarNota9ActionPerformed
        // TODO add your handling code here:
        prueba2.CrearInterfazEst();
        this.dispose();     
    }//GEN-LAST:event_jButtonVolverConsultarNota9ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SubsidioPedido.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void meterElementos(){
        ArrayList<Subsidio> subsidios = prueba2.subsidios;
        for( Subsidio subsidio : subsidios){
            jComboBox3.addItem(subsidio.getTipo());
        }
    }
    
    public void Exito(){
        SubsidioPedido.setVisible(true);
        SubsidioPedido.locate(700, 700);
        SubsidioPedido.setSize(500,200);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedirSubsidioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SubsidioPedido;
    private javax.swing.JButton buttonEditarsubsidio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalirConsultarNota6;
    private javax.swing.JButton jButtonSalirConsultarNota8;
    private javax.swing.JButton jButtonVolverConsultarNota6;
    private javax.swing.JButton jButtonVolverConsultarNota9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota9;
    private javax.swing.JLabel jLabelTituloConsultarNota9;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota9;
    private javax.swing.JPanel jPanelFondoConsultarNota8;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota6;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota8;
    private javax.swing.JSeparator jSeparator77;
    private javax.swing.JSeparator jSeparator78;
    // End of variables declaration//GEN-END:variables
}
