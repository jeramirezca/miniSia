
package UI;

import Logica.prueba2;
import Datos. *;

public class ConsultaHorarioFrame extends javax.swing.JFrame {


    public ConsultaHorarioFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondoConsultarHorario = new javax.swing.JPanel();
        jPanelEncabezadoConsultarHorario = new javax.swing.JPanel();
        jLabelTituloConsultarHorario = new javax.swing.JLabel();
        jSeparator070 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelMiniSiaConsultarHorario = new javax.swing.JLabel();
        jPanelPiePaginaConsultarHorario = new javax.swing.JPanel();
        jButtonSalirConsultHorario = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelSubtituloHorario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoConsultarHorario.setBackground(new java.awt.Color(205, 237, 246));

        jPanelEncabezadoConsultarHorario.setBackground(new java.awt.Color(239, 123, 69));

        jLabelTituloConsultarHorario.setFont(new java.awt.Font("Sylfaen", 3, 19)); // NOI18N
        jLabelTituloConsultarHorario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloConsultarHorario.setText("HORARIO");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSiaConsultarHorario.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSiaConsultarHorario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSiaConsultarHorario.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoConsultarHorarioLayout = new javax.swing.GroupLayout(jPanelEncabezadoConsultarHorario);
        jPanelEncabezadoConsultarHorario.setLayout(jPanelEncabezadoConsultarHorarioLayout);
        jPanelEncabezadoConsultarHorarioLayout.setHorizontalGroup(
            jPanelEncabezadoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoConsultarHorarioLayout.createSequentialGroup()
                .addGroup(jPanelEncabezadoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator070, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEncabezadoConsultarHorarioLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelTituloConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMiniSiaConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoConsultarHorarioLayout.setVerticalGroup(
            jPanelEncabezadoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoConsultarHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoConsultarHorarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTituloConsultarHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator070, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEncabezadoConsultarHorarioLayout.createSequentialGroup()
                        .addComponent(jLabelMiniSiaConsultarHorario)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanelPiePaginaConsultarHorario.setBackground(new java.awt.Color(239, 123, 69));

        jButtonSalirConsultHorario.setText("SALIR");
        jButtonSalirConsultHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirConsultHorarioActionPerformed(evt);
            }
        });

        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaConsultarHorarioLayout = new javax.swing.GroupLayout(jPanelPiePaginaConsultarHorario);
        jPanelPiePaginaConsultarHorario.setLayout(jPanelPiePaginaConsultarHorarioLayout);
        jPanelPiePaginaConsultarHorarioLayout.setHorizontalGroup(
            jPanelPiePaginaConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarHorarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalirConsultHorario)
                .addContainerGap())
        );
        jPanelPiePaginaConsultarHorarioLayout.setVerticalGroup(
            jPanelPiePaginaConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaConsultarHorarioLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirConsultHorario)
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        jLabelSubtituloHorario.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabelSubtituloHorario.setText("SU HORARIO ES:");

        jPanel1.setBackground(new java.awt.Color(94, 177, 191));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LUNES");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MARTES");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MIERCOLES");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JUEVES");

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VIERNES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 247, Short.MAX_VALUE))
                    .addComponent(jTextField5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Sig. >");

        jButton2.setText("< Ant.");

        javax.swing.GroupLayout jPanelFondoConsultarHorarioLayout = new javax.swing.GroupLayout(jPanelFondoConsultarHorario);
        jPanelFondoConsultarHorario.setLayout(jPanelFondoConsultarHorarioLayout);
        jPanelFondoConsultarHorarioLayout.setHorizontalGroup(
            jPanelFondoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarHorarioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabelSubtituloHorario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFondoConsultarHorarioLayout.setVerticalGroup(
            jPanelFondoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarHorarioLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSubtituloHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarHorarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFondoConsultarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPiePaginaConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoConsultarHorario, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
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
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonSalirConsultHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirConsultHorarioActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirConsultHorarioActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaHorarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSalirConsultHorario;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMiniSiaConsultarHorario;
    private javax.swing.JLabel jLabelSubtituloHorario;
    private javax.swing.JLabel jLabelTituloConsultarHorario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEncabezadoConsultarHorario;
    private javax.swing.JPanel jPanelFondoConsultarHorario;
    private javax.swing.JPanel jPanelPiePaginaConsultarHorario;
    private javax.swing.JSeparator jSeparator070;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
