
package UI;

import Logica.prueba2;
import Logica.Actualizaciones;
import Logica.consultas;
import Datos. *;
import java.util.ArrayList;

public class ConsultarNotasFrame extends javax.swing.JFrame {
    
    //variable para controlar, en caso de los papitos, a cual estudiante mostrar notas
    
    int i = 0;

    public ConsultarNotasFrame() {
        initComponents();
        EsconderBotones();
        this.setSize(500, 400);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ErrorNoEncontrado = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("EL ESTUDIANTE NO TIENE INSCRITA ESTA MATERIA");

        jButton3.setText("ACEPTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ErrorNoEncontradoLayout = new javax.swing.GroupLayout(ErrorNoEncontrado.getContentPane());
        ErrorNoEncontrado.getContentPane().setLayout(ErrorNoEncontradoLayout);
        ErrorNoEncontradoLayout.setHorizontalGroup(
            ErrorNoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorNoEncontradoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(ErrorNoEncontradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        ErrorNoEncontradoLayout.setVerticalGroup(
            ErrorNoEncontradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorNoEncontradoLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addContainerGap())
        );

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
                .addContainerGap(78, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel1.setText("Estudiante ");

        jButton1.setText("Sig.>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<Ant.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelFondoConsultarNotaLayout = new javax.swing.GroupLayout(jPanelFondoConsultarNota);
        jPanelFondoConsultarNota.setLayout(jPanelFondoConsultarNotaLayout);
        jPanelFondoConsultarNotaLayout.setHorizontalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIngresarNombreConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelResultadoConsultarNota)
                            .addComponent(jLabel1)
                            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                                .addComponent(jTextField060, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBuscarConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInstruct4ConsultarNota)
                            .addComponent(jLabelInstruct2ConsultarNota)
                            .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarNotaLayout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoConsultarNotaLayout.createSequentialGroup()
                                    .addComponent(jLabelInstruc1ConsultarNota)
                                    .addGap(19, 19, 19)))
                            .addComponent(jLabelInstruct3ConsultarNota)))))
        );
        jPanelFondoConsultarNotaLayout.setVerticalGroup(
            jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelIngresarNombreConsultarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField060, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultadoConsultarNota)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoConsultarNotaLayout.createSequentialGroup()
                        .addComponent(jLabelInstruc1ConsultarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInstruct2ConsultarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInstruct3ConsultarNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInstruct4ConsultarNota)
                        .addGap(17, 17, 17)
                        .addGroup(jPanelFondoConsultarNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPiePaginaConsultarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelFondoConsultarNota, java.awt.BorderLayout.CENTER);

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
        impresiones impresor = new impresiones();
        String nombreMateria = jTextField060.getText();
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            Estudiante estudiante = (Estudiante) user;
            ArrayList<String> Nota = NotasEstudiante(estudiante,nombreMateria);
            String notasFinales = impresor.mostrarNotas(Nota);
            jTextArea1.setText(notasFinales);
        }else{
            Papito padre = (Papito) user;
            ArrayList<String> Nota = NotasPapitos(padre,nombreMateria,i);
            String notasFinales = impresor.mostrarNotas(Nota);
            jTextArea1.setText(notasFinales);
        }
        
        
    }//GEN-LAST:event_jButtonBuscarConsultarNotaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ErrorNoEncontrado.dispose();
        jTextField060.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        i -= 1;
        EsconderBotones();
        colocarTitulo();
        jTextArea1.setText("");
        jTextField060.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        i += 1;
        EsconderBotones();
        colocarTitulo();
        jTextArea1.setText("");
        jTextField060.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Error(){
        ErrorNoEncontrado.setVisible(true);
        ErrorNoEncontrado.locate(500, 500);
        ErrorNoEncontrado.setSize(500,200);
    }
    
    public void colocarTitulo(){
        Papito padre = (Papito) LoginMain.usuarioActual.get(0);
        
        Estudiante estudiante = padre.getAcudeA().get(i);
        this.jLabel1.setText("ESTUDIANTE " + estudiante.getNombre().toUpperCase());
    }
    
    public void EsconderBotones(){
        Object user = LoginMain.usuarioActual.get(0);
        if(user.getClass() == Estudiante.class){
            jButton2.setVisible(false);
            jButton1.setVisible(false);
            jLabel1.setVisible(false);
        }else{
            colocarTitulo();
            if(i==0){
                Papito padre = (Papito) user;
                jButton2.setVisible(false);
                if(padre.getAcudeA().size() == 1){
                    jButton1.setVisible(false);
                }else{               
                    jButton1.setVisible(true);
                }
            }else{
                Papito padre = (Papito) user;
                if(i == (padre.getAcudeA().size() -1) ) {
                    jButton1.setVisible(false);
                }else{
                jButton1.setVisible(true);
                }
                jButton2.setVisible(true);
            }
        }
    }
    public ArrayList<String> NotasPapitos(Papito padre, String nombreMateria, int i){
        ArrayList<Estudiante> acudidos = padre.getAcudeA();
        ArrayList<String> notas = NotasEstudiante(acudidos.get(i),nombreMateria);
        return notas; 
    }
    
    public ArrayList<String> NotasEstudiante(Estudiante estudiante, String nombreMateria){
        Actualizaciones buscador = new Actualizaciones();
        consultas consultor = new consultas();
        ArrayList<String> notas = new ArrayList<String>();
        if(nombreMateria.equals("")){
            notas = consultor.consultarNotas(estudiante);           
        }else{
            ArrayList<Materia> materias = estudiante.getMateriasInscritas();
            Materia materia = buscador.buscarMateria(nombreMateria, materias);
            if(materia.getCodigo() != 0){
                notas = consultor.consultarNotas(estudiante, materia);
            }else{
                Error();
            }
        }
        
        return notas;
    }
            
            
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarNotasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ErrorNoEncontrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarConsultarNota;
    private javax.swing.JButton jButtonSalirConsultarNota;
    private javax.swing.JButton jButtonVolverConsultarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator060;
    private javax.swing.JSeparator jSeparator061;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField060;
    // End of variables declaration//GEN-END:variables
}
