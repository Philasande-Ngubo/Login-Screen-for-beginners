/*
*Login For beginners
*Author : Philasande Ngubo
*Date   : 19-August-2023
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener
{ 
 // Instace variables
 private JFrame frmLogin = new JFrame("Ngubo Login System");
 private JTextField edtName = new JTextField();
 private JPasswordField edtPass = new JPasswordField();
 private JLabel lblName = new JLabel("Username :");
 private JLabel lblPass = new JLabel("Password :"); 
 private JButton btnLogin = new JButton("Login");
 
 public Login()
 {
  //initialise form
  frmLogin.setSize(370 , 250);
  frmLogin.setLayout(null);
  frmLogin.setVisible(true);
  frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //initialise labels
  lblName.setBounds(30,30,80,20);
  lblPass.setBounds(30,90,80,20);
  
  //initialise edit boxes and button
  edtName.setBounds(100,30,200,30);
  edtPass.setBounds(100,90,200,30);
  btnLogin.setBounds(100,130,200,40);
  //button on press event
  btnLogin.addActionListener(this);
 
  //add objects
  frmLogin.add(lblName);
  frmLogin.add(lblPass);
  frmLogin.add(edtName);
  frmLogin.add(edtPass);
  frmLogin.add(btnLogin);
  
  }
  //Overide the actionPerformed method to detect your desired event
  // in this case the button clicked
  public void actionPerformed(ActionEvent e){
  // for this simple example we will hard code
  // the details so we do not use any data bases 
  // or something like that
  //username ="Phila"
  //password = "Password123"
  
  if (edtName.getText().equals("Phila") )
  {
   if (edtPass.getText().equals("Password123") )
   {
    //hides the Login Frame and shows the Welcome
    frmLogin.setVisible(false);
    Welcome wel = new Welcome();
   }
   else
   {
     JOptionPane.showMessageDialog(null,"Invalid Password");
     edtPass.setText("");
     edtPass.requestFocus();

   }
  }
  
  else
  {
    JOptionPane.showMessageDialog(null,"Invalid username");
    edtName.setText("");
    edtPass.setText("");
    //set cursor to password text field
    edtName.requestFocus();

  }
  
  }
  
   }

