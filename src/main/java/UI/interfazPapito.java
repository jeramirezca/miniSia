
package UI;

import Datos.Papito;
import Logica.prueba2;

public class InterfazPapito extends javax.swing.JFrame {


    public InterfazPapito() {
        initComponents();
        this.setSize(500, 400);
        colocarTitulo();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelFondoInterfazPapito = new javax.swing.JPanel();
        jPanelEncabezadoInterPapito = new javax.swing.JPanel();
        jLabelTituloInterPapito = new javax.swing.JLabel();
        jSeparator030 = new javax.swing.JSeparator();
        jSeparator031 = new javax.swing.JSeparator();
        jLabelMiniSiaInterPapito = new javax.swing.JLabel();
        jPanelPiePagInterPapito = new javax.swing.JPanel();
        jButtonSalirInterPapito = new javax.swing.JButton();
        jLabelBienvenidoInterPapito = new javax.swing.JLabel();
        jPanelConsultarInterPapito = new javax.swing.JPanel();
        jLabelConsultIntePapito = new javax.swing.JLabel();
        jButtonConsulNotaInterPapito = new javax.swing.JButton();
        jButtonConsulHorarInterPpaito = new javax.swing.JButton();
        jButtonConsulProfeInterPapito = new javax.swing.JButton();
        jButtonConsulInfoInterPapito = new javax.swing.JButton();
        jPanelAsignaInterPapito = new javax.swing.JPanel();
        jLabelAsignInterPpaito = new javax.swing.JLabel();
        jButtonCambiarClaveInterPapito = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoInterfazPapito.setBackground(new java.awt.Color(205, 237, 246));

        jPanelEncabezadoInterPapito.setBackground(new java.awt.Color(239, 123, 69));

        jLabelTituloInterPapito.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        jLabelTituloInterPapito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloInterPapito.setText("INICIO - PAPITO");

        jSeparator031.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaInterPapito.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaInterPapito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaInterPapito.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoInterPapitoLayout = new javax.swing.GroupLayout(jPanelEncabezadoInterPapito);
        jPanelEncabezadoInterPapito.setLayout(jPanelEncabezadoInterPapitoLayout);
        jPanelEncabezadoInterPapitoLayout.setHorizontalGroup(
            jPanelEncabezadoInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoInterPapitoLayout.createSequentialGroup()
                .addGroup(jPanelEncabezadoInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoInterPapitoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator030, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator031, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSiaInterPapito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoInterPapitoLayout.setVerticalGroup(
            jPanelEncabezadoInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator031)
            .addGroup(jPanelEncabezadoInterPapitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoInterPapitoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTituloInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator030, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEncabezadoInterPapitoLayout.createSequentialGroup()
                        .addComponent(jLabelMiniSiaInterPapito)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanelPiePagInterPapito.setBackground(new java.awt.Color(239, 123, 69));

        jButtonSalirInterPapito.setText("CERRAR SESIÓN");
        jButtonSalirInterPapito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirInterPapitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePagInterPapitoLayout = new javax.swing.GroupLayout(jPanelPiePagInterPapito);
        jPanelPiePagInterPapito.setLayout(jPanelPiePagInterPapitoLayout);
        jPanelPiePagInterPapitoLayout.setHorizontalGroup(
            jPanelPiePagInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePagInterPapitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirInterPapito)
                .addContainerGap())
        );
        jPanelPiePagInterPapitoLayout.setVerticalGroup(
            jPanelPiePagInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiePagInterPapitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalirInterPapito)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabelBienvenidoInterPapito.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabelBienvenidoInterPapito.setText("BIENVENIDO");

        jPanelConsultarInterPapito.setBackground(new java.awt.Color(94, 177, 191));
        jPanelConsultarInterPapito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelConsultIntePapito.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabelConsultIntePapito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultIntePapito.setText("Consultar:");

        jButtonConsulNotaInterPapito.setText("Notas");
        jButtonConsulNotaInterPapito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulNotaInterPapitoActionPerformed(evt);
            }
        });

        jButtonConsulHorarInterPpaito.setText("Horario");
        jButtonConsulHorarInterPpaito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulHorarInterPpaitoActionPerformed(evt);
            }
        });

        jButtonConsulProfeInterPapito.setText("Profesores");
        jButtonConsulProfeInterPapito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulProfeInterPapitoActionPerformed(evt);
            }
        });

        jButtonConsulInfoInterPapito.setText("Info personal");
        jButtonConsulInfoInterPapito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulInfoInterPapitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultarInterPapitoLayout = new javax.swing.GroupLayout(jPanelConsultarInterPapito);
        jPanelConsultarInterPapito.setLayout(jPanelConsultarInterPapitoLayout);
        jPanelConsultarInterPapitoLayout.setHorizontalGroup(
            jPanelConsultarInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarInterPapitoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultarInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConsultIntePapito)
                    .addGroup(jPanelConsultarInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonConsulHorarInterPpaito, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConsulNotaInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConsulProfeInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConsulInfoInterPapito)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelConsultarInterPapitoLayout.setVerticalGroup(
            jPanelConsultarInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarInterPapitoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelConsultIntePapito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsulNotaInterPapito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsulHorarInterPpaito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsulProfeInterPapito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConsulInfoInterPapito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAsignaInterPapito.setBackground(new java.awt.Color(94, 177, 191));
        jPanelAsignaInterPapito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelAsignInterPpaito.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabelAsignInterPpaito.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAsignInterPpaito.setText("Asignaciones:");

        jButtonCambiarClaveInterPapito.setText("Cambiar clave");
        jButtonCambiarClaveInterPapito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarClaveInterPapitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignaInterPapitoLayout = new javax.swing.GroupLayout(jPanelAsignaInterPapito);
        jPanelAsignaInterPapito.setLayout(jPanelAsignaInterPapitoLayout);
        jPanelAsignaInterPapitoLayout.setHorizontalGroup(
            jPanelAsignaInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignaInterPapitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAsignaInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsignaInterPapitoLayout.createSequentialGroup()
                        .addComponent(jLabelAsignInterPpaito)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsignaInterPapitoLayout.createSequentialGroup()
                        .addComponent(jButtonCambiarClaveInterPapito)
                        .addGap(44, 44, 44))))
        );
        jPanelAsignaInterPapitoLayout.setVerticalGroup(
            jPanelAsignaInterPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignaInterPapitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAsignInterPpaito)
                .addGap(36, 36, 36)
                .addComponent(jButtonCambiarClaveInterPapito)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFondoInterfazPapitoLayout = new javax.swing.GroupLayout(jPanelFondoInterfazPapito);
        jPanelFondoInterfazPapito.setLayout(jPanelFondoInterfazPapitoLayout);
        jPanelFondoInterfazPapitoLayout.setHorizontalGroup(
            jPanelFondoInterfazPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoInterPapito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPiePagInterPapito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoInterfazPapitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienvenidoInterPapito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFondoInterfazPapitoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanelConsultarInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanelAsignaInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanelFondoInterfazPapitoLayout.setVerticalGroup(
            jPanelFondoInterfazPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoInterfazPapitoLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBienvenidoInterPapito)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoInterfazPapitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAsignaInterPapito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelConsultarInterPapito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPiePagInterPapito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoInterfazPapito, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsulNotaInterPapitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulNotaInterPapitoActionPerformed
        // TODO add your handling code here:
        ConsultarNotasFrame notas = new ConsultarNotasFrame();
        notas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsulNotaInterPapitoActionPerformed

    private void jButtonConsulHorarInterPpaitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulHorarInterPpaitoActionPerformed
        // TODO add your handling code here:
        ConsultaHorarioFrame horario = new ConsultaHorarioFrame();
        horario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsulHorarInterPpaitoActionPerformed

    private void jButtonConsulProfeInterPapitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulProfeInterPapitoActionPerformed
        // TODO add your handling code here:
        ConsultarProfesFrame profes = new ConsultarProfesFrame();
        profes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsulProfeInterPapitoActionPerformed

    private void jButtonConsulInfoInterPapitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulInfoInterPapitoActionPerformed
        // TODO add your handling code here:
        ConsultarInfoFrame info = new ConsultarInfoFrame();
        info.campoInfopersonal.setText(LoginMain.usuarioActual.get(0).toString());
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonConsulInfoInterPapitoActionPerformed

    private void jButtonCambiarClaveInterPapitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarClaveInterPapitoActionPerformed
        // TODO add your handling code here:
        CambiarClaveFrame clave = new CambiarClaveFrame();
        clave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCambiarClaveInterPapitoActionPerformed

    private void jButtonSalirInterPapitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirInterPapitoActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirInterPapitoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPapito().setVisible(true);
            }
        });
    }
    
    public void colocarTitulo(){
        Papito padre = (Papito) LoginMain.usuarioActual.get(0);
        this.jLabelBienvenidoInterPapito.setText("BIENVENIDO " + padre.getNombre().toUpperCase());
    }
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarClaveInterPapito;
    private javax.swing.JButton jButtonConsulHorarInterPpaito;
    private javax.swing.JButton jButtonConsulInfoInterPapito;
    private javax.swing.JButton jButtonConsulNotaInterPapito;
    private javax.swing.JButton jButtonConsulProfeInterPapito;
    private javax.swing.JButton jButtonSalirInterPapito;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAsignInterPpaito;
    private javax.swing.JLabel jLabelBienvenidoInterPapito;
    private javax.swing.JLabel jLabelConsultIntePapito;
    private javax.swing.JLabel jLabelMiniSiaInterPapito;
    private javax.swing.JLabel jLabelTituloInterPapito;
    private javax.swing.JPanel jPanelAsignaInterPapito;
    private javax.swing.JPanel jPanelConsultarInterPapito;
    private javax.swing.JPanel jPanelEncabezadoInterPapito;
    private javax.swing.JPanel jPanelFondoInterfazPapito;
    private javax.swing.JPanel jPanelPiePagInterPapito;
    private javax.swing.JSeparator jSeparator030;
    private javax.swing.JSeparator jSeparator031;
    // End of variables declaration//GEN-END:variables
}
