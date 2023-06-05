package herenciasuper;
public class ClaseVariables {
    private int v[];
    private int suma;
    private float prom;
    private int dia;
    
    public ClaseVariables(){
        suma=0;
        prom=0;
        dia =0;
    }
    
    public int getDia(){
        return dia;   
 
    }
    
    public void setDia(int d){
        dia = d;
    }
    
    public void dimencionarVector(){
        v=new int[dia];
        
    }
    
    public int [] getV(){
        return v;
    }
        
    
}
