/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        
            Add.setText("Add");
             Modify.setEnabled(true);
              Delete.setEnabled(true);
              Display.setEnabled(true);
               Back.setText("BACK");
        d_id.setEnabled(false);
          doctor_name.setEnabled(false);
          specialization.setEnabled(false);
          contact.setEnabled(false);
          contact1.setEnabled(false);
         Getdetails.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctor_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        d_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contact1 = new javax.swing.JTextField();
        specialization = new javax.swing.JComboBox<>();
        Modify = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Getdetails = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor ");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText(" Doctor  Management ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Doctor Id");

        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Specialization");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Contact NO 1");

        doctor_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doctor_nameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Doctor Name");

        d_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d_idKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Contact NO 2");

        specialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiaologist ", "Neurologist", "Surgeon" }));
        specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationActionPerformed(evt);
            }
        });

        Modify.setBackground(new java.awt.Color(204, 204, 255));
        Modify.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Modify.setForeground(new java.awt.Color(145, 90, 152));
        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Display.setBackground(new java.awt.Color(204, 204, 255));
        Display.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(145, 90, 152));
        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(204, 204, 255));
        Delete.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(145, 90, 152));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(204, 204, 255));
        Back.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(145, 90, 152));
        Back.setText(" Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(204, 204, 255));
        Add.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(145, 90, 152));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Getdetails.setText("Get Details");
        Getdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetdetailsActionPerformed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(601, 507));
        jPanel1.setRequestFocusEnabled(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medical1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(d_id, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(Getdetails)))))
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add)
                        .addGap(39, 39, 39)
                        .addComponent(Modify)
                        .addGap(30, 30, 30)
                        .addComponent(Display)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)
                        .addGap(35, 35, 35)
                        .addComponent(Back)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(d_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Getdetails))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(doctor_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Modify)
                            .addComponent(Display)
                            .addComponent(Delete)
                            .addComponent(Back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DisplayDoctor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DisplayActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        if("<<Back".equals(Back.getText()))  
           {
                this.dispose();
                new Choice().setVisible(true);    
           }
           else
           {
               this.dispose();
              new Choice().setVisible(true);
           }
    }//GEN-LAST:event_BackActionPerformed

    private void specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
      
         if("Add".equals(Add.getText()))
         {
             Add.setText("Save");
             Modify.setEnabled(false);
              Delete.setEnabled(false);
               Back.setText("<<Back");             
              Display.setEnabled(false);
            d_id.setEnabled(true);
          doctor_name.setEnabled(true);
          specialization.setEnabled(true);
          contact.setEnabled(true);
          contact1.setEnabled(true);
         Getdetails.setVisible(false);
           
        }
        
         
        
         else if (d_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"ID field can't be empty!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if(doctor_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       else if (contact.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (contact1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter contact number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

         else
         {
           
             
         try{
           
               Class.forName("com.mysql.cj.jdbc.Driver");;
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
               
               String sql = "insert into doctor values (?,?,?,?,?)";
               PreparedStatement pstmt = conn.prepareStatement(sql);
               pstmt.setInt(1,Integer.parseInt(d_id.getText()));
               pstmt.setString(2, doctor_name.getText());
               
               String spec;
               spec = specialization.getSelectedItem().toString();
               pstmt.setString(3, spec);
                                     
                pstmt.setString(4,contact.getText());  
                pstmt.setString(5,contact1.getText()); 
                
                 
               
               
               pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
               d_id.setText(null);
               doctor_name.setText(null);
               specialization.setSelectedItem(null);
               contact.setText(null); 
               contact1.setText(null);    
               conn.close();
               
               
           }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
         }
    }//GEN-LAST:event_AddActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
            if("Modify".equals(Modify.getText()))
            {
               Modify.setText("Update");
             Add.setEnabled(false);
              Delete.setEnabled(false);
              Display.setEnabled(false);
               Back.setText("<<Back");
        d_id.setEnabled(true);
          doctor_name.setEnabled(true);
          specialization.setEnabled(true);
          contact.setEnabled(true);
          contact1.setEnabled(true);
         Getdetails.setVisible(true);
            }
            
          else if (d_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"enter correct ID!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if(doctor_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
 
        else if (contact.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
          else if (contact1.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else
 
            {
         try{
              
               Class.forName("com.mysql.cj.jdbc.Driver");;
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
         
                String sql = " update doctor set doctor_name = ? , specialization = ? ,contact = ? ,contact1 = ? where d_id =? ";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
               pstmt.setString(1 , doctor_name.getText());
               String spec;
               spec = specialization.getSelectedItem().toString();
               pstmt.setString(2, spec);
               pstmt.setString(3,contact.getText()); 
               pstmt.setString(4,contact1.getText()); 
                pstmt.setInt(5,Integer.parseInt(d_id.getText()));
                
                pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Updated Successfully");
                d_id.setText(null);
               doctor_name.setText(null);
               specialization.setSelectedItem(null);
               contact.setText(null); 
               contact1.setText(null);  
               Getdetails.setVisible(true);
               doctor_name.setEnabled(false);
          specialization.setEnabled(false);
          contact.setEnabled(false);
          contact1.setEnabled(false);
         
               
               conn.close();
                
         }
         
         catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
            
            }

    }//GEN-LAST:event_ModifyActionPerformed

    private void GetdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetdetailsActionPerformed
               
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
                String sql = "select * from  doctor where d_id = ? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);                        
               pstmt.setInt(1,Integer.parseInt(d_id.getText()));
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                  doctor_name.setText(rs.getString("doctor_name"));
                  contact.setText(rs.getString("contact"));
                  contact1.setText(rs.getString("contact1"));
                  specialization.setSelectedItem(rs.getString("specialization"));
                
                
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"No Record Found");
               }
         }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_GetdetailsActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
          
        if("Delete".equals(Delete.getText()))
            {
               Delete.setText("Confirm");
               Delete.setEnabled(true);
             Add.setEnabled(false);
              Modify.setEnabled(false);
              Display.setEnabled(false);
               Back.setText("<<Back");
        d_id.setEnabled(true);
          doctor_name.setEnabled(false);
          specialization.setEnabled(true);
          contact.setEnabled(false);
          contact1.setEnabled(false);
         Getdetails.setVisible(true);
            }

        else{
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");;
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
                String sql = "delete  from  doctor where d_id = ? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);  
               pstmt.setInt(1,Integer.parseInt(d_id.getText()));
               
                pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
               
               d_id.setText(null);
               doctor_name.setText(null);
               specialization.setSelectedItem(null);
               contact.setText(null); 
               contact1.setText(null);              
               
               conn.close(); 
        }
       catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_DeleteActionPerformed
    }
    private void d_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d_idKeyTyped
      
    }//GEN-LAST:event_d_idKeyTyped

    private void doctor_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctor_nameKeyTyped
        char key;
        key=evt.getKeyChar();
        if(  !(((key>='a') && (key<='z')) || ((key>='A')  && (key<='Z'))) && (key!='\b'))
        evt.consume();
    }//GEN-LAST:event_doctor_nameKeyTyped

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_contactKeyTyped
    

   
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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JButton Getdetails;
    private javax.swing.JButton Modify;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField contact1;
    private javax.swing.JTextField d_id;
    private javax.swing.JTextField doctor_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> specialization;
    // End of variables declaration//GEN-END:variables
}
