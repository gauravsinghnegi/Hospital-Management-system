/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();    
       patientCBdata();
       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
   bill_date.setText(dateFormat.format(cal.getTime()));

    }
   
  public void patientCBdata()
    {
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
              Statement stat  = conn.createStatement();
              String selectQuery="select p_id from patient";
              ResultSet rs = stat.executeQuery(selectQuery);
              while(rs.next())
              {
                  p_id.addItem(Integer.toString(rs.getInt("p_id")));
              }  
              
         }        
                    
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
        }
    }
  
  
  public void nillamount()
  {
      try 
      {
          Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
              Statement stat  = conn.createStatement();
              String selectQuery="select advamt from patient where p_id = ? ";
              PreparedStatement pstmt = conn.prepareStatement(selectQuery); 
             pstmt.setInt(1,Integer.parseInt((String) p_id.getSelectedItem()));
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                advamt.setText(rs.getString("advamt"));   
                
                int a=Integer.parseInt(total_amount.getText());
                int b=Integer.parseInt(advamt.getText());
                int f= a-b;
                bdue.setText(f+"");
                          
               }
      
      }
      catch(Exception e)
      {
      
          JOptionPane.showMessageDialog(null,e);
      }     
  
  }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bill_no = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bill_date = new javax.swing.JTextField();
        total_amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        d_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        room_charges = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        Calamt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        doctor_charges = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        date_of_admit = new javax.swing.JTextField();
        p_id = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Pstatus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bdue = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        advamt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("     Bill     Management     ");

        jLabel1.setText("Bill No");

        Date.setText("Bill Date");

        jLabel4.setText("Room Charges");

        bill_date.setEnabled(false);

        jLabel5.setText("Date Of Admit");

        jLabel6.setText("Patient Id");

        jLabel7.setText("Patient Name ");

        jLabel8.setText("Doctor  Id");

        jLabel9.setText("Total Amount ");

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Calamt.setText("Calculate Amount");
        Calamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalamtActionPerformed(evt);
            }
        });

        jLabel10.setText("Doctor Charges");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        p_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p_idItemStateChanged(evt);
            }
        });

        jButton1.setText("Display Bills");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pstatus.setText("Payment Status");
        Pstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PstatusActionPerformed(evt);
            }
        });

        jLabel3.setText("Balance Due");

        jLabel11.setText("Advance Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(Pstatus)
                        .addGap(67, 67, 67)
                        .addComponent(submit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room_charges, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bill_date, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(pname))
                                .addGap(51, 51, 51)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d_id, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(advamt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bdue, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(total_amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(date_of_admit)
                                            .addComponent(doctor_charges, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                        .addGap(76, 76, 76)
                                        .addComponent(Calamt)))
                                .addGap(54, 54, 54)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bill_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(d_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room_charges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(doctor_charges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(date_of_admit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calamt)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(advamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(bdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pstatus)
                            .addComponent(submit)
                            .addComponent(jButton1)
                            .addComponent(back))
                        .addGap(42, 42, 42))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
          new Choice().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void CalamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalamtActionPerformed
                   
      int a=Integer.parseInt(room_charges.getText());
      int b=Integer.parseInt(doctor_charges.getText());
      int f= a+b;
      total_amount.setText(f+"");
      
    }//GEN-LAST:event_CalamtActionPerformed

     
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
        int balance_due, baldue;
        balance_due = Integer.parseInt(bdue.getText());
                
         if(balance_due != 0)
         {
            JOptionPane.showMessageDialog(this,"Please Pay Balance Amount to Print Bill");
         }
         else
         {
         
                
        try{
           
               Class.forName("com.mysql.cj.jdbc.Driver");;
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
               
             
               String sql = "insert into Bill (bill_no,d_id,room_charges,doctor_charges,date_of_admit,total_amount, balance_due) values (?,?,?,?,?,?,?)";
               PreparedStatement pstmt = conn.prepareStatement(sql);
               pstmt.setInt(1,Integer.parseInt(bill_no.getText()));
                          pstmt.setString(2, bill_date.getText());
                          
                String pid;
               pid = p_id.getSelectedItem().toString();
               pstmt.setString(3, pid);  
               pstmt.setString(4,pname.getText());  
              pstmt.setString(5,d_id.getText()); 
                pstmt.setString(6,room_charges.getText());
               pstmt.setString(7,doctor_charges.getText());      
               pstmt.setString(9,total_amount.getText()); 
              pstmt.setString(8,date_of_admit.getText()); 
               pstmt.setString(10,bdue.getText()); 
                                            
              pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Bill Printed Successfully");
               bill_no.setText(null);
               d_id.setText(null);
                pname.setText(null);
               //p_id.setSelectedItem(null);
               doctor_charges.setText(null); 
                room_charges.setText(null); 
               date_of_admit.setText(null);   
               total_amount.setText(null);
               advamt.setText(null);
               //this.dispose();
               //new Bill().setVisible(true);
               conn.close();
               
               
           }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }}
    }//GEN-LAST:event_submitActionPerformed

    private void p_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p_idItemStateChanged
       
              try{
               Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
              Statement stat  = conn.createStatement();
               String sql = "select fname , d_id from  patient where p_id = ? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);  
                   pstmt.setInt(1,Integer.parseInt((String) p_id.getSelectedItem()));
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                pname.setText(rs.getString("fname"));
                d_id.setText(rs.getString("d_id"));
              }
              }
              catch(Exception e)
              {
                   JOptionPane.showMessageDialog(null,e);
              }
    }//GEN-LAST:event_p_idItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new Billprint().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PstatusActionPerformed
          nillamount();
                     
        
      
            
    }//GEN-LAST:event_PstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Bill().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calamt;
    private javax.swing.JLabel Date;
    private javax.swing.JButton Pstatus;
    private javax.swing.JTextField advamt;
    private javax.swing.JButton back;
    private javax.swing.JTextField bdue;
    private javax.swing.JTextField bill_date;
    private javax.swing.JTextField bill_no;
    private javax.swing.JTextField d_id;
    private javax.swing.JTextField date_of_admit;
    private javax.swing.JTextField doctor_charges;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> p_id;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField room_charges;
    private javax.swing.JButton submit;
    private javax.swing.JTextField total_amount;
    // End of variables declaration//GEN-END:variables
}
