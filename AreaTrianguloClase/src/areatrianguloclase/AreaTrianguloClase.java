//Eder Jasciel Davila Gallegos
package areatrianguloclase;
import java.util.Scanner;

public class AreaTrianguloClase {
    
     Scanner cap=new Scanner (System.in);
private int base;
private int altura;
private float area;
public void capturar(){
    System.out.print("Dame la base");
    base= cap.nextInt();
    System.out.print("Dame la altura");
    altura= cap.nextInt();
     }
public void calcular(){
    area=base*altura/2.0f;
 }
 public void imprimir(){
     System.out.println("El area del triangulo es:---->"+area);
 }
    }
    
