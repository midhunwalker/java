import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Salary extends JFrame implements ActionListener {
    // JLabel lb1, lb2, lb3, lb4, lb5;
    JTextField txtName, txtBase, txtDa, txtPf, txtNet;
    // JButton btn1, btn2;

    Salary() {
        super("A Simple Swing Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fix: SetDefaultCloseOperation -> setDefaultCloseOperation
        setLayout(null);

        JLabel lb1 = new JLabel("Employee Name");
        lb1.setBounds(100, 75, 150, 30);
        JLabel lb2 = new JLabel("Base Salary");
        lb2.setBounds(100, 115, 150, 30);
        JLabel lb3 = new JLabel("DA(%)");
        lb3.setBounds(100, 145, 150, 30);
        JLabel lb4 = new JLabel("PF Amount(%)");
        lb4.setBounds(100, 180, 150, 30);
        JLabel lb5 = new JLabel("Net Salary");
        lb5.setBounds(100, 210, 150, 30);

        JTextField txtName = new JTextField();
        txtName.setBounds(250, 75, 150, 30);
        JTextField txtBase = new JTextField();
        txtBase.setBounds(250, 115, 150, 30);
        JTextField txtDa = new JTextField();
        txtDa.setBounds(250, 145, 150, 30);
        JTextField txtPf = new JTextField();
        txtPf.setBounds(250, 180, 150, 30);
        JTextField txtNet = new JTextField();
        txtNet.setBounds(250, 210, 150, 30);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(txtName);
        add(txtBase);
        add(txtDa);
        add(txtPf);
        add(txtNet);

        JButton btn1 = new JButton("Calculate");
        btn1.setBounds(100, 250, 100, 30);
        JButton btn2 = new JButton("Exit");
        btn2.setBounds(250, 250, 100, 30);
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            Float Base = Float.parseFloat(txtBase.getText());
            Float DA = Float.parseFloat(txtDa.getText());
            Float PF = Float.parseFloat(txtPf.getText());
            Float Net = Base + Base * DA / 100 + PF / 100;
            txtNet.setText(Net + "");
        } else if (e.getActionCommand().equals("Exit")) { // Fix: Added "Exit" case
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Salary();
    }
}