
package tarea3menu;

import java.util.Scanner;

public final class menuOpc {
    public int opc;
    public String[] usuario;
    public String nombreUsuario;
    public menuOpc(){
        opc = 0;
        nombreUsuario = "";
        
        
        usuario = new String[5];
        
        do {
            System.out.println("           Tarea3           ");
            System.out.println("         201403946          ");
            System.out.println(" 1. Usuarios                ");
            System.out.println(" 2. Palabras Palindromas    ");
            System.out.println(" 3. Salir");            
            Scanner leer = new Scanner(System.in);
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    menuUsuarios();
                    break;
                case 2:
                    polidromas();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No existe la Opcion");
                    break;

            }
        } while (opc != 3);
    }
    private void menuUsuarios(){
        System.out.println("      Menu de Usuarios              ");
        System.out.println(" 1. Ingresar Usuarios               ");
        System.out.println(" 2. Mostrar todos los Usuarios      ");
        System.out.println(" 3. Mostrar un Usuario Personalizado");
        System.out.println(" 4. Menu Principal                  ");
        System.out.println(" 5. Salir                           ");
        Scanner opcUs = new Scanner(System.in);
        opc = opcUs.nextInt();
        do {
            switch(opc){
                case 1:
                    ingresarUsuario();
                    break;
                case 2:
                    mostrarUsuario();
                    break;
                case 3:
                    usuarioPersonalizado();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("NO EXISTE ESTA OPCION");
                    break;
            }
            
        } while (opc != 4);
    }

    public void ingresarUsuario(){
        for (int i = 0; i < usuario.length; i++) {
            System.out.println("Ingrese un nuevo usuario: ");
            Scanner us = new Scanner(System.in);
            
            nombreUsuario = us.nextLine();
            usuario[i]= nombreUsuario;
                
            }
        menuUsuarios();
    }
    public void mostrarUsuario(){
        for (int i = 0; i < usuario.length; i++) {
            System.out.println((i+1)+". "+usuario[i]);            
        }
        menuUsuarios();
    }
    public void usuarioPersonalizado(){
  
        System.out.println("Ingrese un Usuario: ");
        Scanner usper = new Scanner(System.in);
        nombreUsuario = usper.nextLine();
        for (int i = 0; i < usuario.length; i++) {
            
            if (usuario[i].equals(nombreUsuario)) {
                System.out.println("Usuario");
                System.out.println(usuario[i]);

            } else {
                System.err.println("!!Error!! no existes el Usuario");
                
            }    
        }
        
        
        menuUsuarios();
    }
    public void polidromas(){}
    
}
