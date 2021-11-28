
package UI;

import Logica.prueba2;
import Logica.consultas;
import Datos.Estudiante;
import Datos.Papito;
import Datos.Profesor;
import java.util.ArrayList;

public class ConsultarProfesFrame extends javax.swing.JFrame {
    
 //variable para controlar, en caso de los papitos, a cual estudiante mostrar notas
    
    int i = 0;
    
    
    public ConsultarProfesFrame() {
        initComponents();
        EsconderBotones();
        this.setSize(500, 350);
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
        jButtonSiguienteEst = new javax.swing.JButton();
        jButtonAnteriorEst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaProfesConsulta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

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

        jLabelIngresarNombreConsultarNota3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabelIngresarNombreConsultarNota3.setText("Estudiante ");

        jButtonSiguienteEst.setText("Sig. >");
        jButtonSiguienteEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteEstActionPerformed(evt);
            }
        });

        jButtonAnteriorEst.setText("< Ant.");
        jButtonAnteriorEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorEstActionPerformed(evt);
            }
        });

        jTextAreaProfesConsulta.setColumns(20);
        jTextAreaProfesConsulta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaProfesConsulta);

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoConsultarNota5Layout = new javax.swing.GroupLayout(jPanelFondoConsultarNota5);
        jPanelFondoConsultarNota5.setLayout(jPanelFondoConsultarNota5Layout);
        jPanelFondoConsultarNota5Layout.setHorizontalGroup(
            jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIngresarNombreConsultarNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarNota5Layout.createSequentialGroup()
                        .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAnteriorEst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSiguienteEst, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        jPanelFondoConsultarNota5Layout.setVerticalGroup(
            jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNota5Layout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelIngresarNombreConsultarNota3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoConsultarNota5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonAnteriorEst)
                    .addComponent(jButtonSiguienteEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanelPiePaginaConsultarNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoConsultarNota5, java.awt.BorderLayout.CENTER);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        impresiones impresor = new impresiones();
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            Estudiante estudiante = (Estudiante) user;
            ArrayList<Profesor> profes = MostrarProfes(estudiante);
            String profesoresEstudiante = impresor.mostrarProfes(profes);
            jTextAreaProfesConsulta.setText(profesoresEstudiante);
        }else{
            Papito padre = (Papito) user;
            ArrayList<Profesor> profes = MostrarProfesPapito(padre,i);
            String profesoresEstudiante = impresor.mostrarProfes(profes);
            jTextAreaProfesConsulta.setText(profesoresEstudiante);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAnteriorEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorEstActionPerformed
        // TODO add your handling code here:
        
        i -= 1;
        EsconderBotones();
        colocarTitulo();
        jTextAreaProfesConsulta.setText("");
    }//GEN-LAST:event_jButtonAnteriorEstActionPerformed

    private void jButtonSiguienteEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteEstActionPerformed
        // TODO add your handling code here:
        
        i += 1;
        EsconderBotones();
        colocarTitulo();
        jTextAreaProfesConsulta.setText("");
        
    }//GEN-LAST:event_jButtonSiguienteEstActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarProfesFrame().setVisible(true);
            }
        });
    }
    public void colocarTitulo(){
        Papito padre = (Papito) LoginMain.usuarioActual.get(0);
        
        Estudiante estudiante = padre.getAcudeA().get(i);
        this.jLabelIngresarNombreConsultarNota3.setText("ESTUDIANTE " + estudiante.getNombre().toUpperCase());
    }
    
    public void EsconderBotones(){
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            jButtonAnteriorEst.setVisible(false);
            jButtonSiguienteEst.setVisible(false);
            jLabelIngresarNombreConsultarNota3.setVisible(false);
        }else{
            colocarTitulo();
            if(i==0){
                Papito padre = (Papito) user;
                jButtonAnteriorEst.setVisible(false);
                if(padre.getAcudeA().size() == 1){
                    jButtonSiguienteEst.setVisible(false);
                }else{               
                    jButtonSiguienteEst.setVisible(true);
                }
            }else{
                Papito padre = (Papito) user;
                if(i == (padre.getAcudeA().size() -1) ) {
                    jButtonSiguienteEst.setVisible(false);
                }
                jButtonAnteriorEst.setVisible(true);
            }
        }
    }
    
    public ArrayList<Profesor> MostrarProfes(Estudiante estudiante){
            consultas consultor = new consultas();
            ArrayList<Profesor> profes = consultor.consultarProfes(estudiante);
            return profes;   
    }
    
    public ArrayList<Profesor> MostrarProfesPapito(Papito padre, int i){
        ArrayList<Estudiante> acudidos = padre.getAcudeA();
        ArrayList<Profesor> profes = MostrarProfes(acudidos.get(i));
        return profes;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JTextArea jTextAreaProfesConsulta;
    // End of variables declaration//GEN-END:variables
}
