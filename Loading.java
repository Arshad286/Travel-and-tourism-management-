
package travel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {
  JProgressBar p;
  Thread t;
  String username;
  
  Loading(String username){
     username= " arshad ";
      t = new Thread(this);
      
      setBounds(400,250,650,400);
      getContentPane().setBackground(Color.white);
      setLayout(null);
      
      JLabel l1 = new JLabel("Travel and Toursim Application");
            l1.setForeground(new Color(72, 209, 204));
            l1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
            l1.setBounds(50, 46, 700, 35);
            add(l1);
	
            
            p = new JProgressBar();
            p.setFont(new Font("Tahoma", Font.BOLD, 12));
            p.setStringPainted(true);
            p.setBounds(130, 135, 300, 25);
            add(p);

      
            JLabel l2 = new JLabel("Please Wait....");
            l2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            l2.setForeground(new Color(160, 82, 45));
            l2.setBounds(200, 165, 150, 20);
            add(l2);

              
            JLabel l3 = new JLabel("Welcome" +username);
            l3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
            l3.setForeground(Color.red);
            l3.setBounds(20, 310, 400, 25);
            add(l3);

      t.start();
  }        
     
	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                   
                    int m = p.getMaximum();
                    int n = p.getValue();
                    if (n < m) {
                        p.setValue(p.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                      // new Home(username).setVisible(true);
                       new Dashboard(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	    
           // setUndecorated(true);
            //setUploading();
         
        
            
	
        
        
	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

}


