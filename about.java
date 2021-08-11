package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class about extends JFrame implements ActionListener{
    String s;
    JButton b1;
    about(){
       setBounds(400,100,500,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
         
        JLabel l1 = new JLabel("Travel and Tourism Management System ");
        l1.setBounds(50,10,400,80);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        s="     About Projects  \n "+
                "\n" +
                "The objective of the Travel and tourism management system project is to develop a system to devlop a system that automates the work The project is totally built at administrative end and thus only the administrator is guaranteed the access to the backend database. The purpose of this project is to build an application program to reduce the manual work for managing Tourists, Booking, Places etc. \n" +
                
                "\n"+
                "This application will help in accessing the information related to the travel to the particular destination with great ease. The users can track the information related to their tours with great ease through this application. The travel agency information can also be obtained through this application.\n" +
                "\n";
                  
        
        TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);
        add(t1);
        
        b1= new JButton("Back");
        b1.setBounds(200,420,100,25);
        b1.addActionListener(this);
        add(b1);
        
        
        
    }
     public void actionPerformed(ActionEvent ae){
         
         this.setVisible(false);
     }

public static void main(String[] args){

new about().setVisible(true);
}
}