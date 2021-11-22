/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Datos.*;
import Logica.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juan manuel
 */
public class uiProt extends javax.swing.JFrame {

    //Objetos globales, lista de estudiantes, profes
        ArrayList usuarios_estudiante = new ArrayList<Estudiante>(); 
        ArrayList usuarios_profesor = new ArrayList<Profesor>();
        ArrayList usuarios_papitos = new ArrayList<Papito>();
        
        //Estos objetos sirven para cada sesion, para poder comunicar datos entre las interfaces
        ArrayList  est_actual = new ArrayList<Estudiante>();
         ArrayList prof_actual = new ArrayList<Profesor>();
         ArrayList pap_actual = new ArrayList<Papito>();
         
         consultas logica_consultas = new consultas();
        

    /**
     * Creates new form uiProt
     */
    public uiProt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso_fallido = new javax.swing.JDialog();
        cerrar_ventana = new java.awt.Button();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ingresarUsuario = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        usuario_espacio = new javax.swing.JTextArea();
        boton_iniciar = new javax.swing.JButton();
        clave_espacio = new javax.swing.JPasswordField();

        cerrar_ventana.setLabel("Aceptar");
        cerrar_ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_ventanaActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Lo siento, has ingresado incorrectamente los datos, vuelve a intentarlo.");

        javax.swing.GroupLayout ingreso_fallidoLayout = new javax.swing.GroupLayout(ingreso_fallido.getContentPane());
        ingreso_fallido.getContentPane().setLayout(ingreso_fallidoLayout);
        ingreso_fallidoLayout.setHorizontalGroup(
            ingreso_fallidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingreso_fallidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ingreso_fallidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cerrar_ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        ingreso_fallidoLayout.setVerticalGroup(
            ingreso_fallidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingreso_fallidoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(cerrar_ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MinisiaV1");
        setBackground(new java.awt.Color(255, 255, 204));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("BIENVENIDO AL MiniSIA ");
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(jTextArea1);

        ingresarUsuario.setActionCommand("ingresarUsuario");
        ingresarUsuario.setLabel("Ingresar");
        ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usuario_espacio.setColumns(20);
        usuario_espacio.setRows(5);
        jScrollPane4.setViewportView(usuario_espacio);

        boton_iniciar.setText("iniciar");
        boton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciarActionPerformed(evt);
            }
        });

