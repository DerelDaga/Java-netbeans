import java.util.Scanner;
public class CalculadoraVectores 
{
    static Scanner entrada=new Scanner(System.in);

int opcion;
int v1;
int v2;
int v3;//Su ma, resta, multiplicacion
float v4 ;//Division
String signo;
do{

	System.out.print("CALCULADORA DE VECTORAS XD");
	System.out.print("Suma<<<<<<<<<<<<<  1  >>>>>>");
	System.out.print("Resta<<<<<<<<<<<<  2  >>>>>>");
	System.out.print("Multiplicacion<<<  3  >>>>>>");
	System.out.print("Division<<<<<<<<<  4  >>>>>>");
	
	System.out.print("Salir<<<<<<<<<<<<  5  >>>>>>");
	
	System.out.print("adame la opcion");
	opcion=entrada.nextInt();
    //llena los vectores de manera aleatoria
for (int i=0; i<10;i++){
    	v1=(int)(Math. random()*50+1);
    	v2=(int)(Math. random()*50+1);
	}//fin del for
	switch(opcion){
          case 1: for(int i=0;i<10;i++){
		v3=v1+v2;	
		  }
		  signo="+";
                   System.out.print("\n"+ v3);
		
		  break;
          case 2:for(int i=0;i<10;i++){
		v3=v1-v2;	
		  }
		  signo="-";
		 break;
          case 3:
          	for(int i=0;i<10;i++){
		v3=v1*v2;	
		  }
		  signo="X";
		break;
          
		
          case 4:for(int i=0;i<10;i++){
		v4=v1/v2;	
		  }
		  signo="/";
		break;

          default:System.out.println("Hola Ta mal compa");
   
   }   //Fin del switch
   if((opcion>=1) && (opcion <=4)){
   
   for (int i=0;i<10;i++){
         System.out.print("\n"+ v1);
  
         System.out.print("\n"+ v2);
   	 System.out.print("\n"+ signo);
   	 System.out.print("=");
   	 System.out.print("\n"+ v3);
   	
  if (opcion ==4)
       System.out.print("\n"+ v4);
  else
       System.out.print("\n"+ v3);
   
}
   //imprimir los vectores
}while (opcion!=5);


}//fin de main
    
    
    

}while (opcion!=5);