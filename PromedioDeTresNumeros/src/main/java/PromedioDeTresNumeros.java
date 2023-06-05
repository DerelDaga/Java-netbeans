
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederj
 */
public class PromedioDeTresNumeros {
    
    public static void main(String[]args){
        Scanner cap= new  Scanner (System.in);
        int num1,num2,num3;
        float prom;
        
        System.out.print("Dame el numero 1");
        num1 = cap.nextInt();
        
        System.out.print("Dame el numeros 2");
        num2=cap.nextInt();
        
        
        System.out.print ("Dame el numero 3");
        num3 = cap.nextInt();
        
        prom = (num1 + num2 + num3) /3.0f;
         System.out.println("El promedio es " + prom);
        
        
        
        
        
    }
    
}
