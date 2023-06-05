// herencia con el comando super
// autor:Eder Jasciel Davila Gallegos
package herenciasuper;

import java.util.Scanner;

public class HerenciaSuper {

    public static void main(String[] args) {
Scanner cap=new Scanner (System.in);
        ClaseSuma c= new ClaseSuma();
        String otro = null;
        int dim;
        do{
            System.out.print("Dame la dimensiondel vextor");
            dim = cap.nextInt();
            System.out.print("Deseas realizar otro proceso s/n");
            otro=cap.next();
            c.dimensionarVector();
            c.llenarVector();
            c.sumaVector();
            c.imprimirVector();
        }while(!"new".equals(otro));
        

    }
    
}

