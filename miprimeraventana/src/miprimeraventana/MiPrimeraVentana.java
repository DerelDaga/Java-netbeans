
    // programa.que crea una ventana 
// fecha:14/octubre/2021
// Eder Jasciel Davila Gallegos
package miprimeraventana;
public class Miprimeraventana {​​​
    public static void main(String[] args) {​​​
        ClaseVentana c = new ClaseVentana();
        c.setVisible(true);
                
    }​​​
    
}​​​
​[Ayer 13:48] MARIA PAULINA ORTEGA DURON
    package miprimeraventana;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public final class ClaseVentana extends JFrame implements ActionListener{​​​
    Random r = new Random();
    private JLabel nombreLb;
    private JTextField nombreTxt;
    private JButton aceptarBtn;
    private int numeroSuerte;
    private int suerte;
            
    
    public ClaseVentana(){​​​
        super();
        inicializarVentana();
        inicializarComponentes();
     }​​​
    
    public void inicializarVentana(){​​​
        this.setTitle("Mi primera ventana");
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }​​​
    
    public void inicializarComponentes(){​​​
        nombreLb = new JLabel();
        nombreTxt = new JTextField();
        aceptarBtn = new JButton();
        
        nombreLb.setBounds(50,50,150,25);
        nombreLb.setText("Ingresa tu nombre: ");
        
        nombreTxt.setBounds(200, 50,150,25);
        aceptarBtn.setBounds(150, 90,100,70);
        aceptarBtn.setText("Aceptar");
        
        
        this.add(nombreLb);
        this.add(nombreTxt);
        this.add(aceptarBtn);
        
        aceptarBtn.addActionListener(this);
        
    }​​​
    
    public void actionPerformed(ActionEvent e){​​​
        String nombre;
        numeroSuerte= 1+r.nextInt(50);
        nombre=nombreTxt.getText();
        JOptionPane.showMessageDialog(this,"hola " + nombre + "\n"+
                                       "tu numero de la suerte es " + numeroSuerte);
        
}​​​
    
  }​​​
