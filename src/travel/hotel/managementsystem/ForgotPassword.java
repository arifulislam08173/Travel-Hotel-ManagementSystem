
package travel.hotel.managementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener {
    
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;

    ForgotPassword() {

        setBounds(550, 250, 850, 380);
        getContentPane().setBackground(Color.WHITE);
	setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/hotel/managementsystem/icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l6 = new JLabel(i3);
        l6.setBounds(560, 70, 200, 200);
        add(l6);
        
        JPanel p = new JPanel();
        p.setLayout(null);
	p.setBounds(30, 30, 500, 280);
        add(p);

        JLabel l1 = new JLabel("Username");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(40, 20, 100, 25);
	p.add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 20, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        b1 = new JButton("Search");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(380, 20, 100, 25);
        b1.addActionListener(this);
        p.add(b1);

	JLabel l2 = new JLabel("Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(40, 60, 100, 25);
	p.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(200, 60, 150, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);

	JLabel l3 = new JLabel("Security Question");
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(40, 100, 170, 25);
	p.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(200, 100, 275, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);

	JLabel l4 = new JLabel("Answer");
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(40, 140, 170, 25);
	p.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(200, 140, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        b2 = new JButton("Retrieve");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380, 140, 100, 25);
        b2.addActionListener(this);
        p.add(b2);

	JLabel l5 = new JLabel("Password");
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(40, 180, 170, 25);
	p.add(l5);
        
        t5 = new JTextField();
        t5.setBounds(200, 180, 150, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
        
        b3 = new JButton("Back");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(25, 240, 100, 25);
        b3.addActionListener(this);
        p.add(b3);

    }
    public void actionPerformed(ActionEvent ae){
        try{
            Conn c = new Conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username= '"+t1.getText()+"'";
		ResultSet rs = c.s.executeQuery(sql);
                
		while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security"));
		}

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where answer = '"+t4.getText()+"' AND username = '"+t1.getText()+"'";
		ResultSet rs = c.s.executeQuery(sql);

		while (rs.next()) {
                    	t5.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
     public static void main(String[] args) {
	new ForgotPassword().setVisible(true);
     }
}
