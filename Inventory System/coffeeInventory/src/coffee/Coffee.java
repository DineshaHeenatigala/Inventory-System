 
package coffee;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Coffee extends javax.swing.JFrame {

    
    public Coffee() {
        initComponents();
        Connect();
    }
           
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    DefaultTableModel model =  new DefaultTableModel();
            
    
        public void Connect()
        {
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/coffeesystem1","root","");
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Coffee.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(Coffee.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ch1 = new javax.swing.JCheckBox();
        ch2 = new javax.swing.JCheckBox();
        ch3 = new javax.swing.JCheckBox();
        ch4 = new javax.swing.JCheckBox();
        ch5 = new javax.swing.JCheckBox();
        ch6 = new javax.swing.JCheckBox();
        ch7 = new javax.swing.JCheckBox();
        ch8 = new javax.swing.JCheckBox();
        jsp1 = new javax.swing.JSpinner();
        jsp2 = new javax.swing.JSpinner();
        jsp3 = new javax.swing.JSpinner();
        jsp4 = new javax.swing.JSpinner();
        jsp5 = new javax.swing.JSpinner();
        jsp6 = new javax.swing.JSpinner();
        jsp7 = new javax.swing.JSpinner();
        jsp8 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Coffee Shop Inventory System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ch1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch1.setText("Caramel");

        ch2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch2.setText("Butterscotch");

        ch3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch3.setText("Amaretto");

        ch4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch4.setText("Kona");

        ch5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch5.setText("French Vanila");

        ch6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch6.setText("Chocalate");

        ch7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch7.setText("Pumpkin spice");

        ch8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ch8.setText("Peppermint");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_name", "Price", "qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sub total");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("pay");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("balance");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("print Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ch7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ch8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsp1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jsp2)
                    .addComponent(jsp3)
                    .addComponent(jsp4)
                    .addComponent(jsp5)
                    .addComponent(jsp6)
                    .addComponent(jsp7)
                    .addComponent(jsp8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(138, 138, 138)
                                .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch1)
                            .addComponent(jsp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch2)
                            .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch3)
                            .addComponent(jsp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch4)
                            .addComponent(jsp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch5)
                            .addComponent(jsp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch6)
                            .addComponent(jsp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch7)
                    .addComponent(jsp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ch8)
                        .addComponent(jsp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(632, 632, 632))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       
    public void sales()
    {
         
        String sub = txtsub.getText();
        String pay = txtpay.getText();
        String balance = txtbalance.getText();
        
           int lastid = 0;

        try {
            
            String query = "insert into sales1(subtotal,pay,balance)values(?,?,?)";
            pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            pst.setString(1, sub);
            pst.setString(2, pay);
            pst.setString(3, balance);
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            
             if(rs.next())
             {
                lastid = rs.getInt(1);
             
             }
             
             int rows = jTable1.getRowCount();
             
             String query1 = "insert into sales_product1(sales_id,product_name,price,qty,total)values(?,?,?,?,?)";
             
             pst1 = con.prepareStatement(query1);
             
              String proname = " ";
              int price;
              int qty;
              int total = 0;
              
              for(int i=0; i<jTable1.getRowCount(); i++)
        {
            
           proname = (String)jTable1.getValueAt(i, 0);
           price = (int)jTable1.getValueAt(i, 1);
           qty = (int)jTable1.getValueAt(i, 2);
           total = (int)jTable1.getValueAt(i, 3);
           
           pst1.setInt(1,lastid);
           pst1.setString(2,proname);
           pst1.setInt(3,price);
           pst1.setInt(4,qty);
           pst1.setInt(5,total);
           pst1.executeUpdate();
           
           
        }
              JOptionPane.showMessageDialog(null,"sales completeeee");
              
            
        } catch (SQLException ex) {
            Logger.getLogger(Coffee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int sum = 0;
        int price;
        int qty;
        int total;
        
        if(ch1.isSelected())
        {
          String caramel = ch1.getText();
          price = 200;
          qty = Integer.parseInt(jsp1.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             caramel,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch2.isSelected())
        {
          String butterscotch = ch2.getText();
          price = 300;
          qty = Integer.parseInt(jsp2.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             butterscotch,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch3.isSelected())
        {
          String amaretto = ch3.getText();
          price = 250;
          qty = Integer.parseInt(jsp3.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             amaretto,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch4.isSelected())
        {
          String kona = ch4.getText();
          price = 450;
          qty = Integer.parseInt(jsp4.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             kona,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch5.isSelected())
        {
          String freanch_vanila = ch5.getText();
          price = 500;
          qty = Integer.parseInt(jsp5.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             freanch_vanila,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch6.isSelected())
        {
          String chocalate = ch6.getText();
          price = 500;
          qty = Integer.parseInt(jsp6.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             chocalate,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch7.isSelected())
        {
          String pumpkin_spice = ch7.getText();
          price = 400;
          qty = Integer.parseInt(jsp7.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             pumpkin_spice,
             price,
             qty,
             total
             
          
          });
          
        }
        
        if(ch8.isSelected())
        {
          String peppermint = ch8.getText();
          price = 500;
          qty = Integer.parseInt(jsp8.getValue().toString());
          
          total = price*qty;
          model = (DefaultTableModel)jTable1.getModel() ;
          
          model.addRow(new Object[]
          {
             peppermint,
             price,
             qty,
             total
             
          
          });
          
        }
        
        for(int i=0; i<jTable1.getRowCount(); i++)
        {
           sum = sum+Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        
        txtsub.setText(Integer.toString(sum));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int sub,pay,balance;
        
        sub= Integer.parseInt(txtsub.getText());
        pay= Integer.parseInt(txtpay.getText());
        
        balance = pay-sub;
        if(balance<0)
        {
            
            JOptionPane.showMessageDialog(null,"Insufficient money balance.");
        }
        else{
            
        txtbalance.setText(String.valueOf(balance));
        
        }   
        sales();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch1;
    private javax.swing.JCheckBox ch2;
    private javax.swing.JCheckBox ch3;
    private javax.swing.JCheckBox ch4;
    private javax.swing.JCheckBox ch5;
    private javax.swing.JCheckBox ch6;
    private javax.swing.JCheckBox ch7;
    private javax.swing.JCheckBox ch8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner jsp1;
    private javax.swing.JSpinner jsp2;
    private javax.swing.JSpinner jsp3;
    private javax.swing.JSpinner jsp4;
    private javax.swing.JSpinner jsp5;
    private javax.swing.JSpinner jsp6;
    private javax.swing.JSpinner jsp7;
    private javax.swing.JSpinner jsp8;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables
}
