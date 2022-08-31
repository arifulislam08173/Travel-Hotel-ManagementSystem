
package travel.hotel.managementsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(550,150,800,550);
        
        String[] package1=new String[]{"GOLD PACKAGE","6 Days & 7 Nights","Arport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks On Arrival","Full Day 3 Islan Cruise","Enlish Speaking Guide","BOOK NOW","SUMMER SPECIAL ---------","- Price: 12000/- Tk","p1.png"};
        String[] package2=new String[]{"PLATINIUM PACKAGE","5 Days & 6 Nights","Toll Free & Entrace Tickets","Meet & Greet at Airport","Welcome Drinks at Arrival","Night Safari","Full Day 3 Island Cruise","Cruise With Dinner","BOOK NOW","WINTER SPECIAL ---------"," Price: 24000/- Tk","package2.jpg"};
        String[] package3=new String[]{"DIAMOND PACKAGE","6 Days & 5 Nights","Return Airfare","Horse Riding & other games","Welcome Drinks on Arrival","Daily Buffet","Stay in 5 star Hotel","BBQ Dinner","BOOK NOW","WINTER SPECIAL ---------"," Price: 32000/- Tk","package3.jpg"};
        JTabbedPane pane=new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
        pane.addTab("Package 1",null,p1);
        
        
        JPanel p2 = createPackage(package2);
        pane.addTab("Package 2",null,p2);
       
        JPanel p3 = createPackage(package3);
        pane.addTab("Package 3",null,p3);
        
        add(pane,BorderLayout.CENTER);
    }
    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,30));
        p1.add(l1);
       
        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(30,55,300,30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l2);
        
        JLabel l3=new JLabel(pack[2]);
        l3.setBounds(30,95,300,30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[3]);
        l4.setBounds(30,135,300,30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l4);
        
        JLabel l5=new JLabel(pack[4]);
        l5.setBounds(30,175,300,30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(30,215,300,30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(30,255,300,30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(30,295,300,30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[8]);
        l9.setBounds(40,350,300,30);
        l9.setForeground(Color.GREEN);
        l9.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l9);
        
        JLabel l10=new JLabel(pack[9]);
        l10.setBounds(340,420,300,30);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l10);
        
        JLabel l11=new JLabel(pack[10]);
        l11.setBounds(560,420,300,30);
        l11.setForeground(Color.RED);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        p1.add(l11);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/hotel/managementsystem/icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l12=new JLabel(i3);
        l12.setBounds(300,40,450,400);
        p1.add(l12);
        return p1;
    }
    
            
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
    
}
