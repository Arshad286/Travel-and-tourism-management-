// Multithreading
package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash {
    public static void main(String[] args){
       SplashFrame Frame =new SplashFrame();
       Frame.setVisible(true);
       int x=1;
       for( int i=1; i<=700; i+=6,x+=7){
       Frame.setLocation(700-(x+i)/2,400-(i/2));
        Frame.setSize(x+i,i);
        try{
            Thread.sleep(10);
        }catch(Exception e){}
       }
        Frame.setVisible(true);
    }
            
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    
    SplashFrame(){
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
    Image i2 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i1);
       add(l1);
    
      
      setUndecorated(true);  //for remove bar
      t1 = new Thread(this);
      t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            new Login().setVisible(true);
           }catch(Exception e){}
          }
}
