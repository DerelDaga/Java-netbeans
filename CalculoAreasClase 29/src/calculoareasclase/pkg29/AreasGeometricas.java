// Eder Jasciel Davila Gallegos
package calculoareasclase.pkg29;

import java.util.Scanner;

public class AreasGeometricas {
    
public static void main(String[] args){
Scanner cap = new Scanner (System. in);

int op=0;
do {
System.out.println("Menu de Areas");
System.out.println("Triangulo--------->1");
System.out.println("Cuadrado---------->2");
System.out.println ("Circulo---------->3");
System.out.println ("Rectangulo------->4");
System.out.println("Salir-.-.-.-.-.-.XD");
System.out.print ("Dame la opcion --->...");
op=cap.nextInt();
switch(op){
case 1 : c.capturar (1);
break;
case 2 : c.capturar (2);
break;
case 3 : c.capturar (3);
break;
case 4 : c.capturar (4);
break;
case 5 : c.capturar (5);
break;
default: System.out.println ("Opcion incorrecta");
    
     }//Llave del switch
   }while(op!=5);
  }
}