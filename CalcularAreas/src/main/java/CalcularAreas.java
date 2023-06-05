
import java.util.Scanner;

/*

//Eder Jasciel Davila Gallegos
//Calcula Areas Geometricas
 */

/**
 *
 * @author ederj
 */
public class CalcularAreas {
    public static void main(String[]args){
        Scanner cap=new Scanner(System.in);
        int opcion;
        int altura;
        float area;
        float radio;
        float lado;
        float base;
        float haltura;
        
        do{
            System.out.println("------MENU------");
            System.out.println("----------------" + "\n") ;
            System.out.println("Area de un triangulo------1");
            System.out.println("Area de un circulo----2");
            System.out.println("Area de un cuadrado----3");
            System.out.println("Area de un Rectangulo ------4");
            System.out.println("Salir");
            
          System.out.print("Dame la opcion");
          opcion=cap.nextInt();
          
          switch(opcion){
 //---------------------------------------------------------------------------             
          case 1 : System.out.print("Dame la base ");
                 base = cap.nextInt();
          System.out.print("Dame la altura");
          altura=cap.nextInt();
          area=base * altura /2.0f;
          System.out.println("El area del triangulo es-->" + area);
          break;
//----------------------------------------------------------------------------
          case 2:System.out.print("Dame el radio");
          radio=cap.nextFloat();
          area= 3.14f * radio*radio;
          System.out.println("El area del circulo es ---->");
          break;
//-------------------------------------------------------------------------------
          case 3:System.out.print("Dame el lado");
          lado=cap.nextFloat();
          area = lado * lado;
          System.out.println("El area del cuadrado es ---->");
              break;
//--------------------------------------------------------------------------------
           case 4:System.out.print("Dame la base");
          base=cap.nextFloat();
          System.out.print("Dame la base");
          haltura=cap.nextFloat();
          area = base * haltura;
          System.out.println("El area del rectangulo es ---->");
              break;
 //---------------------------------------------------------------------------             
  
          default: System.out.println("Opcion incorrecta");
            } //Fin del switchWhile (opcion)   
        }While(opcion)
    }    
}
    

        