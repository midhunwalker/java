import javax.swing.*;
class Java_JLabel_
{
public static void main(String args[])
{
JFrame f= new JFrame("Label Demo");
JLabel label1,label2;
JButton Button1;
JTextField TextBox1,TextBox2;
Button1=new JButton("Sign In");
label1=new JLabel("User Name:");
label2=new JLabel("Password:");
TextBox1 = new JTextField(20);
TextBox2 = new JTextField(20);
label1.setBounds(50,50, 100,30);
label2.setBounds(50,100, 100,30);
TextBox1.setBounds(180,50, 150,20);
TextBox2.setBounds(180,100, 150,20);
Button1.setBounds(110,150,95,30);
f.add(label1);
f.add(label2);
f.add(Button1);
f.add(TextBox1);
f.add(TextBox2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
}
