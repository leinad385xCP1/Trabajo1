  import java.util.Scanner;

class Calculadora {
  public static void main(String[] args) {
     int numero1;
     int numero2;
    double resultadoDivision;
    
    System.out.println("bienvenido a calculadora");
    
     Scanner scanner = new Scanner(System.in);

          System.out.println("ingresa numero 1");
    
     numero1 = scanner.nextInt();

         System.out.println("ingresa numero 2");
    
     numero2 = scanner.nextInt();
     
     scanner.close();

    resultadoDivision = (double)numero1 /numero2;
    
     System.out.println("el resultado de la suma es " + (numero1+numero2));
     System.out.println("el resultado de la resta es " + (numero1-numero2));
     System.out.println("el resultado de la multiplicacion es " + (numero1*numero2));
     System.out.println("el resultado de la division es " + resultadoDivision);     
    
    }
} 