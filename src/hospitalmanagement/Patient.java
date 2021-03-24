/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pooja
 */
public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form Patient
     */
    public Patient() {
        initComponents();
        doctorCBdata();
        
        Add.setEnabled(true);
              Delete.setEnabled(true);
              Display.setEnabled(true);
              getdetails.setVisible(true);
            p_id.setEnabled(false);
         fname.setEnabled(false);
         lname.setEnabled(false);
          gender.setEnabled(false);
          age.setEnabled(false);
          contact2.setEnabled(false);
         address.setEnabled(false);
         advamt.setEnabled(false);
          did.setEnabled(false);
          getdetails.setEnabled(false);
          advamt.setText("500");
          disease.setEnabled(false);
        
             }

    public void doctorCBdata()
    {
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
              Statement stat  = conn.createStatement();
              String selectQuery="select d_id from doctor";
              ResultSet rs = stat.executeQuery(selectQuery);
              while(rs.next())
              {
                  did.addItem(Integer.toString(rs.getInt("d_id")));
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
        p_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contact2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        advamt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        did = new javax.swing.JComboBox<String>();
        Add = new javax.swing.JButton();
        Modify = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        getdetails = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        disease = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient");
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Patient Management ");

        jLabel1.setText(" Patient Id");

        jLabel3.setText("First Name ");

        jLabel4.setText("Gender");

        jLabel5.setText(" Last Name ");

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ", "Male", "Female", "Other" }));

        jLabel6.setText("Age");

        jLabel7.setText("Address");

        jLabel8.setText("Contact Number");

        jLabel9.setText("Disease");

        jLabel10.setText("Doctor Id");

        did.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select " }));

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        getdetails.setText("Get Details");
        getdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdetailsActionPerformed(evt);
            }
        });

        jLabel11.setText("Advance Amt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disease, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)
                                        .addComponent(getdetails))
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Add)
                                    .addGap(18, 18, 18)
                                    .addComponent(Modify)
                                    .addGap(18, 18, 18)
                                    .addComponent(Display)
                                    .addGap(18, 18, 18)
                                    .addComponent(Delete)
                                    .addGap(18, 18, 18)
                                    .addComponent(Back))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(48, 48, 48))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contact2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(advamt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(140, 140, 140)
                                            .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getdetails)
                            .addComponent(p_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(advamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Modify)
                                .addComponent(Add))
                            .addComponent(Display)
                            .addComponent(Delete)
                            .addComponent(Back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        
         if("<<Back".equals(Back.getText()))  
           {
                this.dispose();
                new Patient().setVisible(true);    
           }
           else
           {
               this.dispose();
              new Choice().setVisible(true);
           }
    }//GEN-LAST:event_BackActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        
        new Displaypatient().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_DisplayActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        
        if("Add".equals(Add.getText()))
        {
            Add.setText("Save");  
            Back.setText("<<Back");
            Delete.setEnabled(false);
            Modify.setEnabled(false);
            Display.setEnabled(false);
           getdetails.setVisible(false);
           p_id.setEnabled(true);
         fname.setEnabled(true);
         lname.setEnabled(true);
          //lname.setEnabled(true);
          age.setEnabled(true);
          contact2.setEnabled(true);
         address.setEnabled(true);
         advamt.setEnabled(true);
          did.setEnabled(true);
          getdetails.setEnabled(true);
          gender.setEnabled(true);
           disease.setEnabled(true);
        }
        else if (p_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"ID feild cannot be empty!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if(fname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter First Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (lname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"First Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (age.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Age!!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (contact2.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (address.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Address!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (advamt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Disease!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
             
       else
        {
        try{
           
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
               
               String sql = "insert into patient (p_id, fname, lname, gender, age, address, contact2, disease, d_id, advamt) values (?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement pstmt = conn.prepareStatement(sql);
               pstmt.setInt(1,Integer.parseInt(p_id.getText()));
               pstmt.setString(2,fname.getText());
                pstmt.setString(3,lname.getText());
                String gen;
               gen = gender.getSelectedItem().toString();
               pstmt.setString(4, gen);               
                                                
                pstmt.setString(5,age.getText());  
                 pstmt.setString(7,address.getText()); 
                pstmt.setString(6,contact2.getText());               
                pstmt.setString(8,disease.getText());
                String did1;
               did1 = did.getSelectedItem().toString();
               pstmt.setString(9, did1);
                pstmt.setInt(10,Integer.parseInt(advamt.getText()));
                
                                         
                           
               pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
               p_id.setText(null);
               fname.setText(null);
               lname.setText(null);
               gender.setSelectedItem(null);
               age.setText(null); 
               contact2.setText(null); 
               address.setText(null);
               advamt.setText(null);
               
               
               conn.close();
               
               
           }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }}
    }//GEN-LAST:event_AddActionPerformed

    private void getdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdetailsActionPerformed
        // TODO add your handling code here:
          try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
                String sql = "select * from  patient where p_id = ? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);                        
               pstmt.setInt(1,Integer.parseInt(p_id.getText()));
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                   gender.setSelectedItem(rs.getString("gender"));
                  age.setText(rs.getString("age"));
                  address.setText(rs.getString("address"));
                  contact2.setText(rs.getString("contact2"));
                  advamt.setText(rs.getString("disease"));
                  did.setSelectedItem(rs.getString("d_id"));
                
                
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"No Record Found");
               }
         }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_getdetailsActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if("Delete".equals(Delete.getText()))
        {
            p_id.setEnabled(true);
            Delete.setText("Confirm");
            Back.setText("<<Back");
            getdetails.setVisible(true);
            getdetails.setEnabled(true);
            Add.setEnabled(false);
            Modify.setEnabled(false);
            Display.setEnabled(false);
        }
        else
        {
          try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
                String sql = "delete  from  patient where p_id = ? ";
               PreparedStatement pstmt = conn.prepareStatement(sql);  
               pstmt.setInt(1,Integer.parseInt(p_id.getText()));
               
                pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
               
              p_id.setText(null);
               fname.setText(null);
               lname.setText(null);
               gender.setSelectedItem(null);
               age.setText(null); 
               contact2.setText(null); 
               address.setText(null);
               advamt.setText(null);           
               
               conn.close(); 
        }
       catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        if("Modify".equals(Modify.getText()))
            {
               Modify.setText("Update");
             Add.setEnabled(false);
              Delete.setEnabled(false);
              Display.setEnabled(false);
               Back.setText("<<BACK");
               getdetails.setEnabled(true);
            p_id.setEnabled(true);
         fname.setEnabled(true);
         lname.setEnabled(true);
          gender.setEnabled(true);
          age.setEnabled(true);
          contact2.setEnabled(true);
         address.setEnabled(true);
         advamt.setEnabled(true);
          did.setEnabled(true);
         
        }
        
        else if (p_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"ID feild cannot be empty!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if(fname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter First Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (lname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"First Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (age.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Age!!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (contact2.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (address.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Address!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (advamt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter Disease!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
             try
             {
             
                 Class.forName("com.mysql.cj.jdbc.Driver");;
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","root");
         
                String sql = " update patient set fname= ? , lname = ? ,gender = ? ,age = ? , address = ? ,contact2 = ? , disease = ?  ,d_id = ? where p_id =? ";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
               pstmt.setString(1 , fname.getText());
                pstmt.setString(2 , lname.getText());
               String genr;
               genr = gender.getSelectedItem().toString();
               pstmt.setString(3, genr);
               pstmt.setString(4,age.getText());
                pstmt.setString(5,address.getText());
               pstmt.setString(6,contact2.getText());
               pstmt.setString(7,advamt.getText()); 
               String did1;
               did1 = did.getSelectedItem().toString();
               pstmt.setString(8, did1);
               
               
                pstmt.setInt(9,Integer.parseInt(p_id.getText()));
                
                pstmt.executeUpdate();
              
               JOptionPane.showMessageDialog(null,"Data Updated Successfully");
             
             
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,e);
             }
        }
    }//GEN-LAST:event_ModifyActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Display;
    private javax.swing.JButton Modify;
    private javax.swing.JTextField address;
    private javax.swing.JTextField advamt;
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact2;
    private javax.swing.JComboBox<String> did;
    private javax.swing.JTextField disease;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton getdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField p_id;
    // End of variables declaration//GEN-END:variables
}
