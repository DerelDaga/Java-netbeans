/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

/**
 *
 * @author Xasiel
 */
public class Fecha {
  private int dia;
    private int mes;
    private int año;
    private final String nomMes[];  
    
    public Fecha(){
        dia =0;
        mes =0;
        año =0;
        nomMes=new String []{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    }    
    public void setDia(int d){
        dia = d;
    }    
    public void setMes(int m) {
        mes = m;
    }    
    public void setAño(int a) {
        año = a;
    }    
    
    public int getDia(){
        return dia;
    }    
    
    public int getMes(){
       return mes;
    }   
   
    public int getAño(){
       return año;
    }   
    
    public String getFecha(){
        return dia + "/" + nomMes[mes]+"/"+ año;
    }
    public String getNombres(){
        return nomMes [mes];
    }
}