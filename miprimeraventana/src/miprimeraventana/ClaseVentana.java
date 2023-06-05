package Miprimeraventana;

import javax.swing.*;

public class ClaseVentana extends JFrame {
    private JLabel nombreLb;
    private JTextField nombreTxt;
    private JButton aceptarBtn;
    private int numeroSuerte;
    
    
    public ClaseVentana(){
        super();
        inicializarVentana();
        inicializarComponentes();
    }
    
    public void inicializarVentana(){
           this.setTitle("Mi primera ventana");
  
            this.setSize(500,300);      
    this.setLocationRelativeTo(null);
    this.setLayout(null);  
    this.setResizable(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  }
  
     public void inicializarComponentes(){
         nombreLb=new JLabel();
         nombreTxt=new JTextField();
         aceptarBtn=new JButton();
         nombreLb.setBounds(50,50, 75, 30);
         nombreLb.setText("Ingresa tu nombre");
         
         
            
    }
}
    
