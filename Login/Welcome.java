/*
*Login For beginners
*Author : Philasande Ngubo
*Date   : 19-August-2023
*/
import java.awt.*;
import javax.swing.*;
public class Welcome
{
 private JFrame frmWelcome = new JFrame("Welcome");
 private JLabel lblWelcome = new JLabel("Welcome to programming with Philasande (*_*)");
 private Font fntWel = new Font("Verdana", Font.BOLD, 20);
 
 public Welcome()
 {
  //initialise form
  frmWelcome.setSize(700 , 200);
  frmWelcome.setLayout(null);
  frmWelcome.setVisible(true);
  frmWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
  //initialise label
  lblWelcome.setBounds(30,30,600,60);
  lblWelcome.setFont(fntWel);
  
  //add
  frmWelcome.add(lblWelcome);
  }
}