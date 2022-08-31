
package travel.hotel.managementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1950,65);
        p1.setBackground(new Color(0,0,50));
        add(p1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/hotel/managementsystem/icons/update.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5,0,70,70);
        p1.add(l2);
        
        JLabel l3 = new JLabel("Dashboard");
        l3.setFont(new Font("Tahoma",Font.BOLD, 30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80,10,300,40);
        p1.add(l3);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,10,300,1000);
        p2.setBackground(new Color(0,0,50));
        add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0,0,0,60));
        b1.setBounds(0,55,300,50);
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,0));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0,0,0,30));
        b2.setBounds(0,105,300,50);
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0,0,0,130));
        b3.setBounds(0,155,300,50);
        b3.addActionListener(this);
        p2.add(b3);
        
        JButton b4 = new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,0));
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0,0,0,33));
        b4.setBounds(0,205,300,50);
        p2.add(b4);
        
        b5 = new JButton("Check Pakage");
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0,0,0,120));
        b5.setBounds(0,255,300,50);
        b5.addActionListener(this);
        p2.add(b5);
        
        b6 = new JButton("Book Package");
        b6.setBackground(new Color(0,0,0));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0,0,0,120));
        b6.setBounds(0,305,300,50);
        b6.addActionListener(this);
        p2.add(b6);
        
        JButton b7 = new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0,0,0,120));
        b7.setBounds(0,355,300,50);
        p2.add(b7);
        
        JButton b8 = new JButton("View Hotels");
        b8.setBackground(new Color(0,0,0));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
        b8.setMargin(new Insets(0,0,0,135));
        b8.setBounds(0,405,300,50);
        p2.add(b8);
        
        JButton b9 = new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setForeground(Color.WHITE);
        b9.setMargin(new Insets(0,0,0,145));
        b9.setBounds(0,455,300,50);
        p2.add(b9);
        
        JButton b10 = new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,0));
        b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b10.setForeground(Color.WHITE);
        b10.setMargin(new Insets(0,0,0,75));
        b10.setBounds(0,505,300,50);
        p2.add(b10);
        
        JButton b11 = new JButton("Destinations");
        b11.setBackground(new Color(0,0,102));
        b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b11.setForeground(Color.WHITE);
        b11.setMargin(new Insets(0,0,0,130));
        b11.setBounds(0,555,300,50);
        p2.add(b11);
        
        JButton b12 = new JButton("Payment");
        b12.setBackground(new Color(0,0,0));
        b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b12.setForeground(Color.WHITE);
        b12.setMargin(new Insets(0,0,0,160));
        b12.setBounds(0,605,300,50);
        b12.addActionListener(this);
        p2.add(b12);
        
        b13 = new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b13.setForeground(Color.WHITE);
        b13.setMargin(new Insets(0,0,0,155));
        b13.setBounds(0,655,300,50);
        b13.addActionListener(this);
        p2.add(b13);
        
        b14 = new JButton("Notepad");
        b14.setBackground(new Color(0,0,0));
        b14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b14.setForeground(Color.WHITE);
        b14.setMargin(new Insets(0,0,0,155));
        b14.setBounds(0,705,300,50);
        b14.addActionListener(this);
        p2.add(b14);
        
        JButton b15 = new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b15.setForeground(Color.WHITE);
        b15.setMargin(new Insets(0,0,0,175));
        b15.setBounds(0,755,300,50);
        p2.add(b15);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/hotel/managementsystem/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1950,1000);
        add(l1);
        
        JLabel l4 = new JLabel("Travel & Hotel Management System");
        l4.setBounds(650,100,1000,70);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Tahoma",Font.PLAIN,55));
        l1.add(l4);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b13)
        {try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){}   
        }
        else if(ae.getSource() == b14)
                {
                    try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){}
                    
                }else if (ae.getSource()== b1){
                    new AddCustomer(username).setVisible(true);
                }else if (ae.getSource()== b2){
                    new UpdateCustomer(username).setVisible(true);
                }else if(ae.getSource() == b3){
                    new ViewCustomer(username).setVisible(true);
                }else if(ae.getSource() == b5){
                    new CheckPackage().setVisible(true);
                }else if(ae.getSource() == b6){
                    new BookPackage(username).setVisible(true);
                }else if(ae.getSource() == b12){
                    new Payment().setVisible(true);
                }
    }
    public static void main(String[] args) {
        new Dashboard("").setVisible(true);
    }
}
