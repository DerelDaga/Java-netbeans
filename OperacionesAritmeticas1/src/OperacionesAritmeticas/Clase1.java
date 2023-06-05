package OperacionesAritmeticas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.AncestorListener;

public class Clase1  extends JFrame implements ActionListener {
   private JLabel num1Lb;
   private JLabel num2Lb;
   private JLabel resLb;
   private JTextField num1Txt;
   private JTextField num2Txt;
   private JTextField resTxt;   
   
   private JButton sumaBtn;
   private JButton restaBtn;
   private JButton multiplicaBtn;
   private JButton divisionBtn;
   
   public Clase1(){
       super();
       inicializarVentana();
       inicializarComponentes();
   }
   public void inicializarVentana(){
       
   }
   
   public void inicilizarComponentes(){
       
        this.setTitle("Operaciones Aritmeticas");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(true);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   }    
        
   public void inicializarComponentes(){
       num1Lb = new JLabel("Inserta el numero 1 ");
       num2Lb = new JLabel("Inserta el numero 2 ");
       resLb = new JLabel("Resultado");
       
       num1Txt = new JTextField();
       num2Txt = new JTextField();
       resTxt = new JTextField();
       
       sumaBtn = new JButton("Suma");
       restaBtn = new JButton("Resta");
       multiplicaBtn = new JButton("Multiplicacion");
       divisionBtn = new JButton("Division");
       
       num1Lb.setBounds(50,50,150,25);
       num1Txt.setBounds(200,50,150,25);
       num2Txt.setBounds(50,80,150,25);
       num2Txt.setBounds(200,110,250,25);
       resLb.setBounds(50,110,250,25);
       resTxt.setBounds(200,110,250,25);
       sumaBtn.setBounds(45,150,100,50);
       restaBtn.setBounds(260,150,100,50);
       multiplicaBtn.setBounds(260,150,100,50);
       divisionBtn.setBounds(370,150,100,50);
       
       this.add(num1Lb);
       this.add(num2Lb);
       this.add(resLb);
       this.add(num1Txt);
       this.add(num2Txt);
       this.add(resTxt);
       this.add(sumaBtn);
       this.add(restaBtn);
       this.add(multiplicaBtn);
       this.add(divisionBtn);
       
       sumaBtn.addAncestorListener((AncestorListener) this);
       restaBtn.addActionListener(this);
       multiplicaBtn.addActionListener(this);
       divisionBtn.addActionListener(this);
}
    public void actionPerformed(ActionEvent e ){
        int num1;
        int num2;
        float res=0;
        num1=Integer.parseInt(num1Txt.getText());
        num2=Integer.parseInt(num1Txt.getText());
        if(e.getSource ()==sumaBtn){
             res = num1 + num2;
          
        if(e.getSource()==restaBtn){
            res = num1 + num2;
   
            
        if(e.getSource()==divisionBtn)    
            res = num1 / num2;
        
        }    
        resTxt.setText(String.valueOf(res));
            res = num1 - num2;       
    }
  }
}