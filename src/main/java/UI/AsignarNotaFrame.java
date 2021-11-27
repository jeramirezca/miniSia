
package UI;

import java.util.HashMap;
import Logica.prueba2;
import Logica.asignar;
import Datos.*;

public class AsignarNotaFrame extends javax.swing.JFrame {
    
//Grupo que se irá a buscar
    
    Grupo grupo = new Grupo();
    
    public AsignarNotaFrame() {
        initComponents();
        this.setSize(500, 400);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosErroneos = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        grupoEncontrado = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanelFondoAsignarNota = new javax.swing.JPanel();
        jPanelEncabezadoAsignarNota = new javax.swing.JPanel();
        jLabelTituloAsignarNota = new javax.swing.JLabel();
        jSeparator0130 = new javax.swing.JSeparator();
        jSeparator0131 = new javax.swing.JSeparator();
        jLabelMiniSiaAsignarrNota = new javax.swing.JLabel();
        jPanelPiePAginaInscribirNota = new javax.swing.JPanel();
        jButtonSalirAsignarNota = new javax.swing.JButton();
        jButtonVolverAsignarNota = new javax.swing.JButton();
        jTextField0130 = new javax.swing.JTextField();
        jLabelNumGrupAsignarNota = new javax.swing.JLabel();
        jTextField0131 = new javax.swing.JTextField();
        jLabelEstudianteAsignarNota = new javax.swing.JLabel();
        jLabelNotaAsignarNota = new javax.swing.JLabel();
        jTextField0132 = new javax.swing.JTextField();
        jButtonBuscarAsignarNota = new javax.swing.JButton();
        jButtonAsignarAsignarNota = new javax.swing.JButton();
        jLabelComprobanteAsignarNota = new javax.swing.JLabel();
        jTextField0133 = new javax.swing.JTextField();
        ACEPTARAsigNota = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("LO SENTIMOS, NO SE HA ENCONTRADO LO QUE BUSCABAS");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("INTENTALO DE NUEVO");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosErroneosLayout = new javax.swing.GroupLayout(DatosErroneos.getContentPane());
        DatosErroneos.getContentPane().setLayout(DatosErroneosLayout);
        DatosErroneosLayout.setHorizontalGroup(
            DatosErroneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosErroneosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosErroneosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
            .addGroup(DatosErroneosLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DatosErroneosLayout.setVerticalGroup(
            DatosErroneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosErroneosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setText("GRUPO ENCONTRADO, AHORA DILIGENCIA LOS OTROS CAMPOS");

        jButton2.setText("ACEPTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grupoEncontradoLayout = new javax.swing.GroupLayout(grupoEncontrado.getContentPane());
        grupoEncontrado.getContentPane().setLayout(grupoEncontradoLayout);
        grupoEncontradoLayout.setHorizontalGroup(
            grupoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoEncontradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grupoEncontradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        grupoEncontradoLayout.setVerticalGroup(
            grupoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grupoEncontradoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoAsignarNota.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoAsignarNota.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoAsignarNota.setBackground(new java.awt.Color(239, 123, 69));

        jLabelTituloAsignarNota.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabelTituloAsignarNota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloAsignarNota.setText("ASIGNAR NOTA");

        jSeparator0131.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaAsignarrNota.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaAsignarrNota.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaAsignarrNota.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoAsignarNotaLayout = new javax.swing.GroupLayout(jPanelEncabezadoAsignarNota);
        jPanelEncabezadoAsignarNota.setLayout(jPanelEncabezadoAsignarNotaLayout);
        jPanelEncabezadoAsignarNotaLayout.setHorizontalGroup(
            jPanelEncabezadoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoAsignarNotaLayout.createSequentialGroup()
                .addGroup(jPanelEncabezadoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator0130, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEncabezadoAsignarNotaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloAsignarNota)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator0131, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaAsignarrNota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoAsignarNotaLayout.setVerticalGroup(
            jPanelEncabezadoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator0131)
            .addGroup(jPanelEncabezadoAsignarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoAsignarNotaLayout.createSequentialGroup()
                        .addComponent(jLabelTituloAsignarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator0130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelMiniSiaAsignarrNota))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPiePAginaInscribirNota.setBackground(new java.awt.Color(239, 123, 69));

        jButtonSalirAsignarNota.setText("SALIR");
        jButtonSalirAsignarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirAsignarNotaActionPerformed(evt);
            }
        });

        jButtonVolverAsignarNota.setText("VOLVER");
        jButtonVolverAsignarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAsignarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePAginaInscribirNotaLayout = new javax.swing.GroupLayout(jPanelPiePAginaInscribirNota);
        jPanelPiePAginaInscribirNota.setLayout(jPanelPiePAginaInscribirNotaLayout);
        jPanelPiePAginaInscribirNotaLayout.setHorizontalGroup(
            jPanelPiePAginaInscribirNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePAginaInscribirNotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverAsignarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirAsignarNota)
                .addContainerGap())
        );
        jPanelPiePAginaInscribirNotaLayout.setVerticalGroup(
            jPanelPiePAginaInscribirNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiePAginaInscribirNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPiePAginaInscribirNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirAsignarNota)
                    .addComponent(jButtonVolverAsignarNota))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTextField0130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0130ActionPerformed(evt);
            }
        });

        jLabelNumGrupAsignarNota.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabelNumGrupAsignarNota.setText("Ingrese el número del grupo");

        jTextField0131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0131ActionPerformed(evt);
            }
        });

        jLabelEstudianteAsignarNota.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabelEstudianteAsignarNota.setText("ID estudiante");

        jLabelNotaAsignarNota.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabelNotaAsignarNota.setText("Nota");

        jButtonBuscarAsignarNota.setText("BUSCAR");
        jButtonBuscarAsignarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAsignarNotaActionPerformed(evt);
            }
        });

        jButtonAsignarAsignarNota.setText("ASIGNAR");
        jButtonAsignarAsignarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarAsignarNotaActionPerformed(evt);
            }
        });

        jLabelComprobanteAsignarNota.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabelComprobanteAsignarNota.setText("Comprobante");

        ACEPTARAsigNota.setText("ACEPTAR");
        ACEPTARAsigNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARAsigNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoAsignarNotaLayout = new javax.swing.GroupLayout(jPanelFondoAsignarNota);
        jPanelFondoAsignarNota.setLayout(jPanelFondoAsignarNotaLayout);
        jPanelFondoAsignarNotaLayout.setHorizontalGroup(
            jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoAsignarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPiePAginaInscribirNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoAsignarNotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoAsignarNotaLayout.createSequentialGroup()
                        .addComponent(jTextField0133, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ACEPTARAsigNota)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoAsignarNotaLayout.createSequentialGroup()
                        .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoAsignarNotaLayout.createSequentialGroup()
                                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEstudianteAsignarNota)
                                    .addComponent(jTextField0131, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelComprobanteAsignarNota))
                                .addGap(29, 29, 29)
                                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0132, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNotaAsignarNota)))
                            .addComponent(jLabelNumGrupAsignarNota))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField0130, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarAsignarNota)
                            .addComponent(jButtonAsignarAsignarNota))
                        .addGap(21, 21, 21))))
        );
        jPanelFondoAsignarNotaLayout.setVerticalGroup(
            jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoAsignarNotaLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoAsignarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumGrupAsignarNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonBuscarAsignarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstudianteAsignarNota)
                    .addComponent(jLabelNotaAsignarNota))
                .addGap(9, 9, 9)
                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0131, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0132, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAsignarAsignarNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelComprobanteAsignarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoAsignarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0133, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACEPTARAsigNota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPiePAginaInscribirNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoAsignarNota, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void jButtonVolverAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverAsignarNotaActionPerformed
        // TODO add your handling code here:
        prueba2.CrearInterfazProf();
        this.dispose();
    }//GEN-LAST:event_jButtonVolverAsignarNotaActionPerformed

    private void jTextField0130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0130ActionPerformed

    private void jButtonBuscarAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAsignarNotaActionPerformed
        // TODO add your handling code here:
        asignar asignador = new asignar();
        int numeroGrupo = Integer.valueOf(jTextField0130.getText()); 
        Profesor profesorConsultor = (Profesor) LoginMain.usuarioActual.get(0);
        grupo = asignador.buscarGrupo( profesorConsultor,numeroGrupo );
        if(grupo.getNumero() == -1){
            error();
        }else{
            encontrado();
        }
        
    }//GEN-LAST:event_jButtonBuscarAsignarNotaActionPerformed

    private void jButtonAsignarAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarAsignarNotaActionPerformed
        // TODO add your handling code here:
        asignar asignador = new asignar();
        int idEstudiante = Integer.valueOf(jTextField0131.getText());
        int calificacion = Integer.valueOf(jTextField0132.getText());
        Estudiante estudiante = asignador.buscarEstudiante(grupo,idEstudiante);
        if( estudiante.getEdad() != -1 ){
            Nota nota = asignador.asignarNotaPorEstudiante(estudiante, calificacion);
            HashMap notas = grupo.getNotasGrupo();
            notas.put(jTextField0131.getText(), nota);
            
            jTextField0133.setText(nota.toString ());
        }else{
            error();
        }
    }//GEN-LAST:event_jButtonAsignarAsignarNotaActionPerformed

    private void jButtonSalirAsignarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirAsignarNotaActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirAsignarNotaActionPerformed

    private void jTextField0131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0131ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0131ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField0130.setText("");        
        DatosErroneos.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        grupoEncontrado.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ACEPTARAsigNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARAsigNotaActionPerformed
        // TODO add your handling code here:
        
        jTextField0131.setText("");
        jTextField0132.setText("");
        jTextField0133.setText("");
    }//GEN-LAST:event_ACEPTARAsigNotaActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarNotaFrame().setVisible(true);
            }
        });
    }
    
    public void asignarNota(){
        asignar asignador = new asignar();
        int numeroGrupo = Integer.valueOf(jTextField0130.getText()); 
        Profesor profesorConsultor = (Profesor) LoginMain.usuarioActual.get(0);
        Grupo grupo = asignador.buscarGrupo( profesorConsultor,numeroGrupo );
        if(grupo.getNumero() != -1){
        
        }
    }
    
    public void error(){
        DatosErroneos.setVisible(true);
        DatosErroneos.locate(500, 500);
        DatosErroneos.setSize(500,200);
    }
    
    public void encontrado(){
        grupoEncontrado.setVisible(true);
        grupoEncontrado.locate(700, 700);
        grupoEncontrado.setSize(500,200);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTARAsigNota;
    private javax.swing.JDialog DatosErroneos;
    private javax.swing.JDialog grupoEncontrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAsignarAsignarNota;
    private javax.swing.JButton jButtonBuscarAsignarNota;
    private javax.swing.JButton jButtonSalirAsignarNota;
    private javax.swing.JButton jButtonVolverAsignarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelComprobanteAsignarNota;
    private javax.swing.JLabel jLabelEstudianteAsignarNota;
    private javax.swing.JLabel jLabelMiniSiaAsignarrNota;
    private javax.swing.JLabel jLabelNotaAsignarNota;
    private javax.swing.JLabel jLabelNumGrupAsignarNota;
    private javax.swing.JLabel jLabelTituloAsignarNota;
    private javax.swing.JPanel jPanelEncabezadoAsignarNota;
    private javax.swing.JPanel jPanelFondoAsignarNota;
    private javax.swing.JPanel jPanelPiePAginaInscribirNota;
    private javax.swing.JSeparator jSeparator0130;
    private javax.swing.JSeparator jSeparator0131;
    private javax.swing.JTextField jTextField0130;
    private javax.swing.JTextField jTextField0131;
    private javax.swing.JTextField jTextField0132;
    private javax.swing.JTextField jTextField0133;
    // End of variables declaration//GEN-END:variables
}
