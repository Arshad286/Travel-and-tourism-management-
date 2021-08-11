package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 public class Dashboard extends JFrame implements ActionListener{ 
     String username;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
     Dashboard(String username){
         this.username =username;
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setLayout(null);
         
         JPanel p1= new JPanel();
        p1.setLayout(null);
         p1.setBounds(0,0,1950,65);
         p1.setBackground(new Color(51,153,255) );
         
         add(p1);
         
         JLabel l2 = new JLabel("Dashboard");
         l2.setFont(new Font("times new roman",Font.BOLD,30));
         l2.setForeground(Color.white);
         l2.setBounds(80,10,300,40);
         p1.add(l2);
         
         JPanel p2= new JPanel();
        p2.setLayout(null);
         p2.setBounds(0,65,300,600);
         p2.setBackground(new Color(51,153,255) );
         
         add(p2);
         
          b1 = new JButton("Add Personal Detail");
          b1.setBackground(new Color(51,153,255) );
          b1.setForeground(Color.white);
          b1.setFont(new Font("times new roman",Font.PLAIN,15));
          b1.setBounds(0,0,300,50);
          b1.addActionListener(this);
          p2.add(b1);
          
           b2 = new JButton( "Update Personal Detail");
          b2.setBackground(new Color(51,153,255) );
          b2.setForeground(Color.white);
          b2.setFont(new Font("times new roman",Font.PLAIN,15));
          b2.setBounds(0,50,300,50);
          b2.addActionListener(this);
          p2.add(b2);
          
           b3 = new JButton("Delete Personal Detail");
          b3.setBackground(new Color(51,153,255) );
          b3.setForeground(Color.white);
          b3.setFont(new Font("times new roman",Font.PLAIN,15));
          b3.setBounds(0,100,300,50);
          p2.add(b3);
         
            b4 = new JButton("View Detail");
          b4.setBackground(new Color(51,153,255) );
          b4.setForeground(Color.white);
          b4.setFont(new Font("times new roman",Font.PLAIN,15));
          b4.setBounds(0,150,300,50);
          b4.addActionListener(this);
          p2.add(b4);
         
           b5 = new JButton("Check Package");
          b5.setBackground(new Color(51,153,255) );
          b5.setForeground(Color.white);
          b5.setFont(new Font("times new roman",Font.PLAIN,15));
          b5.setBounds(0,200,300,50);
           b5.addActionListener(this);
          p2.add(b5);
          
            b6 = new JButton("Book Package");
          b6.setBackground(new Color(51,153,255) );
          b6.setForeground(Color.white);
          b6.setFont(new Font("times new roman",Font.PLAIN,15));
          b6.setBounds(0,250,300,50);
           b6.addActionListener(this);
          p2.add(b6);
         
          b7 = new JButton("View Package");
          b7.setBackground(new Color(51,153,255) );
          b7.setForeground(Color.white);
          b7.setFont(new Font("times new roman",Font.PLAIN,15));
          b7.setBounds(0,300,300,50);
           b7.addActionListener(this);
          p2.add(b7);
          
           b8 = new JButton("View Hotels");
          b8.setBackground(new Color(51,153,255) );
          b8.setForeground(Color.white);
          b8.setFont(new Font("times new roman",Font.PLAIN,15));
          b8.setBounds(0,350,300,50);
          p2.add(b8);
          
            b9 = new JButton("Book Hotel");
          b9.setBackground(new Color(51,153,255) );
          b9.setForeground(Color.white);
          b9.setFont(new Font("times new roman",Font.PLAIN,15));
          b9.setBounds(0,400,300,50);
          p2.add(b9);
        
           b10 = new JButton("Destination");
          b10.setBackground(new Color(51,153,255) );
          b10.setForeground(Color.white);
          b10.setFont(new Font("times new roman",Font.PLAIN,15));
          b10.setBounds(0,450,300,50);
          b10.addActionListener(this);
           p2.add(b10);
          
            b11 = new JButton("Payment");
          b11.setBackground(new Color(51,153,255) );
          b11.setForeground(Color.white);
          b11.setFont(new Font("times new roman",Font.PLAIN,15));
          b11.setBounds(0,500,300,50);
          b11.addActionListener(this);
           p2.add(b11);
          
            b12 = new JButton("About");
          b12.setBackground(new Color(51,153,255) );
          b12.setForeground(Color.white);
          b12.setFont(new Font("times new roman",Font.PLAIN,15));
          b12.setBounds(0,550,300,50);
            b12.addActionListener(this);
        
          p2.add(b12);
          
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
         ImageIcon  i3 = new ImageIcon(i2);
         
         JLabel l1 = new JLabel(i3);
         l1.setBounds(0,0,1950,1000);
         add(l1);
         
         JLabel l3 = new JLabel("Travel and Tourism Management System");
         l3.setFont(new Font("Tahoma",Font.PLAIN,30));
         l3.setForeground(Color.BLACK);
         l3.setBounds(600,0,1000,70);
         p1.add(l3);
          
     }
     
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== b1){
             new AddCustomer(username).setVisible(true);
        
         }else if(ae.getSource()== b2) {
          new UpdateCustomer(username).setVisible(true);
     }else if(ae.getSource()== b4){
         new ViewCustomer(username).setVisible(true);
     }else if(ae.getSource()== b5){
         new CheckPackage().setVisible(true);
     }else if(ae.getSource()==b6){
         new BookPackage().setVisible(true);  
     }else if(ae.getSource() == b7){
         new ViewPackage().setVisible(true);
     
     }else if(ae.getSource() == b12){
         new about().setVisible(true);
     
     }else if(ae.getSource() == b10){
         new Destination().setVisible(true);
     
     }else if(ae.getSource() == b11){
         new payment().setVisible(true);
     }
     }
    public static void main(String[] args){
    
       new Dashboard("").setVisible(true); 
    }
}