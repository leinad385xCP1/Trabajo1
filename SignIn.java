import java.util.Scanner;

class SignIn {
  public static void main(String[] args) {
    
    String contrasenaBase = "salchipapa123";
    String usuarioBase = "daniel";
    String usuario;
    String contrasena;
  
    Scanner scanner = new Scanner(System.in);
    do{

        System.out.println("ingresa usuario");
    
            usuario = scanner.nextLine();

        System.out.println("ingrese contraseña");

            contrasena = scanner.nextLine();
     
      }while(((contrasenaBase.equals(contrasena))&&(usuarioBase.equals(usuario)))==false);

      System.out.println("bienvenido " + usuarioBase);

     scanner.close();
   }
} 
  