
package UI;
import Datos.*;
import Logica.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class LoginMain extends javax.swing.JFrame {


    
    //INSTANCIACION OBJETOS DE LA CAPA DE DATOS
    
    
    
    //ESTUDIANTES
    Estudiante estudiante1 = new Estudiante("Jose Simon Ramos Sandoval", 17);
    
    Estudiante estudiante2 = new Estudiante("Juan Manuel Cortes Jiménez", 17);
    
    Estudiante estudiante3 = new Estudiante("Jefferson Duván Ramírez Castañeda",19);
    
    //SUBSIDIOS
    
    ArrayList<Estudiante> beneficiariosSubsidio1 = new ArrayList<>(Arrays.asList(
    estudiante1, estudiante2)); 
    ArrayList<Estudiante> beneficiariosSubsidio2 = new ArrayList<>(Arrays.asList(
    estudiante2, estudiante3)); 
    
    Subsidio subsidio1 = prueba2.subsidio1prueba; 
            //beneficiariosSubsidio1);
    Subsidio subsidio2 = prueba2.subsidio2prueba; 
            //beneficiariosSubsidio2);
    
    //PROFESORES
    
    Profesor profe1 = new Profesor("Jonatan Arcenio Pecha Perdomo", 43,
            "jonapepe@gmail.com.co");
    Profesor profe2 = new Profesor("Natalia Paola Peña Cardona", 30,
            "napacar@gmail.com.co");
    Profesor profe3 = new Profesor("Pedro Vargas Soto", 45, "peva@gmail.com");
    
    Profesor profe4 = new Profesor("Alexa Garzón Márquez", 37, 
            "alega@gmail.com");
    
    //PAPITOS
    
    ArrayList estudiantesPapito1 = new ArrayList<>(Arrays.asList(estudiante1,estudiante2));
    ArrayList estudiantesPapito2 = new ArrayList<>(Arrays.asList(estudiante3));
    
    
    Papito papito1 = new Papito("Eloisa Ramos Jiménez", estudiantesPapito1, 
        "SF546b");
    Papito papito2 = new Papito("Victor Ramírez Torres", estudiantesPapito2, 
        "VR235n");
    
    // MATERIAS
    
    Materia materia1 = prueba2.materia1prueba; 
    Materia materia2 = prueba2.materia2prueba;
    
    // GRUPOS
    
    ArrayList<String> HorarioGrupo1= new ArrayList<>(Arrays.asList(
    "LUNES 9am-11am", "", "MIERCOLES 9am-11am","",""));
    ArrayList<String> HorarioGrupo2= new ArrayList<>(Arrays.asList(
    "", "MARTES 7am-9am", "", "JUEVES 7am-9am", ""));
    ArrayList<String> HorarioGrupo3= new ArrayList<>(Arrays.asList(
    "", "", "MIERCOLES 2pm-4pm", "", "VIERNES 2pm-4pm"));
    ArrayList<String> HorarioGrupo4= new ArrayList<>(Arrays.asList(
    "LUNES 1pm-3pm","","MIERCOLES 1pm-3pm", "", ""));
    
    ArrayList<Estudiante> estudiantesGrupo1 = new ArrayList<>(Arrays.asList(
    estudiante1 ,estudiante2));
    ArrayList<Estudiante> estudiantesGrupo2 = new ArrayList<>(Arrays.asList(
    estudiante3));
    ArrayList<Estudiante> estudiantesGrupo3 = new ArrayList<>(Arrays.asList(
    estudiante1 ,estudiante3));
    ArrayList<Estudiante> estudiantesGrupo4 = new ArrayList<>(Arrays.asList(
    estudiante2));
    
    
    Grupo grupo1 = new Grupo(profe1,1, HorarioGrupo1,60,materia1, estudiantesGrupo1);
    Grupo grupo2 = new Grupo(profe4, 2, HorarioGrupo2, 55, materia1, estudiantesGrupo2);
    Grupo grupo3 = new Grupo(profe2,1, HorarioGrupo3,30, materia2, estudiantesGrupo3);
    Grupo grupo4 = new Grupo(profe3,2,HorarioGrupo3,35,materia2,estudiantesGrupo4);
    
    //NOTAS
    
    Nota grup1est1 = new Nota(0,estudiante1);
    Nota grup1est2 = new Nota(0,estudiante2);
    
    Nota grup2est3 = new Nota(0,estudiante3);
    
    Nota grup3est1 = new Nota(0,estudiante1);
    Nota grup3est3 = new Nota(0, estudiante3);
    
    Nota grup4est2 = new Nota(0, estudiante2);
    
    // ASIGNACIONES DATOS FALTANTES
    
    public void asignarDatosFaltantes(){
        // ESTUDIANTE
        estudiante1.setAcudiente(papito1);
        estudiante2.setAcudiente(papito1);
        estudiante3.setAcudiente(papito2);
        ArrayList<Materia> materiasEstudiante = new ArrayList<>(Arrays.asList(
        materia1,materia2));
        estudiante1.setMateriasInscritas(materiasEstudiante);
        //ESTUDIANTE2 NO VE NINGUNA MATERIA
        estudiante3.setMateriasInscritas(materiasEstudiante);
        ArrayList<Subsidio> subsidiosEstudiante1 = new ArrayList<>(Arrays.asList(
                subsidio1));
        ArrayList<Subsidio> subsidiosEstudiante2 = new ArrayList<>(Arrays.asList(
                subsidio1, subsidio2));
        ArrayList<Subsidio> subsidiosEstudiante3 = new ArrayList<>(Arrays.asList(
                subsidio2));
        estudiante1.setSubsidios(subsidiosEstudiante1);
        estudiante2.setSubsidios(subsidiosEstudiante2);
        estudiante3.setSubsidios(subsidiosEstudiante3);
        ArrayList<Grupo> gruposEstudiante1 = new ArrayList<>(Arrays.asList(
                grupo1, grupo3));
        ArrayList<Grupo> gruposEstudiante2 = new ArrayList<>(Arrays.asList(
                grupo1, grupo4));
        ArrayList<Grupo> gruposEstudiante3 = new ArrayList<>(Arrays.asList(
                grupo2, grupo3));
        estudiante1.setAtiende(gruposEstudiante1);
        estudiante2.setAtiende(gruposEstudiante2);
        estudiante3.setAtiende(gruposEstudiante3);
        estudiante1.setClave("JS2324s");
        estudiante2.setClave("KS234f");
        estudiante3.setClave("JF230d");
        
        //PROFES
        
        profe1.setCursos(new ArrayList(Arrays.asList(grupo1)));
        profe2.setCursos(new ArrayList(Arrays.asList(grupo3)));
        profe3.setCursos(new ArrayList(Arrays.asList(grupo4)));
        profe4.setCursos(new ArrayList(Arrays.asList(grupo2)));
        profe1.setClave("JP2334x");
        profe2.setClave("NS234v");
        profe3.setClave("NL234m");
        profe4.setClave("LO2345m");
        
        //MATERIAS
        
        materia1.setGrupos(new ArrayList(Arrays.asList(grupo1,grupo2)));
        materia2.setGrupos(new ArrayList(Arrays.asList(grupo3, grupo4)));
        
        //GRUPOS
        HashMap<String, Nota> notasGrupo1 = new HashMap();
        notasGrupo1.put(String.valueOf(estudiante1.getID()), grup1est1);
        notasGrupo1.put(String.valueOf(estudiante2.getID()), grup1est2);
        grupo1.setNotasGrupo(notasGrupo1);
        
        HashMap<String, Nota> notasGrupo2 = new HashMap();
        notasGrupo2.put(String.valueOf(estudiante3.getID()), grup2est3);
        grupo2.setNotasGrupo(notasGrupo2);
        
        HashMap<String, Nota> notasGrupo3 = new HashMap();
        notasGrupo3.put(String.valueOf(estudiante1.getID()), grup3est1);
        notasGrupo3.put(String.valueOf(estudiante3.getID()), grup3est3);
        grupo3.setNotasGrupo(notasGrupo3);
        
        HashMap<String, Nota> notasGrupo4 = new HashMap();
        notasGrupo4.put(String.valueOf(estudiante2.getID()), grup4est2);
        grupo4.setNotasGrupo(notasGrupo4);
        
        //SUBSIDIOS
        subsidio1.setBeneficiarios(beneficiariosSubsidio1);
        subsidio2.setBeneficiarios(beneficiariosSubsidio2);
        
    }
    
    
    
    ArrayList usuariosEstudiante = new ArrayList(Arrays.asList(
            estudiante1, estudiante2, estudiante3)); 
    
    ArrayList usuariosProfesor = new ArrayList(Arrays.asList(
            profe1, profe2, profe3, profe4));
    
    ArrayList usuariosPapitos = new ArrayList(Arrays.asList(papito1,papito2));

    //ARRAY PARA COMUNICAR OBJETOS ENTRE INTERFACES
     
    public static ArrayList usuarioActual = new ArrayList<Estudiante>();       

    public LoginMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreso_fallido = new javax.swing.JDialog();
        cerrar_ventana = new java.awt.Button();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        usuario_espacio = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        clave_espacio = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        boton_iniciar = new javax.swing.JButton();
        ingresarUsuario = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(205, 237, 246));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usuario_espacio.setColumns(20);
        usuario_espacio.setRows(5);
        jScrollPane4.setViewportView(usuario_espacio);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");

        clave_espacio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        clave_espacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clave_espacioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        boton_iniciar.setText("iniciar");
        boton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciarActionPerformed(evt);
            }
        });

        ingresarUsuario.setActionCommand("ingresarUsuario");
        ingresarUsuario.setLabel("Ingresar");
        ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarUsuarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(239, 123, 69));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BIENVENIDO AL MINISIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_iniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave_espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave_espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        boton_iniciar.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarUsuarioActionPerformed
     
        // CADA TIPO DE USUARIO TIENE UN ID ESPECIAL 
        String id_usuario_ = usuario_espacio.getText();
        int id_usuario = Integer.parseInt(id_usuario_);
        String clave_usuario = clave_espacio.getText();
         
        if( id_usuario <= 200){
            //busca entre profesores
            buscarProfesor(usuariosProfesor, id_usuario, clave_usuario );
        }else{
            if(id_usuario < 500){
            //busca entre papito
            buscarPapito(usuariosPapitos, id_usuario, clave_usuario );
            }else{
                if(id_usuario <= 800){
                //busca entre estudiantes
                buscarEstudiante(usuariosEstudiante, id_usuario, clave_usuario );
                }else{
                    interfazFallida();
                    }
                }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarUsuarioActionPerformed

    private void boton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciarActionPerformed
        iniciarSia(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_iniciarActionPerformed

    private void cerrar_ventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_ventanaActionPerformed
        ingreso_fallido.setVisible(false);
        this.usuario_espacio.setText("");
        this.clave_espacio.setText("");
        this.setVisible(true);
    }//GEN-LAST:event_cerrar_ventanaActionPerformed

    private void clave_espacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clave_espacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clave_espacioActionPerformed


    public static void main(String args[]) { 
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }
    
    //METODOS PARA EL LOGIN
      public  void buscarProfesor(ArrayList<Profesor> lista, int id, String clave){
        int i = 0;
        int n = lista.size();
        /*La condición del siguiente ciclo es continuar aumentado el contador 
        hasta que se termine la lista o hasta que se encuentre al profesor en la lista
        La segunda condición tal vez sea la más confusa, pero el profesor NO se ha encontrado
        mientras que su ID o su clave sea diferente a la evaluada*/
        while(i<n && (lista.get(i).getID()!= id || !(lista.get(i).getClave().equals(clave) )) ){
            i ++;
        }
        if(i<n){
            Profesor profe = lista.get(i);
            usuarioActual.add(profe);
            //System.out.println("Bienvenido " + profe.getNombre());
            //System.out.println(prueba2.usuarioActual);
            //InterfazProfesor profeFrame = new InterfazProfesor();
            //profeFrame.setVisible(true);
            prueba2.CrearInterfazProf();
    }else{
            interfazFallida();
         }
        this.dispose();
    }
    
     public  void buscarPapito(ArrayList<Papito> lista, int id, String clave){
        int i = 0;
        int n = lista.size();
        while ( i<n && ( lista.get(i).getID() != id || !(lista.get(i).getClave().equals(clave)) ) ){
            i ++;
        }
        if(i<n){
            Papito padre = lista.get(i);
            usuarioActual.add(padre);
            //System.out.println("Bienvenido " + padre.getNombre());
            //System.out.println(prueba2.usuarioActual);
            prueba2.CrearInterfazPapa();
        }else{
            interfazFallida();
        }
        this.dispose();
        
        
        //Hay un problema, y es con el login, si entras te sale la opción de volver a intentarlo
        //System.exit(1);
    }
     
      public  void buscarEstudiante(ArrayList<Estudiante> lista, int id, String clave){
          int i = 0;
          int n = lista.size();
          while (i<n && ( lista.get(i).getID() != id || !(lista.get(i).getClave().equals(clave)) )){
              i ++;
          }
          if(i<n){
              Estudiante estudiante = lista.get(i);
              usuarioActual.add(estudiante);
              //System.out.println("Bienvenido " + estudiante.getNombre());
              //System.out.println(prueba2.usuarioActual);
              prueba2.CrearInterfazEst();

          }else{
              interfazFallida();
          }
          this.dispose();
    }
      //-------------------
      //METODO PARA "INICIAR" SISTEMA
    
    public  void iniciarSia(){
        asignarDatosFaltantes();
        
        System.out.println("DATOS ESTUDIANTES: \n");
        
        int idE1 = estudiante1.getID();
        String claveE1 = estudiante1.getClave();
        
        int idE2 = estudiante2.getID();
        String claveE2 = estudiante2.getClave();
        
        int idE3 = estudiante3.getID();
        String claveE3 = estudiante3.getClave();
        
        
        System.out.println(estudiante1.getNombre() + " " + idE1 + " " + claveE1);
        System.out.println(estudiante2.getNombre() + " " + idE2 + " " + claveE2);
        System.out.println(estudiante3.getNombre() + " " + idE3 + " " + claveE3);
        
        System.out.println("DATOS PROFESORES: \n");
        
        int idP1 = profe1.getID();
        String claveP1 = profe1.getClave();
        
        int idP2 = profe2.getID();
        String claveP2 = profe2.getClave();
        
        int idP3 = profe3.getID();
        String claveP3 = profe3.getClave();
        
        int idP4 = profe4.getID();
        String claveP4 = profe4.getClave();
        
        System.out.println(profe1.getNombre() + " " + idP1 + " " + claveP1);
        System.out.println(profe2.getNombre() + " " + idP2 + " " + claveP2);
        System.out.println(profe3.getNombre() + " " + idP3 + " " + claveP3);
        System.out.println(profe4.getNombre() + " " + idP4 + " " + claveP4);
        
        System.out.println("DATOS PAPITOS: \n");
        
        int idPp1 = papito1.getID();
        String clavePp1 = papito1.getClave();
        
        int idPp2 = papito2.getID();
        String clavePp2 = papito2.getClave();
        
        System.out.println(papito1.getNombre() + " " + idPp1 + " " + clavePp1);
        System.out.println(papito2.getNombre() + " " + idPp2 + " " + clavePp2);
    }
    
    
    
    public void interfazFallida(){
        ingreso_fallido.setVisible(true);
        ingreso_fallido.setTitle("Vuelve a intentarlo");
        ingreso_fallido.locate(500, 500);
        ingreso_fallido.setSize(600,200);
        
    }
    
    
    

    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_iniciar;
    private java.awt.Button cerrar_ventana;
    private javax.swing.JPasswordField clave_espacio;
    private java.awt.Button ingresarUsuario;
    private javax.swing.JDialog ingreso_fallido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    public javax.swing.JTextArea usuario_espacio;
    // End of variables declaration//GEN-END:variables
}
