
package UI;
import Logica.prueba2;
import Datos.*;

public class InterfazProfesor extends javax.swing.JFrame {


    public InterfazProfesor() {
        initComponents();
        colocarTitulo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFondoInterfazProfe = new javax.swing.JPanel();
        AsignacionInterfazProfe = new javax.swing.JPanel();
        jButtonAsigNotaInterProfe = new javax.swing.JButton();
        JbuttonAsigClaveInterProfe = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        consulta1 = new javax.swing.JPanel();
        JbuttonConulHorarInterProfe = new javax.swing.JButton();
        JbuttonConsulInfoInterProfe = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanelEncabezadoInterfazProfe = new javax.swing.JPanel();
        JlabelTituloInterfazProfe = new javax.swing.JLabel();
        jSeparator020 = new javax.swing.JSeparator();
        jSeparator021 = new javax.swing.JSeparator();
        jLabelMiniSiaInterfazProfe = new javax.swing.JLabel();
        jPanelPiePaginaInterfazProfe = new javax.swing.JPanel();
        jButtonSalirInterProfe = new javax.swing.JButton();
        jLabelBienvenidaInterfazProfe = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(239, 123, 69));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Este es tu horario: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoInterfazProfe.setBackground(new java.awt.Color(205, 237, 246));

        AsignacionInterfazProfe.setBackground(new java.awt.Color(94, 177, 191));
        AsignacionInterfazProfe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonAsigNotaInterProfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAsigNotaInterProfe.setText("Notas");
        jButtonAsigNotaInterProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsigNotaInterProfeActionPerformed(evt);
            }
        });

        JbuttonAsigClaveInterProfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JbuttonAsigClaveInterProfe.setText("Cambiar clave");
        JbuttonAsigClaveInterProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonAsigClaveInterProfeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Asignaciones:");

        javax.swing.GroupLayout AsignacionInterfazProfeLayout = new javax.swing.GroupLayout(AsignacionInterfazProfe);
        AsignacionInterfazProfe.setLayout(AsignacionInterfazProfeLayout);
        AsignacionInterfazProfeLayout.setHorizontalGroup(
            AsignacionInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionInterfazProfeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AsignacionInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAsigNotaInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbuttonAsigClaveInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(AsignacionInterfazProfeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        AsignacionInterfazProfeLayout.setVerticalGroup(
            AsignacionInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionInterfazProfeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jButtonAsigNotaInterProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbuttonAsigClaveInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        consulta1.setBackground(new java.awt.Color(94, 177, 191));
        consulta1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JbuttonConulHorarInterProfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JbuttonConulHorarInterProfe.setText("Horario");
        JbuttonConulHorarInterProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonConulHorarInterProfeActionPerformed(evt);
            }
        });

        JbuttonConsulInfoInterProfe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JbuttonConsulInfoInterProfe.setText("Info. Personal");
        JbuttonConsulInfoInterProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonConsulInfoInterProfeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Consultar:");

        javax.swing.GroupLayout consulta1Layout = new javax.swing.GroupLayout(consulta1);
        consulta1.setLayout(consulta1Layout);
        consulta1Layout.setHorizontalGroup(
            consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbuttonConulHorarInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbuttonConsulInfoInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consulta1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        consulta1Layout.setVerticalGroup(
            consulta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consulta1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(JbuttonConulHorarInterProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbuttonConsulInfoInterProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelEncabezadoInterfazProfe.setBackground(new java.awt.Color(239, 123, 69));

        JlabelTituloInterfazProfe.setFont(new java.awt.Font("Sylfaen", 3, 20)); // NOI18N
        JlabelTituloInterfazProfe.setForeground(new java.awt.Color(255, 255, 255));
        JlabelTituloInterfazProfe.setText("INICIO - PROFESOR");

        jSeparator021.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaInterfazProfe.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaInterfazProfe.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaInterfazProfe.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoInterfazProfeLayout = new javax.swing.GroupLayout(jPanelEncabezadoInterfazProfe);
        jPanelEncabezadoInterfazProfe.setLayout(jPanelEncabezadoInterfazProfeLayout);
        jPanelEncabezadoInterfazProfeLayout.setHorizontalGroup(
            jPanelEncabezadoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoInterfazProfeLayout.createSequentialGroup()
                .addGroup(jPanelEncabezadoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelTituloInterfazProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator020, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator021, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMiniSiaInterfazProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelEncabezadoInterfazProfeLayout.setVerticalGroup(
            jPanelEncabezadoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator021, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoInterfazProfeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoInterfazProfeLayout.createSequentialGroup()
                        .addComponent(JlabelTituloInterfazProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator020, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEncabezadoInterfazProfeLayout.createSequentialGroup()
                        .addComponent(jLabelMiniSiaInterfazProfe)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanelPiePaginaInterfazProfe.setBackground(new java.awt.Color(239, 123, 69));

        jButtonSalirInterProfe.setText("CERRAR SESION");
        jButtonSalirInterProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirInterProfeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaInterfazProfeLayout = new javax.swing.GroupLayout(jPanelPiePaginaInterfazProfe);
        jPanelPiePaginaInterfazProfe.setLayout(jPanelPiePaginaInterfazProfeLayout);
        jPanelPiePaginaInterfazProfeLayout.setHorizontalGroup(
            jPanelPiePaginaInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaInterfazProfeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalirInterProfe)
                .addContainerGap())
        );
        jPanelPiePaginaInterfazProfeLayout.setVerticalGroup(
            jPanelPiePaginaInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPiePaginaInterfazProfeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalirInterProfe)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabelBienvenidaInterfazProfe.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabelBienvenidaInterfazProfe.setText("BIENVENIDO");

        javax.swing.GroupLayout jPanelFondoInterfazProfeLayout = new javax.swing.GroupLayout(jPanelFondoInterfazProfe);
        jPanelFondoInterfazProfe.setLayout(jPanelFondoInterfazProfeLayout);
        jPanelFondoInterfazProfeLayout.setHorizontalGroup(
            jPanelFondoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoInterfazProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaInterfazProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoInterfazProfeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoInterfazProfeLayout.createSequentialGroup()
                        .addComponent(jLabelBienvenidaInterfazProfe)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFondoInterfazProfeLayout.createSequentialGroup()
                        .addComponent(AsignacionInterfazProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(consulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanelFondoInterfazProfeLayout.setVerticalGroup(
            jPanelFondoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoInterfazProfeLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoInterfazProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBienvenidaInterfazProfe)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoInterfazProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AsignacionInterfazProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanelPiePaginaInterfazProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoInterfazProfe, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbuttonConulHorarInterProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonConulHorarInterProfeActionPerformed
        // TODO add your handling code here:
        ConsultaHorarioFrame horario = new ConsultaHorarioFrame();
        horario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbuttonConulHorarInterProfeActionPerformed

    private void JbuttonConsulInfoInterProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonConsulInfoInterProfeActionPerformed
        // TODO add your handling code here:
        ConsultarInfoFrame info = new ConsultarInfoFrame();
        info.setVisible(true);
        info.campoInfopersonal.setText(LoginMain.usuarioActual.get(0).toString());
        this.dispose();
    }//GEN-LAST:event_JbuttonConsulInfoInterProfeActionPerformed

    private void JbuttonAsigClaveInterProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonAsigClaveInterProfeActionPerformed
        // TODO add your handling code here:
        CambiarClaveFrame clave = new CambiarClaveFrame();
        clave.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_JbuttonAsigClaveInterProfeActionPerformed

    private void jButtonSalirInterProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirInterProfeActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirInterProfeActionPerformed

    private void jButtonAsigNotaInterProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsigNotaInterProfeActionPerformed
        // TODO add your handling code here:
        AsignarNotaFrame notaFrame = new AsignarNotaFrame();
        notaFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonAsigNotaInterProfeActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazProfesor().setVisible(true);
            }
        });
    }
    
     public void colocarTitulo(){
        Profesor profe = (Profesor) LoginMain.usuarioActual.get(0);
        this.jLabelBienvenidaInterfazProfe.setText("BIENVENIDO " + profe.getNombre().toUpperCase());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AsignacionInterfazProfe;
    private javax.swing.JButton JbuttonAsigClaveInterProfe;
    private javax.swing.JButton JbuttonConsulInfoInterProfe;
    private javax.swing.JButton JbuttonConulHorarInterProfe;
    private javax.swing.JLabel JlabelTituloInterfazProfe;
    private javax.swing.JPanel consulta1;
    private javax.swing.JButton jButtonAsigNotaInterProfe;
    private javax.swing.JButton jButtonSalirInterProfe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBienvenidaInterfazProfe;
    private javax.swing.JLabel jLabelMiniSiaInterfazProfe;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEncabezadoInterfazProfe;
    private javax.swing.JPanel jPanelFondoInterfazProfe;
    private javax.swing.JPanel jPanelPiePaginaInterfazProfe;
    private javax.swing.JSeparator jSeparator020;
    private javax.swing.JSeparator jSeparator021;
    // End of variables declaration//GEN-END:variables
}
