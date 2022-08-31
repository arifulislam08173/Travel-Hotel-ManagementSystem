
package travel.hotel.managementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1,b2;
    AddCustomer(String username){
        setBounds(700,250,800,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1=new JLabel("Username");
        l1.setBounds(50,50,200,25);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(220,50,200,25);
        add(t1);
        
        JLabel l2=new JLabel("ID");
        l2.setBounds(50,90,200,25);
        add(l2);
        
        c1=new JComboBox(new String[]{"Passport","NID Card","Birth Card"});
        c1.setBounds(220,90,200,25);
        add(c1);
        
        JLabel l3=new JLabel("Number");
        l3.setBounds(50,130,200,25);
        add(l3);
        
        t2=new JTextField();
        t2.setBounds(220,130,200,25);
        add(t2);
        
        JLabel l4=new JLabel("Name");
        l4.setBounds(50,170,200,25);
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(220,170,200,25);
        add(t3);
        
        JLabel l5=new JLabel("Gender");
        l5.setBounds(50,210,200,25);
        add(l5);
        
        r1=new JRadioButton("Male");
        r1.setBackground(Color.WHITE);
        r1.setBounds(220,210,80,25);
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBackground(Color.WHITE);
        r2.setBounds(340,210,80,25);
        add(r2);
        
        JLabel l6=new JLabel("Country");
        l6.setBounds(50,240,200,25);
        add(l6);
        
        t4=new JTextField();
        t4.setBounds(220,240,200,25);
        add(t4);
        
        JLabel l7=new JLabel("Address");
        l7.setBounds(50,280,200,25);
        add(l7);
        
        t5=new JTextField();
        t5.setBounds(220,280,200,25);
        add(t5);
        
        JLabel l8=new JLabel("Phone Number");
        l8.setBounds(50,320,200,25);
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(220,320,200,25);
        add(t6);
        
        JLabel l9=new JLabel("Email");
        l9.setBounds(50,360,200,25);
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(220,360,200,25);
        add(t7);
        
        b1=new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140,410,100,25);
        b1.addActionListener(this);
        add(b1);
           
        b2=new JButton("Back");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400,410,100,25);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/hotel/managementsystem/icons/newcustomer.jpg"));
        Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10=new JLabel(i3);
        l10.setBounds(450,20,400,400);
        add(l10);
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t3.setText(rs.getString("name"));
            }
        }catch(Exception e){
            
        }
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();
            String number = t2.getText();
            String name = t3.getText();
            String radio = null;
            if(r1.isSelected()){
                radio = "Male";
            }else if (r2.isSelected()){
                radio = "Female";
            }
            String country = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();

            String q = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                this.setVisible(false);
            }catch(Exception e){
            e.printStackTrace();
            }
        
        }else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddCustomer("").setVisible(true);
    }
            
}