        clave_espacio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        clave_espacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clave_espacioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(clave_espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_iniciar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clave_espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(boton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        boton_iniciar.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarUsuarioActionPerformed
         
                //Generando objetos para probar el sistema:
     
        // Prueba
        
        String id_usuario_ = usuario_espacio.getText();
         int id_usuario = Integer.parseInt(id_usuario_);
         String clave_usuario = clave_espacio.getText();
         
            if( id_usuario <= 200){
            //busca entre profesores
      
            buscarProfesor(usuarios_profesor, id_usuario, clave_usuario );
          
        }
        
        if(id_usuario > 200 && id_usuario < 500){
            //busca entre papito
            buscarPapito(usuarios_papitos, id_usuario, clave_usuario );
        }
        
        if(id_usuario >=600 && id_usuario <= 800){
            //busca entre estudianto
            buscarEstudiante(usuarios_estudiante, id_usuario, clave_usuario );
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarUsuarioActionPerformed

    private void boton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciarActionPerformed
        iniciarSia();
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_iniciarActionPerformed

    private void cerrar_ventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_ventanaActionPerformed
        ingreso_fallido.setVisible(false);
    }//GEN-LAST:event_cerrar_ventanaActionPerformed

    private void clave_espacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clave_espacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clave_espacioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    
   
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uiProt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uiProt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uiProt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uiProt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uiProt().setVisible(true);
            }
        });
    }
    
    //METODOS PARA EL LOGIN
      public  void buscarProfesor(ArrayList<Profesor> lista, int id, String clave){
          boolean noSeEncontro = true;
        for(Profesor buscando: lista){
            if(buscando.getID()== id && buscando.getClave().equals(clave)){
                noSeEncontro = false;
                prof_actual.add(buscando);
            
                System.out.println("Bienvenido " + buscando.getNombre());
                System.out.println(prof_actual);
                //Se llama a metodo que le muestra la interfaz al profesor.
                interfazExitosa(buscando);
                
               
            }
        }
        //System.out.println("Id y/o clave incorrectos. Vuelva a intentar");
        if(noSeEncontro){
            interfazFallida();
        }
        //System.exit(1);
    }
    
     public  void buscarPapito(ArrayList<Papito> lista, int id, String clave){
         boolean noSeEncontro = true;
        for(Papito buscando: lista){
            if(buscando.getID()== id && buscando.getClave().equals(clave)){
                noSeEncontro = false;
                
                System.out.println("Bienvenido " + buscando.getNombre());
                pap_actual.add(buscando);
                 System.out.println(pap_actual);
                //Se llama a metodo que le muestra la interfaz al papito.
                interfazExitosa(buscando);
                
            }
        }
        
        //System.out.println("Id y/o clave incorrectos. Vuelva a intentar");
        if(noSeEncontro){
           interfazFallida();
        }
        
        //Hay un problema, y es con el login, si entras te sale la opción de volver a intentarlo
        //System.exit(1);
    }
     
      public  void buscarEstudiante(ArrayList<Estudiante> lista, int id, String clave){
          boolean noSeEncontro = true;
        for(Estudiante buscando: lista){
            if(buscando.getID()== id && buscando.getClave().equals(clave)){
                System.out.println("Bienvenido " + buscando.getNombre());
                noSeEncontro = false;
                est_actual.add(buscando);
                System.out.println(est_actual);
                //Se llama a metodo que le muestra la interfaz al profesor.
                interfazExitosa(buscando);
                 
             
            }
        }
        if(noSeEncontro){
            interfazFallida();
        }
        //System.exit(1);
    }
      //-------------------
      //METODO PARA "INICIAR" SISTEMA
    
    public void iniciarSia(){
             for(int i= 0; i< 10; i++){
            usuarios_papitos.add(new Papito());
        }
        
        for(int j=0; j<5; j++){
            usuarios_profesor.add(new Profesor());
        }
        
        for(int k=0; k<20; k++){
            usuarios_estudiante.add(new Estudiante());
        }
    
        //
        Estudiante est_prueb1 = (Estudiante) usuarios_estudiante.get(15);
        Profesor est_prueb2 = (Profesor) usuarios_profesor.get(1);
        Papito est_prueb3 = (Papito) usuarios_papitos.get(2);
        est_prueb1.setNombre("Juan Cortes");
        est_prueb2.setNombre("Arcenio Pecha");
        est_prueb3.setNombre("Padre Cardenas");
        
        int id_1 = est_prueb1.getID();
        String clave_1 = est_prueb1.getClave();
        
        int id_2 = est_prueb2.getID();
        String clave_2 = est_prueb2.getClave();
        
        int id_3 = est_prueb3.getID();
        String clave_3 = est_prueb3.getClave();
        
        
        System.out.println("Datos para prueba "+ est_prueb1.getNombre() +"\n id: " +id_1  + "\n clave: " + clave_1);
        System.out.println("Datos para prueba "+ est_prueb2.getNombre() +"\n id: " +id_2  + "\n clave: " + clave_2);
        System.out.println("Datos para prueba "+ est_prueb3.getNombre() +"\n id: " +id_3  + "\n clave: " + clave_3);
    }
    
    
    
    public void interfazFallida(){
        ingreso_fallido.setVisible(true);
        ingreso_fallido.setTitle("Vuelve a intentarlo");
         ingreso_fallido.locate(500, 500);
        ingreso_fallido.setSize(600,200);
        
    }
    
    public void interfazExitosa( Estudiante encontrado){
        /*
        jInternalFrame1.setVisible(false);
        interfazEstudiante.setAlwaysOnTop(true);
         interfazEstudiante.locate(300, 500);
        interfazEstudiante.setVisible(true);
        interfazEstudiante.setTitle("Interfaz Estudiante");
        mensajeBienvenida.setText("Bienvenido " + encontrado.getNombre());
        //mensajeBienvenida.setVisible(false);
        interfazEstudiante.setSize(500, 400);
        */
        
    }
    
    public void interfazExitosa(Profesor encontrado){
        /*
        mensajeBienvenidaProfesor.setVisible(true);
        mensajeBienvenidaProfesor.setText("Bienvenido " + encontrado.getNombre());
        interfazProfesor.setAlwaysOnTop(true);
        interfazProfesor.locate(300, 500);
        interfazProfesor.setVisible(true);
        interfazProfesor.setTitle("Interfaz Profesor");
        
        interfazProfesor.setSize(500, 400);
*/
        
    }
    
    public void interfazExitosa(Papito encontrado){
        
        /*
        //prueba set
        //Papito pruebaSet = (Papito) pap_actual.get(0);
        //pruebaSet.setUsuario("vivaAmlo");
        //aparentemente al setear el objeto desde otro objeto, se guarda en el objeto original
        //
          mensajeBienvenidaPapito.setVisible(true);
       mensajeBienvenidaPapito.setText("Bienvenido " + encontrado.getNombre());
       interfazPapito.setAlwaysOnTop(true);
       interfazPapito.locate(500, 500);
        interfazPapito.setVisible(true);
        interfazPapito.setTitle("Interfaz Papito");
        
        interfazPapito.setSize(500, 400);
*/
    }
    
    public void cerrarSesion (){
        est_actual.remove(0);
        prof_actual.remove(0);
        pap_actual.remove(0);
    }

    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_iniciar;
    private java.awt.Button cerrar_ventana;
    private javax.swing.JPasswordField clave_espacio;
    private java.awt.Button ingresarUsuario;
    private javax.swing.JDialog ingreso_fallido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    public javax.swing.JTextArea usuario_espacio;
    // End of variables declaration//GEN-END:variables
}
