package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*;
public class ViewPackage extends JFrame  implements ActionListener {
    JButton b1;
  public  ViewPackage(){
         setBounds(350,240,900,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
       
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookedDetails.jpg"));
         Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
         ImageIcon  i3 = new ImageIcon(i2);
         JLabel l9 = new JLabel(i3);
          l9.setBounds(450, 20, 400, 320);
            add(l9);

         
        
         JLabel heading = new JLabel("VIEW PACKAGE DETAIL");
        heading.setBounds(60,0,300,30);
        heading.setFont(new Font("tahoma",Font.PLAIN,20));        
        add(heading);
       
        
         JLabel l1 = new JLabel("Username");
        l1.setBounds(30,50,100,30);
        add(l1);
       
         
         JLabel l11 = new JLabel();
        l11.setBounds(250,50,200,30);
        add(l11);
       
         JLabel l2 = new JLabel("Package");
        l2.setBounds(30,90,100,30);
        add(l2);
       
         JLabel l12 = new JLabel();
        l12.setBounds(250,90,150,25);
        add(l12);
       
          JLabel l3 = new JLabel("Total Persons:");
        l3.setBounds(30,130,100,30);
        add(l3);
       
        JLabel l13 = new JLabel();
        l13.setBounds(250,130,150,25);
        add(l13);
       
         JLabel l4 = new JLabel("ID:");
        l4.setBounds(30,170,100,30);
        add(l4);
       
        JLabel l14 = new JLabel();
        l14.setBounds(250,170,150,25);
        add(l14);
       
         JLabel l5 = new JLabel("Phone No :");
        l5.setBounds(30,210,100,30);
        add(l5);
       
        JLabel l15 = new JLabel();
        l15.setBounds(250,210,150,25);
        add(l15);
       
         JLabel l6 = new JLabel("Price:");
        l6.setBounds(30,250,100,30);
        add(l6);
       
        JLabel l16 = new JLabel();
        l16.setBounds(250,250,150,25);
        add(l16);
        
        
         b1 = new JButton( "Back");
          b1.setBackground(Color.BLACK );
          b1.setForeground(Color.white);
          b1.setFont(new Font("times new roman",Font.PLAIN,15));
          b1.setBounds(275,330,120,25);
           b1.addActionListener(this);
         
          add(b1);
    try{
            connection c = new connection();
        ResultSet rs = c.s.executeQuery("select * from bookPackage where username = 'arshad'");
          while(rs.next()){
              l11.setText(rs.getString(1));
              l12.setText(rs.getString(2));
              l13.setText(rs.getString(3));
              l14.setText(rs.getString(4));
              l15.setText(rs.getString(5));
              l16.setText(rs.getString(6));
  
  
  
       
    }
    }catch(Exception e){}

  }
  
    public void actionPerformed(ActionEvent ae){
     
        this.setVisible(false);
    }
       
  
public static void main(String[] args){
   
    new ViewPackage().setVisible(true);

}
}