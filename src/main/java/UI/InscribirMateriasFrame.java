
package UI;

import java.util.ArrayList;
import Logica.prueba2;
import Logica.Actualizaciones;
import Datos.Materia;
import Datos.Estudiante;

public class InscribirMateriasFrame extends javax.swing.JFrame {

  
    public InscribirMateriasFrame() {
        initComponents();
        meterElementos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MateriaInscrita = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelFondoInscribirMat = new javax.swing.JPanel();
        jPanelEncabezadoInscribirMat = new javax.swing.JPanel();
        jLabelTituloInscribirMat = new javax.swing.JLabel();
        jSeparator0100 = new javax.swing.JSeparator();
        jSeparator0101 = new javax.swing.JSeparator();
        jLabelMiniSIaInscribirMat = new javax.swing.JLabel();
        jPanelPiePaginaInscribirMat = new javax.swing.JPanel();
        jButtonSalirInscribirMat = new javax.swing.JButton();
        jButtonVolverInscribirMat = new javax.swing.JButton();
        jComboBoxInscribirMat = new javax.swing.JComboBox<>();
        jButtonInscribirInscribirMat = new javax.swing.JButton();
        jLabelInstruc1InscribirMat = new javax.swing.JLabel();
        jLabelInstruct2InscribirMat = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("MATERIA INSCRITA CON ÉXITO!!!");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MateriaInscritaLayout = new javax.swing.GroupLayout(MateriaInscrita.getContentPane());
        MateriaInscrita.getContentPane().setLayout(MateriaInscritaLayout);
        MateriaInscritaLayout.setHorizontalGroup(
            MateriaInscritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaInscritaLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(MateriaInscritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MateriaInscritaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MateriaInscritaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83))))
        );
        MateriaInscritaLayout.setVerticalGroup(
            MateriaInscritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaInscritaLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondoInscribirMat.setBackground(new java.awt.Color(205, 237, 246));

        jPanelEncabezadoInscribirMat.setBackground(new java.awt.Color(239, 123, 69));

        jLabelTituloInscribirMat.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabelTituloInscribirMat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloInscribirMat.setText("INSCRIBIR MATERIAS");

        jSeparator0101.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelMiniSIaInscribirMat.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabelMiniSIaInscribirMat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiniSIaInscribirMat.setText("MiniSia");

        javax.swing.GroupLayout jPanelEncabezadoInscribirMatLayout = new javax.swing.GroupLayout(jPanelEncabezadoInscribirMat);
        jPanelEncabezadoInscribirMat.setLayout(jPanelEncabezadoInscribirMatLayout);
        jPanelEncabezadoInscribirMatLayout.setHorizontalGroup(
            jPanelEncabezadoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoInscribirMatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator0100, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator0101, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMiniSIaInscribirMat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoInscribirMatLayout.setVerticalGroup(
            jPanelEncabezadoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator0101, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelEncabezadoInscribirMatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncabezadoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEncabezadoInscribirMatLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jLabelTituloInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator0100, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEncabezadoInscribirMatLayout.createSequentialGroup()
                        .addComponent(jLabelMiniSIaInscribirMat)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanelPiePaginaInscribirMat.setBackground(new java.awt.Color(239, 123, 69));

        jButtonSalirInscribirMat.setText("SALIR");
        jButtonSalirInscribirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirInscribirMatActionPerformed(evt);
            }
        });

        jButtonVolverInscribirMat.setText("VOLVER");
        jButtonVolverInscribirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverInscribirMatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiePaginaInscribirMatLayout = new javax.swing.GroupLayout(jPanelPiePaginaInscribirMat);
        jPanelPiePaginaInscribirMat.setLayout(jPanelPiePaginaInscribirMatLayout);
        jPanelPiePaginaInscribirMatLayout.setHorizontalGroup(
            jPanelPiePaginaInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaInscribirMatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVolverInscribirMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalirInscribirMat)
                .addGap(13, 13, 13))
        );
        jPanelPiePaginaInscribirMatLayout.setVerticalGroup(
            jPanelPiePaginaInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPiePaginaInscribirMatLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelPiePaginaInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirInscribirMat)
                    .addComponent(jButtonVolverInscribirMat))
                .addContainerGap())
        );

        jComboBoxInscribirMat.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jComboBoxInscribirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInscribirMatActionPerformed(evt);
            }
        });

        jButtonInscribirInscribirMat.setText("INSCRIBIR");
        jButtonInscribirInscribirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirInscribirMatActionPerformed(evt);
            }
        });

        jLabelInstruc1InscribirMat.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabelInstruc1InscribirMat.setText("Seleccione una materia y luego pulse \"INSCRIBIR\"");

        jLabelInstruct2InscribirMat.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabelInstruct2InscribirMat.setText(" para añadirla en sus materias inscritas");

        javax.swing.GroupLayout jPanelFondoInscribirMatLayout = new javax.swing.GroupLayout(jPanelFondoInscribirMat);
        jPanelFondoInscribirMat.setLayout(jPanelFondoInscribirMatLayout);
        jPanelFondoInscribirMatLayout.setHorizontalGroup(
            jPanelFondoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezadoInscribirMat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPiePaginaInscribirMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoInscribirMatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoInscribirMatLayout.createSequentialGroup()
                        .addComponent(jComboBoxInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonInscribirInscribirMat))
                    .addComponent(jLabelInstruc1InscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInstruct2InscribirMat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFondoInscribirMatLayout.setVerticalGroup(
            jPanelFondoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoInscribirMatLayout.createSequentialGroup()
                .addComponent(jPanelEncabezadoInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelInstruc1InscribirMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInstruct2InscribirMat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelFondoInscribirMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInscribirInscribirMat))
                .addGap(70, 70, 70)
                .addComponent(jPanelPiePaginaInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelFondoInscribirMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirInscribirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirInscribirMatActionPerformed
        // TODO add your handling code here:
        LoginMain.usuarioActual.remove(0);
        prueba2.CrearLogin();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirInscribirMatActionPerformed

    private void jButtonInscribirInscribirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirInscribirMatActionPerformed
        // TODO add your handling code here:
        Actualizaciones asignador = new Actualizaciones();
        String seleccion = jComboBoxInscribirMat.getSelectedItem().toString();
        Materia encontrada = asignador.buscarMateria(seleccion,prueba2.materias);
        if(encontrada.getCodigo() != 0){
            Estudiante estudiante = (Estudiante) LoginMain.usuarioActual.get(0);
            asignador.inscribirMateria(estudiante, encontrada);
            inscritaExito();
        }       
    }//GEN-LAST:event_jButtonInscribirInscribirMatActionPerformed

    private void jButtonVolverInscribirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverInscribirMatActionPerformed
        // TODO add your handling code here:
        prueba2.CrearInterfazEst();
        this.dispose();
    }//GEN-LAST:event_jButtonVolverInscribirMatActionPerformed

    private void jComboBoxInscribirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInscribirMatActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBoxInscribirMatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MateriaInscrita.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void meterElementos(){
        ArrayList<Materia> materiasAInscribir = prueba2.materias;
        for(Materia materia : materiasAInscribir){
            jComboBoxInscribirMat.addItem(materia.getNombre());
        }
    }
    
    public void inscritaExito(){
        MateriaInscrita.setVisible(true);
        MateriaInscrita.locate(700, 700);
        MateriaInscrita.setSize(500,200);
    }
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscribirMateriasFrame().setVisible(true);
            }
        });
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog MateriaInscrita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInscribirInscribirMat;
    private javax.swing.JButton jButtonSalirInscribirMat;
    private javax.swing.JButton jButtonVolverInscribirMat;
    private javax.swing.JComboBox<String> jComboBoxInscribirMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInstruc1InscribirMat;
    private javax.swing.JLabel jLabelInstruct2InscribirMat;
    private javax.swing.JLabel jLabelMiniSIaInscribirMat;
    private javax.swing.JLabel jLabelTituloInscribirMat;
    private javax.swing.JPanel jPanelEncabezadoInscribirMat;
    private javax.swing.JPanel jPanelFondoInscribirMat;
    private javax.swing.JPanel jPanelPiePaginaInscribirMat;
    private javax.swing.JSeparator jSeparator0100;
    private javax.swing.JSeparator jSeparator0101;
    // End of variables declaration//GEN-END:variables
}
