package herenciasuper;
public class ClaseSuper {
    private int v[];
    private int suma;
    private float prom;
    private int dia;
    
    public ClaseSuper(){
      suma =0;
      prom =0;
      dia = 0;
    
}
      
    public int getDia(){
        return dia;
    }
   
    public void setDia(int d){
        dia = d;
    }
    
    public void dimensionarVector(){
        v=new int[dia];
    }
    
    public int [] getV(){
        return v;
    }
}
