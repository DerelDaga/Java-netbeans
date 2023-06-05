/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadosnumeros1;

 import java.awt.event.*;
 import javax.swing.*;


public class claseSuma extends JFrame implements ActionListener  {
        private JLabel num1Lb;
        private JLabel num2Lb;
        private JTextField num1Txt;
        private JTextField num2Txt;
        private JButton aceptarBtn;
        private JLabel resLb;
        
       public void claseSuma(){
            inicializarVentana();
            incializarComponentes();
       }
       
       
        public void inicializarVentana(){
            this.setTitle("Suman de dos   numeros (XD frijoles kon queso)");
         this.setSize (600, 250);
         this.setLocationRelativeTo (null);
         this.setLayout(null);
         this.setResizable(true);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        private void incializarComponentes() {
            num1Lb=new JLabel ("Pon el numero 1 compadre:");
            num2Lb=new JLabel ("Pon el numero 2 compadre");
            num1Txt=new JTextField();
            num2Txt=new JTextField();
            resLb=new JLabel ();
            aceptarBtn=new JButton("Simon Carnal xd");
            num1Lb.setBounds(30,50,150,25);
            num1Txt.setBounds(200,50,150,25);
            
            num2Lb.setBounds(30,80,150,25);
            num2Txt.setBounds(200,80,150,25);
            
            resLb.setBounds(50,110,150,25);
            aceptarBtn.setBounds(100,150,70,50);
            
            this.add(num1Lb);
            this.add(num2Lb);
            this.add(num1Txt);
            this.add(num2Txt);
            this.add(resLb);
            this.add(aceptarBtn);
            
            aceptarBtn.addActionListener(this);
        }
         
        public void actionPerformed(ActionEvent e){
             int num1;
             int num2;
             int suma;
             
             num1= Integer.parseInt(num1Lb.getText());
             num2= Integer.parseInt(num2Txt.getText());
            
             suma = num1 + num2;
             
             resLb.setText("El resultado de la suma = "+String.valueOf(suma));
        }
         
        
     
    }
    

