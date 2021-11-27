
package UI;

import Datos.Estudiante;
import Datos.Papito;
import Datos.Profesor;
import Logica.prueba2;
import Logica.Actualizaciones;

public class CambiarClaveFrame extends javax.swing.JFrame {

    public CambiarClaveFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarNota1 = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota = new javax.swing.JPanel();
        jLabelTituloConsultarNota = new javax.swing.JLabel();
        jSeparator060 = new javax.swing.JSeparator();
        jSeparator061 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota = new javax.swing.JPanel();
        jButtonSalirConsultarNota = new javax.swing.JButton();
        jButtonVolverConsultarNota = new javax.swing.JButton();
        jLabelIngresarNombreConsultarNota = new javax.swing.JLabel();
        buttonClaveNueva = new javax.swing.JButton();
        fieldClaveNueva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota1.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota1.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota.setText("CAMBIAR CLAVE");

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
                    .addComponent(jLabelTituloConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator061, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaConsultarNota)
                .addContainerGap(29, Short.MAX_VALUE))
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
        jLabelIngresarNombreConsultarNota.setText("Ingrese una clave nueva:");

        buttonClaveNueva.setText("CAMBIAR");
        buttonClaveNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClaveNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoConsultarNota1Layout = new javax.swing.GroupLayout(jPanelFondoConsultarNota1);
        jPanelFondoConsultarNota1.setLayout(jPanelFondoConsultarNota1Layout);
        jPanelFondoConsultarNota1Layout.setHorizontalGroup(
            jPanelFondoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNota1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelFondoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNota1Layout.createSequentialGroup()
                        .addComponent(jLabelIngresarNombreConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 137, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNota1Layout.createSequentialGroup()
                        .addComponent(fieldClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        jPanelFondoConsultarNota1Layout.setVerticalGroup(
            jPanelFondoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNota1Layout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabelIngresarNombreConsultarNota)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoConsultarNota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoConsultarNota1, java.awt.BorderLayout.CENTER);

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
                prueba2.CrearInterfazProf();
            }else{
                prueba2.CrearInterfazPapa();
            }
        }
    }//GEN-LAST:event_jButtonVolverConsultarNotaActionPerformed

    private void buttonClaveNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClaveNuevaActionPerformed
        // TODO add your handling code here:
        Actualizaciones asignador = new Actualizaciones();
        String clave = fieldClaveNueva.getText();
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            Estudiante userDef = (Estudiante) user; 
            asignador.cambioClave(userDef, clave);
        }else{
            if(user.getClass() == Profesor.class){
                Profesor userDef = (Profesor) user; 
                asignador.cambioClave(userDef, clave);
            }else{
                Papito userDef = (Papito) user; 
                asignador.cambioClave(userDef, clave);
                //System.out.println(userDef.getClave());
            }        
        }
        
        
        
        
    }//GEN-LAST:event_buttonClaveNuevaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarClaveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClaveNueva;
    private javax.swing.JTextField fieldClaveNueva;
    private javax.swing.JButton jButtonSalirConsultarNota;
    private javax.swing.JButton jButtonVolverConsultarNota;
    private javax.swing.JLabel jLabelIngresarNombreConsultarNota;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota;
    private javax.swing.JLabel jLabelTituloConsultarNota;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota;
    private javax.swing.JPanel jPanelFondoConsultarNota1;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota;
    private javax.swing.JSeparator jSeparator060;
    private javax.swing.JSeparator jSeparator061;
    // End of variables declaration//GEN-END:variables
}
