/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederj
 */
public class SimulacionDado {
 public static void main(String[] args) {
    int cnt1=0;
    int cnt2=0;
    int cnt3=0;
    int cnt4=0;
    int cnt5=0;
    int cnt6=0;
    int cara;
    String otro;
    do{
    
    for(int i=0; i<100; i++){
        
        cara= 1 + r.nextInt(6);
        
        switch(cara){
            
            case 1: cnt1=cnt1 + 1;
            break;
            case 2:cnt2=cnt2 + 1;
            break;
            case 3:cnt3=cnt3 + 1;
            break;
            case 4:cnt4=cnt4 + 1;
            break;
            case 5:cnt5=cnt5 + 1;
            break;
            case 6:cnt6=cnt6+ 1 ;
            break;
            default:System.out.println("Hola Xasiel");
        }//fin del switch    
    }//Fin del for
    System.out.print("\ncara1"+ cnt1);
    for(int i=0;i<cnt1; i++){
        System.out.print("*");
    }
     System.out.print("\n Cara 2"+ cnt2);
    for(int i=0;i<cnt2; i++){
        System.out.print("*");
    }
          System.out.print("\ncara3"+ cnt3);
    for(int i=0;i<cnt3; i++){
        System.out.print("*");
    }
          System.out.print("\ncara4"+ cnt4);
    for(int i=0;i<cnt4; i++){
        System.out.print("*");
    }
      System.out.print("\ncara5"+ cnt5);
    for(int i=0;i<cnt5; i++){
        System.out.print("*");
    }
      System.out.print("\ncara6"+ cnt6);
    for(int i=0;i<cnt6; i++){
        System.out.print("*");
    }
    System.out.println("\n \n");
    System.out.println("Deseas realizar otra simulacion? s/n");
    otro=cap.next();
    }while(!"n".equals(otro));
} //Fin del main
  
    

