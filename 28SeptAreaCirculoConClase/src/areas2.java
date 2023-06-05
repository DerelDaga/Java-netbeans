public class areas2{
    
public static void main(String[] args){

int option = 15; 
while(option != 0) 
{ 
option = Menu(); 
switch (option) 
{ 
case 1: Triangulo(); break; case 2: Cuadrado(); break; case 3: Rectangulo(); break; case 4: Circulo(); break; case 5: Trapecio(); break; 
case 0: Exit(); 
} 
} 
} 
static int Menu() 
{ 
String option;
option = «0»; 
System.out.println("Menu"); 
System.out.println(""); 
System.out.println("1.- sacar el Area de un Triangulo"); 
System.out.println("2.- sacar el Area de un Cuadrado"); 
System.out.println("3.- sacar el Area de un Rectangulo"); 
System.out.println("4.- sacar el Area de un Circulo"); 
System.out.println("5.- sacar el Area de un Trapecio"); 
System.out.println("0.- salir");
option = JOptionPane.showInputDialog("seleccione su opcion"); 
return Integer.parseInt(option); 
} 
static void Triangulo() 
{ 
String P1,P2; int Base,Altura; float Area; 
P1 = JOptionPane.showInputDialog("Ingresa el valor de la base"); 
P2 = JOptionPane.showInputDialog("Ingresa el valor de la altura"); 
Base = Integer.parseInt(P1); 
Altura = Integer.parseInt(P2); 
Area = (float)Base * Altura/2; 
JOptionPane.showMessageDialog(null, ("El Area es:") + Area, ("Resultado") ,JOptionPane.PLAIN_MESSAGE ); 
} 
static void Cuadrado() 
{ 
String N1; int Lado; float Area; 
N1 = JOptionPane.showInputDialog("Ingresa el valor de un Lado"); 
Lado = Integer.parseInt(N1); 
Area = (float)Lado * Lado; 
JOptionPane.showMessageDialog(null, «El Area es: » + Area, «Resultado» 
,JOptionPane.PLAIN_MESSAGE ); 
} 
static void Rectangulo() 
{ 
String N1,N2; int Base,Altura; float Area; 
N1 = JOptionPane.showInputDialog(«Ingresa el valor de la Base»); 
N2 = JOptionPane.showInputDialog(«Ingresa el valor de la Altura»); 
Base = Integer.parseInt(N1); 
Altura = Integer.parseInt(N2); 
Area = (float)Base * Altura; 
JOptionPane.showMessageDialog(null, «El Area es: » + Area, «Resultado» 
,JOptionPane.PLAIN_MESSAGE ); 
} 
static void Circulo() 
{ 
String N1; int Radio; float Area; 
N1 = JOptionPane.showInputDialog(«Ingresa el valor del Radio»); 
Radio = Integer.parseInt(N1); 
Area = (float)3.1416 * (Radio^2); 
JOptionPane.showMessageDialog(null, «El Area es: » + Area, «Resultado» ,JOptionPane.PLAIN_MESSAGE ); 
} 
static void Trapecio() 
{ 
String N1,N2,N3; int BaseMayor,BaseMenor,Altura; float Area; 
N1 = JOptionPane.showInputDialog(«Ingresa el valor de la Base Mayor»); 
N2 = JOptionPane.showInputDialog(«Ingresa el valor de la Base Menor»); 
N3 = JOptionPane.showInputDialog(«Ingresa el valor de la Altura»); 
BaseMayor = Integer.parseInt(N1); 
BaseMenor = Integer.parseInt(N2); 
Altura = Integer.parseInt(N3); 
Area = (float)(BaseMayor * BaseMenor) * Altura/2; 
JOptionPane.showMessageDialog(null, «El Area es: » + Area, «Resultado» 
,JOptionPane.PLAIN_MESSAGE ); 
} 
static void Exit() 
{ 
JOptionPane.showMessageDialog(null,»FIN DEL SISTEMA xD», «Exit» 
,JOptionPane.PLAIN_MESSAGE); 
} 
} 
 
