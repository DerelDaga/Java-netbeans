package operacionesaritherr;
public class ClaseVentana extends javax.swing.JFrame {
private int num1;
private int num2;
private int res;
private float resD;

    public ClaseVentana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num1Txt = new javax.swing.JTextField();
        num2Txt = new javax.swing.JTextField();
        dividirBtn = new javax.swing.JButton();
        restarBtn = new javax.swing.JButton();
        multipliarBtn = new javax.swing.JButton();
        sumarBtn = new javax.swing.JButton();
        resultadoBtn = new javax.swing.JLabel();
        resTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setAutoscrolls(true);

        jLabel1.setText("inserte el numero 1:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("inserte el numero 2:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        num1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1TxtActionPerformed(evt);
            }
        });

        num2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2TxtActionPerformed(evt);
            }
        });

        dividirBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        dividirBtn.setText("dividir");
        dividirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirBtnActionPerformed(evt);
            }
        });

        restarBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        restarBtn.setText("restar");
        restarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarBtnActionPerformed(evt);
            }
        });

        multipliarBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        multipliarBtn.setText("multiplicar");
        multipliarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipliarBtnActionPerformed(evt);
            }
        });

        sumarBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        sumarBtn.setText("sumar");
        sumarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarBtnActionPerformed(evt);
            }
        });

        resultadoBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultadoBtn.setText("resultado:");

        resTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num1Txt)
                    .addComponent(num2Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultadoBtn)
                    .addComponent(sumarBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(restarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(multipliarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(65, 65, 65)
                        .addComponent(dividirBtn)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(resTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(num1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(num2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoBtn)
                    .addComponent(resTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multipliarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num2TxtActionPerformed

    private void resTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resTxtActionPerformed

    private void multipliarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipliarBtnActionPerformed
         num1 = Integer.parseInt(num1Txt.getText());
     num2 = Integer.parseInt(num2Txt.getText());
     res=num1*num2;
     resTxt.setText(String.valueOf(res));
    }//GEN-LAST:event_multipliarBtnActionPerformed

    private void sumarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarBtnActionPerformed
     num1 = Integer.parseInt(num1Txt.getText());
     num2 = Integer.parseInt(num2Txt.getText());
     res=num1+num2;
     resTxt.setText(String.valueOf(res));
     
    }//GEN-LAST:event_sumarBtnActionPerformed

    private void restarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarBtnActionPerformed
        num1 = Integer.parseInt(num1Txt.getText());
     num2 = Integer.parseInt(num2Txt.getText());
     res=num1-num2;
     resTxt.setText(String.valueOf(res));
    }//GEN-LAST:event_restarBtnActionPerformed

    private void dividirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirBtnActionPerformed
          num1 = Integer.parseInt(num1Txt.getText());
     num2 = Integer.parseInt(num2Txt.getText());
     res=num1/num2;
     resTxt.setText(String.valueOf(res));
    }//GEN-LAST:event_dividirBtnActionPerformed

    private void num1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1TxtActionPerformed

  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClaseVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaseVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaseVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaseVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaseVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multipliarBtn;
    private javax.swing.JTextField num1Txt;
    private javax.swing.JTextField num2Txt;
    private javax.swing.JTextField resTxt;
    private javax.swing.JButton restarBtn;
    private javax.swing.JLabel resultadoBtn;
    private javax.swing.JButton sumarBtn;
    // End of variables declaration//GEN-END:variables
}
