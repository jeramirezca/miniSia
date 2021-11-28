

package UI;
import Datos.Estudiante;
import Logica.prueba2;
import Logica.consultas;
//import java.util.ArrayList;

public class InterfazEstudiante extends javax.swing.JFrame {
   
            
    public InterfazEstudiante() {
        initComponents();
        this.getPreferredSize();
        colocarTitulo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarNota3 = new javax.swing.JPanel();
        jPanelEncabezadoConsultarNota3 = new javax.swing.JPanel();
        jLabelTituloConsultarNota3 = new javax.swing.JLabel();
        jSeparator65 = new javax.swing.JSeparator();
        jSeparator66 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarNota3 = new javax.swing.JLabel();
        jLabelBienvenidoInterEst = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        buttonNotas = new javax.swing.JButton();
        buttonHorario = new javax.swing.JButton();
        buttonSubsidios = new javax.swing.JButton();
        buttonProfesores = new javax.swing.JButton();
        buttonInforpersonal = new javax.swing.JButton();
        jLabelResultadoConsultarNota3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        buttonIncribir = new javax.swing.JButton();
        buttoncambioClave = new javax.swing.JButton();
        buttonpedirSubsidio = new javax.swing.JButton();
        jLabelResultadoConsultarNota5 = new javax.swing.JLabel();
        jPanelPiePaginaConsultarNota3 = new javax.swing.JPanel();
        jButtonSalirConsultarNota3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarNota3.setBackground(new java.awt.Color(205, 237, 246));
        jPanelFondoConsultarNota3.setPreferredSize(new java.awt.Dimension(410, 310));

        jPanelEncabezadoConsultarNota3.setBackground(new java.awt.Color(239, 123, 69));
        jPanelEncabezadoConsultarNota3.setPreferredSize(new java.awt.Dimension(390, 54));

        jLabelTituloConsultarNota3.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloConsultarNota3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarNota3.setText("INICIO - ESTUDIANTE");

        jSeparator66.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarNota3.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarNota3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarNota3.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarNota3Layout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarNota3);
        jPanelEncabezadoConsultarNota3.setLayout(jPanelEncabezadoConsultarNota3Layout);
        jPanelEncabezadoConsultarNota3Layout.setHorizontalGroup(
            jPanelEncabezadoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarNota3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoConsultarNota3Layout.createSequentialGroup()
                        .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelTituloConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMiniSiaConsultarNota3)
                .addContainerGap())
        );
        jPanelEncabezadoConsultarNota3Layout.setVerticalGroup(
            jPanelEncabezadoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator66, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarNota3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoConsultarNota3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMiniSiaConsultarNota3)
                .addContainerGap())
        );

        jLabelBienvenidoInterEst.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelBienvenidoInterEst.setText("BIENVENIDO ");

        jPanel8.setBackground(new java.awt.Color(94, 177, 191));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonNotas.setText("Notas");
        buttonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNotasActionPerformed(evt);
            }
        });

        buttonHorario.setText("Horario");
        buttonHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHorarioActionPerformed(evt);
            }
        });

        buttonSubsidios.setText("Subsidios");
        buttonSubsidios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubsidiosActionPerformed(evt);
            }
        });

        buttonProfesores.setText("Profesores");
        buttonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfesoresActionPerformed(evt);
            }
        });

        buttonInforpersonal.setText("Info. Personal");
        buttonInforpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInforpersonalActionPerformed(evt);
            }
        });

        jLabelResultadoConsultarNota3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelResultadoConsultarNota3.setForeground(new java.awt.Color(240, 240, 240));
        jLabelResultadoConsultarNota3.setText("Consultar:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubsidios, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonInforpersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addComponent(buttonHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResultadoConsultarNota3)
                .addGap(48, 48, 48))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResultadoConsultarNota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSubsidios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonProfesores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonInforpersonal)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(94, 177, 191));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonIncribir.setText("Inscribir materias");
        buttonIncribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncribirActionPerformed(evt);
            }
        });

        buttoncambioClave.setText("Cambiar clave");
        buttoncambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncambioClaveActionPerformed(evt);
            }
        });

        buttonpedirSubsidio.setText("Pedir subsidio");
        buttonpedirSubsidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpedirSubsidioActionPerformed(evt);
            }
        });

        jLabelResultadoConsultarNota5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelResultadoConsultarNota5.setForeground(new java.awt.Color(240, 240, 240));
        jLabelResultadoConsultarNota5.setText("Asignaciones:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonIncribir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttoncambioClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonpedirSubsidio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelResultadoConsultarNota5)))
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultadoConsultarNota5)
                .addGap(18, 18, 18)
                .addComponent(buttonIncribir)
                .addGap(18, 18, 18)
                .addComponent(buttoncambioClave)
                .addGap(18, 18, 18)
                .addComponent(buttonpedirSubsidio)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanelPiePaginaConsultarNota3.setBackground(new java.awt.Color(239, 123, 69));
        jPanelPiePaginaConsultarNota3.setPreferredSize(new java.awt.Dimension(142, 47));

        jButtonSalirConsultarNota3.setText("CERRAR SESIÓN");
        jButtonSalirConsultarNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultarNota3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarNota3Layout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarNota3);
        jPanelPiePaginaConsultarNota3.setLayout(jPanelPiePaginaConsultarNota3Layout);
        jPanelPiePaginaConsultarNota3Layout.setHorizontalGroup(
            jPanelPiePaginaConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarNota3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirConsultarNota3)
                .addGap(18, 18, 18))
        );
        jPanelPiePaginaConsultarNota3Layout.setVerticalGroup(
            jPanelPiePaginaConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiePaginaConsultarNota3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalirConsultarNota3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFondoConsultarNota3Layout = new javax.swing.GroupLayout(jPanelFondoConsultarNota3);
        jPanelFondoConsultarNota3.setLayout(jPanelFondoConsultarNota3Layout);
        jPanelFondoConsultarNota3Layout.setHorizontalGroup(
            jPanelFondoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNota3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNota3Layout.createSequentialGroup()
                        .addComponent(jLabelBienvenidoInterEst)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNota3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanelPiePaginaConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        jPanelFondoConsultarNota3Layout.setVerticalGroup(
            jPanelFondoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNota3Layout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBienvenidoInterEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoConsultarNota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPiePaginaConsultarNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondoConsultarNota3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNotasActionPerformed
        // TODO add your handling code here:
        ConsultarNotasFrame notas = new ConsultarNotasFrame();
        notas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonNotasActionPerformed

    private void buttonHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHorarioActionPerformed
        // TODO add your handling code here:
        ConsultaHorarioFrame horario = new ConsultaHorarioFrame();
        horario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonHorarioActionPerformed

    private void buttonSubsidiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubsidiosActionPerformed
        // TODO add your handling code here:
        ConsultarSubsidioFrame subsidios = new ConsultarSubsidioFrame();
        consultas consultor = new consultas();
        Estudiante estudiante = (Estudiante) LoginMain.usuarioActual.get(0);
        subsidios.jAreaSubsidiosEst.setText(consultor.consultarSubsidio(estudiante));
        subsidios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonSubsidiosActionPerformed

    private void buttonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProfesoresActionPerformed
        // TODO add your handling code here:
        ConsultarProfesFrame profes = new ConsultarProfesFrame();
        profes.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_buttonProfesoresActionPerformed

    private void buttonInforpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInforpersonalActionPerformed
        // TODO add your handling code here:
        ConsultarInfoFrame info = new ConsultarInfoFrame();
        info.campoInfopersonal.setText(LoginMain.usuarioActual.get(0).toString());
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonInforpersonalActionPerformed

    private void buttonIncribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncribirActionPerformed
        // TODO add your handling code here:
        InscribirMateriasFrame inscribir = new InscribirMateriasFrame();
        inscribir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonIncribirActionPerformed

    private void buttoncambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncambioClaveActionPerformed
        // TODO add your handling code here:
        CambiarClaveFrame clave = new CambiarClaveFrame();
        clave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttoncambioClaveActionPerformed

    private void buttonpedirSubsidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpedirSubsidioActionPerformed
        // TODO add your handling code here:
        PedirSubsidioFrame pideSubsidio = new PedirSubsidioFrame();
        pideSubsidio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonpedirSubsidioActionPerformed

    private void jButtonSalirConsultarNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultarNota3ActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirConsultarNota3ActionPerformed


    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEstudiante().setVisible(true);
            }
        });
    }
    
    public void colocarTitulo(){
        Estudiante estudiante = (Estudiante) LoginMain.usuarioActual.get(0);
        this.jLabelBienvenidoInterEst.setText("BIENVENIDO " + estudiante.getNombre().toUpperCase());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHorario;
    private javax.swing.JButton buttonIncribir;
    private javax.swing.JButton buttonInforpersonal;
    private javax.swing.JButton buttonNotas;
    private javax.swing.JButton buttonProfesores;
    private javax.swing.JButton buttonSubsidios;
    private javax.swing.JButton buttoncambioClave;
    private javax.swing.JButton buttonpedirSubsidio;
    public static javax.swing.JButton jButtonSalirConsultarNota3;
    private javax.swing.JLabel jLabelBienvenidoInterEst;
    private javax.swing.JLabel jLabelMiniSiaConsultarNota3;
    private javax.swing.JLabel jLabelResultadoConsultarNota3;
    private javax.swing.JLabel jLabelResultadoConsultarNota5;
    private javax.swing.JLabel jLabelTituloConsultarNota3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEncabezadoConsultarNota3;
    private javax.swing.JPanel jPanelFondoConsultarNota3;
    private javax.swing.JPanel jPanelPiePaginaConsultarNota3;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    // End of variables declaration//GEN-END:variables
}
