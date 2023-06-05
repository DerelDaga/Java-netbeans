package NavegacionVentanas;

import java.awt.event.*;
import javax.swing.*;


public class Ventana2 extends JFrame implements ActionListener {
     
    private JButton siguiente;
    private JButton salir;
   
         
}   
public  Ventana2(){
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
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
} 
public void inicializarComponentes(){
    siguiente = newJButton ("Siguiente");
    anterior = newJButton ("Anterior");

    siguiente.setBounds(50,200,200,60);
    anterior.setBounds(300,200,200,60);
this.add(siguiente);
this.add(anterior);

}

public void actionPerformed(ActionEvent e){
if (e.getSource() == siguiente ){

}
if(e.getSource()== anterior){
Ventana1 v1 = new Ventana1();
Ventana2 v2 = new Ventana();
v2.setVisible(false);
v1.setVisible(true);

}
}
    
}
