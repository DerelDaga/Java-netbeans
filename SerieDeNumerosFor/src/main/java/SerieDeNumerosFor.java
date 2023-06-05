//Programa que realiza una serie de numeros utilizando for
//17 de septiembre 
//Eder Jasciel Davila Gallegos

/**
 *
 * @author ederj
 */
public class SerieDeNumerosFor {
    
    public static void main (String[]args){
        
        System.out.println ("Series de numeros Pares \n\n");
        
                for (int i=0;i<=100;i=i+2){
                    
                    System.out.print (1 + ",");
                    
                }//fin del for
                
                System.out.println("Serie de numeros pares");
                for (int i=1;i<=100;i++){
                    if (i % 5 == 0)
                        System.out.print("Eder,");
                    else
                        System.out.print(i+",");
                }
    }//fin del main
    
}//fin de la clase

