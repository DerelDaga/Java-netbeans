
package numerosromanosvisuales;
import java.awt.event.*;
import javax.swing.*;
public class ClaseVentana extends JFrame implements ActionListener {
    private JLabel decimalLb;
    private JLabel romanoLb;
    
    private JTextField decimalTxt;
    private JTextField romanoTxt;
    
    private JButton convertirBtn;
    private JButton limpiarBtn;
    private JButton emergenteBtn;
    
    
    public ClaseVentana(){
        super();
        inicializarVentana();
        inicializarComponentes();
    }
    
    public void inicializarVentana(){
        this.setTitle("Conversion a Decimales a romanos");
        this.setSize(1000,300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void inicializarComponentes(){
        decimalLb = new JLabel("Numero Decimal");
        romanoLb = new JLabel("Numero Romano");
        decimalTxt = new JTextField();
        romanoTxt = new JTextField();
        convertirBtn = new JButton("Convertir");
        limpiarBtn = new JButton("Limpiar");
        emergenteBtn = new JButton("Emergente");
        
        decimalLb.setBounds(50,50,100,25);
        decimalTxt.setBounds(150,50,100,25);
        romanoLb.setBounds(50,80,100,25);
        romanoTxt.setBounds(150,80,100,25);
        convertirBtn.setBounds(30,150,100,60);
        limpiarBtn.setBounds(150,150,100,60);
        emergenteBtn.setBounds(280,150,100,60);
        
        this.add(decimalLb);
        this.add(decimalTxt);
        this.add(romanoLb);
        this.add(romanoTxt);
        this.add(convertirBtn);
        this.add(limpiarBtn);
        this.add(emergenteBtn);
        
        convertirBtn.addActionListener(this);
        limpiarBtn.addActionListener(this);
        emergenteBtn.addActionListener(this);
        
        
    }
    public void actionPermormed(ActionEvent e){
        if(e.getSource()==limpiarBtn){
            decimalTxt.setText("");
            romanoTxt.setText("");
        }
        
    }
}
