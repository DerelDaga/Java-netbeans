package NavegacionVentanas;
import javax.swing.*;
import java.awt.event.*;

public class Ventana1 {
    
public class Ventana1 extends JFrame implements ActionListener
        
    private JButton siguiente;
    private JButton salir;
   
         
}   
public  Ventana1(){
    super();
inicializarVentana();
inicializarcomponentes();
            
}
public void inicializarVentana(){
    this.setTitle("Navegacion de Ventanas");
    this.setSize(1000,300);
    this.setLocationRelativeTo (null);
    this.setLayout (null);
    this.setResizable (true);
    this.setDefaulltCloseOperation(JFrame.EXIT_ON_CLOSE);
    
} 
public void inicializarComponentes(){
    siguiente = newJButton ("Siguiente");
    Salir= new JButton ("Salir");

    salir.setBounds(50,200,200,60);
    siguiente.setBounds(300,200,200,60);
}
public void actionPerformed(ActionEvent e){
if (e.getBounce() == siguiente ){

}
if(e.getBounce()== salir){

}
}