
package convenciongradosfarenjeid;
import java.awt.event.*;
import javax.swing.*;

public class ClaseVentana extends JFrame implements ActionListener {
    private JLabel oCLb;
    private JLabel oFLb;
    private JLabel oCEqLb;
    private JLabel oFEqLb;
    private JTextField oCTxt;
    private JTextField oFTxt;
    private JTextField oCBtn;
    private JTextField oCEqTxt;
    private JTextField oFEqTxt;
    private JButton oFBtn;
    private JButton clearBtn;
    
    public ClaseVentana(){
        super();
        inicializarVentana();
        inicializarComponentes();
    }

    public void inicializarVentana(){
        this.setTitle("Convercion de oC a oF ");
        this.setSize(1000,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void inicializarComponentes(){
        oCLb=new JLabel ("Ingrece Oc");
        oCEqLb = new JLabel ("Equivalencia oF");
        oFLb=new JLabel("ingrese oF");
        oFEqLb= new JLabel ("equivalencia oC");
        
        oCTxt=new JTextField();
        oFTxt=new JTextField();
        oCEqTxt = new JTextField();
        oFEqTxt = new JTextField();
       

        oFBtn = new JButton("DE oC a oF");
        clearBtn = new JButton ("Limpiar");
        
        oCLb.setBounds(50,50,100,25);
        oCTxt.setBounds(150,50,100,25);
        oCEqLb.setBounds(400,50,100,25);
        oCEqTxt.setBounds(500, 50, 100, 25);
        oCBtn.setBounds(700, 50, 100, 50);
        
        oFLb.setBounds (50,80,100,25);
        oFTxt.setBounds(150,80,100,25);
        oFEqLb.setBounds(700,150,100,50);
        
        oFBtn.setBounds (40,110,100,60);
        clearBtn.setBounds(200,110,100,160);
        
        
        
        this.add(oCLb);
        this.add(oCTxt);
        this.add(oFLb);
        this.add(oFTxt);
        this.add(oFBtn);
        this.add(oCEqLb);
        this.add(oCEqTxt);
        this.add(oFEqTxt);
        this.add(oFEqLb);
        
        this.add(clearBtn);
        
        oCBtn.addActionListener(this);
        oFBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        
    }
public void actionPerformed(ActionEvent e){
    float oC;
    float oF;
    
    if(e.getSource()==oFBtn){
        oC = Float.parseFloat(oCTxt.getText());
        oF = 1.8f * oC +32;
        
        oCEqTxt.setText(String.valueOf(oF));
        
    }
    if(e.getSource()==clearBtn){

        oF = Float.parseFloat(oFTxt.getText());
        oC = (oF-32)*5/9;
    }
    
  }


}

