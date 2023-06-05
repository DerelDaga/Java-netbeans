package herenciasuper;

import java.util.Random;

public class ClaseSuma extends ClaseSuper {
    Random r = new Random();
    public int vAux[];
    public int suma;
    
    public ClaseSuma(){
        suma =0;
    }
    
    public void llenarVector(){
        vAux = super.getV();
        for(int i=0; i<vAux.length; i++){
            vAux[i]= 10+r.nextInt(50);
            
            
        }
    
     }
    
    public void sumaVector(){
        for(int i=0; i<vAux.length; i++){
            suma = suma + vAux[i];
        }
    }
    
    public void imprimirVector(){
         for(int i=0; i<vAux.length; i++){
             System.out.println(vAux[i]);
         }
         System.out.println("La suma del vector es"+ suma);
    }
    
}
