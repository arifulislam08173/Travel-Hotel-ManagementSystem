
package travel.hotel.managementsystem;

import javax.swing.*;
import java.awt.event.*;

public class Bkash extends JFrame implements ActionListener{
    Bkash(){
       JEditorPane j = new JEditorPane(); 
       j.setEditable(false);
       
       try{
           j.setPage("https://www.bkash.com/bn");
       }catch(Exception e){
          j.setContentType("text/html");
          j.setText("<html>Could not load, Error 404</html>");
       }
       
       JScrollPane js = new JScrollPane(j);
       getContentPane().add(js);
       
       JButton b1 = new JButton("Back");
       b1.setBounds(610,20,80,40);
       b1.addActionListener(this);
       j.add(b1);
       
       setBounds(670,240,800,600);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Payment().setVisible(true);
    }
    
    public static void main(String[] args) {
        new Bkash().setVisible(true);
    }
 
}
