//Clase que convierte numeros decimales a romanos
package numerosromanosvisuales;


public class ClaseRomano {
    int numero;
    private String numRomano;
    private String cen[];
    private String dec[];
    private String uni[];
    private int c;
    private int d;
    private int u;
    
    public ClaseRomano(){
        numero=0;
        numRomano="";
        uni=new String[]{"","I","II","III","IV","V","VI","VII","VIII","XI","X"};
        dec=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        cen=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    }
    public void setNumero(int num){
        numero=num;
    }
    public String getNumRomano(){
        return numRomano;
    }
    public void convertir(){
        u=0;
        d=0;
        c=0;
        if ((numero >=1) && (numero <=9))
            u=numero;
        else{
            if((numero >=10)&&(numero <=99)){
            d=numero/10;
            u=numero % 10;
          }
            else { 
                if((numero <= 100)&&(numero<=999)){
                    
                    c=numero/100;
                    d=numero%100;
                    u=d /10;
                    d=d%10;
                }
                else
                    System.out.println("error de rango");
            }
        }
            numRomano = cen[c]+dec[c]+uni[u];
    }
 }
