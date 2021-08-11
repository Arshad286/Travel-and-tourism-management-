/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener{
    JButton b2;
    
    ViewCustomer(String username){
        setBounds(400,100,870,610);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
       
       
        JLabel l1 = new JLabel("Username :");
        l1.setBounds(30,50,150,25);
        add(l1);
        
        
         JLabel l11 = new JLabel();
        l11.setBounds(220,50,150,25);
        add(l11);
        
         JLabel l2 = new JLabel("ID :");
        l2.setBounds(30,110,150,25);
        add(l2);
        
        JLabel l12 = new JLabel();
        l12.setBounds(220,110,150,25);
        add(l12);
       
        JLabel l3 = new JLabel("Contact Number :");
        l3.setBounds(30,170,150,25);
        add(l3);
        
         JLabel l13 = new JLabel();
        l13.setBounds(220,170,150,25);
        add(l13);
       
        
        JLabel l4= new JLabel("Name  :");
        l4.setBounds(30,230,150,25);
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setBounds(220,230,150,25);
        add(l14);
        
          JLabel l5= new JLabel("Gender :");
        l5.setBounds(500,50,150,25);
        add(l5);
        
       JLabel l15 = new JLabel();
        l15.setBounds(690,50,150,25);
        add(l15);
         
        JLabel l6= new JLabel("Country  :");
        l6.setBounds(500,110,150,25);
        add( l6);
        
      JLabel l16 = new JLabel();
        l16.setBounds(690,110,150,25);
        add(l16);
          
      JLabel l7= new JLabel("Address  :");
        l7.setBounds(500,170,150,25);
        add(l7);
      
         JLabel l17 = new JLabel();
        l17.setBounds(690,170,150,25);
        add(l17);
       
        JLabel l8= new JLabel("Email :");
        l8.setBounds(500,230,150,25);
        add(l8);
        
         JLabel l18 = new JLabel();
        l18.setBounds(690,230,150,25);
        add(l18);
       
        
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(280,380,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
       
Image i2 = i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);   
ImageIcon i3  = new ImageIcon(i2);
JLabel l9 = new JLabel(i3);
l9.setBounds(20, 400, 600, 200);
add(l9);

  ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
       
Image i5 = i4.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);   
ImageIcon i6  = new ImageIcon(i2);
JLabel l19 = new JLabel(i6);
l19.setBounds(600, 400, 600, 200);
add(l19);


 System.out.println(username);
  try{
            connection c = new connection();
        ResultSet rs = c.s.executeQuery("select * from customer where username = 'arshad'");
          while(rs.next()){
              l11.setText(rs.getString("username"));
              l12.setText(rs.getString("id"));
              l13.setText(rs.getString("contactnumber"));
              l14.setText(rs.getString("name"));
              l15.setText(rs.getString("gender"));
              l17.setText(rs.getString("address"));
              l16.setText(rs.getString("country"));
              l18.setText(rs.getString("email"));
      }
  
  }catch(Exception e){}
}
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== b2){
        this.setVisible(false);
    }
        
    }
    
    public static void main(String[] args)
    {
        new ViewCustomer("").setVisible(true);
        
}
}
