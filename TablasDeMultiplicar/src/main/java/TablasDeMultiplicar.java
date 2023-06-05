//Calcula las tablas de multiplicar
//17 de septiembre del 2021
//Eder Jasciel Davila Gallegos
/**
 *
 * @author ederj
 */
public class TablasDeMultiplicar {
    
    public static void main (String [] args){
        for (int i=1; i <= 10; i++){
            System.out.println("Tabla de multiplicar del ----" + i);
            
            for(int j=1; j<=10; j++){
                System.out.println(i + "X" + j + "=" + i*j);
            }
            
        }
    }
    
}
