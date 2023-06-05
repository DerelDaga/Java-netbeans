package ConversionMoneda;
import java.awt.event.*;
import javax.swing.*;

public class ClaseVentana extends JFrame implements ActionListener {
  private JLabel pesoLb;
    private JLabel dolarLb;
    private JLabel euroLb;
     private JLabel forintosLb;
    private JLabel liraLb;
    private JLabel libraLb;
    private JLabel yenLb;
    private JTextField pesoTxt;
    private JTextField dolarTxt;
    private JTextField euroTxt;
    private JTextField forintosTxt;
    private JTextField liraTxt;
    private JTextField libraTxt;
    private JTextField yenTxt;
    private JButton comBtn;
    private JButton clearBtn;
    
    public ClaseVentana(){
        super();
        inicializarVentana();
        inicializarComponentes();
        
    
    }
    
   public void inicializarVentana(){
       this.setTitle("Peso a Otras Monedas");
       this.setSize(800,500);
       this.setLocationRelativeTo(null);
       this.setLayout(null);
       this.setResizable(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void inicializarComponentes(){
       pesoLb = new JLabel("ingrese pesos: ");
       dolarLb = new JLabel("equivalencia dolar: ");
       euroLb = new JLabel("equivalencia euro: ");
       forintosLb = new JLabel("equivalencia forintos: ");
       liraLb = new JLabel("equivalencia lira: ");
       libraLb = new JLabel("equivalencia libra: ");
       yenLb = new JLabel("equivalencia yen: ");
       pesoTxt = new JTextField();
       dolarTxt = new JTextField();
       euroTxt = new JTextField();
       forintosTxt = new JTextField();
       liraTxt = new JTextField();
       libraTxt = new JTextField();
       yenTxt = new JTextField();
       comBtn = new JButton("equivalencia");
       clearBtn = new JButton("Limpiar");
       
       pesoLb.setBounds(50,55,150,25);
       pesoTxt.setBounds(160,55,150,25);
       
       dolarLb.setBounds(30,90,150,25);
       dolarTxt.setBounds(160,90,150,25);
       
       euroLb.setBounds(30,120,150,25);
       euroTxt.setBounds(160,120,150,25);
       
       forintosLb.setBounds(30,160,150,25);
       forintosTxt.setBounds(160,160,150,25);
       
       liraLb.setBounds(30,200,150,25);
       liraTxt.setBounds(160,200,150,25);
       
       libraLb.setBounds(30,240,150,25);
       libraTxt.setBounds(160,240,150,25);
       
       yenLb.setBounds(30,280,150,25);
       yenTxt.setBounds(160,280,150,25);
       
       comBtn.setBounds(400,100,150,60);
       clearBtn.setBounds(400,200,100,60);
       this.add(pesoLb);
       this.add(pesoTxt);
       this.add(dolarLb);
       this.add(dolarTxt); 
       this.add(euroLb);
       this.add(euroTxt); 
       this.add(forintosLb);
       this.add(forintosTxt);
       this.add(liraLb);
       this.add(liraTxt); 
       this.add(libraLb);
       this.add(libraTxt); 
       this.add(yenLb);
       this.add(yenTxt); 
       this.add(comBtn);       
       this.add(clearBtn);         
      comBtn.addActionListener(this);
      clearBtn.addActionListener(this);
                 
   }
   public void actionPerformed(ActionEvent e){
       float peso;
       float dolar;
       float euro;
       float forintos;
       float lira;
       float libra;
       float yen;
       if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           dolar = (float) (peso * 0.049);
           
            dolarTxt.setText(String.valueOf(dolar));
           }
        if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           euro = (float) (peso * 0.043);
           
            euroTxt.setText(String.valueOf(euro));
           }
         if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           forintos = (float) (peso * 15.46);
           
            forintosTxt.setText(String.valueOf(forintos));
           }
         if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           lira = (float) (peso * 0.48);
           
            liraTxt.setText(String.valueOf(lira));
           }
          if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           libra = (float) (peso * 0.036);
           
            libraTxt.setText(String.valueOf(libra));
             }
            if(e.getSource()==comBtn){
           peso = Float.parseFloat(pesoTxt.getText());
           yen = (float) (peso * 5.65);
           
            yenTxt.setText(String.valueOf(yen));
             }
       if(e.getSource()==clearBtn){
           pesoTxt.setText("");
           dolarTxt.setText("");
           euroTxt.setText("");
           forintosTxt.setText("");
           liraTxt.setText("");
           libraTxt.setText("");
           yenTxt.setText("");
       }
   }
}