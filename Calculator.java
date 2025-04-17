import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    // Components of the Calculator
    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        // Frame settings
        setTitle("Calculator");
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Display settings
        display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setFont(new Font("Arial", Font.PLAIN, 36));
        display.setEditable(false);
        add(display);

        // Number buttons and operation buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 36));
            numberButtons[i].setFocusable(false);
        }

        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");

        operationButtons = new JButton[4];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;

        for (int i = 0; i < 4; i++) {
            operationButtons[i].addActionListener(this);
            operationButtons[i].setFont(new Font("Arial", Font.PLAIN, 36));
            operationButtons[i].setFocusable(false);
        }

        decButton.addActionListener(this);
        equButton.addActionListener(this);
        delButton.addActionListener(this);
        clrButton.addActionListener(this);

        decButton.setFont(new Font("Arial", Font.PLAIN, 36));
        equButton.setFont(new Font("Arial", Font.PLAIN, 36));
        delButton.setFont(new Font("Arial", Font.PLAIN, 36));
        clrButton.setFont(new Font("Arial", Font.PLAIN, 36));

        decButton.setFocusable(false);
        equButton.setFocusable(false);
        delButton.setFocusable(false);
        clrButton.setFocusable(false);

        // Panel settings
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Adding buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        add(panel);

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        add(delButton);
        add(clrButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            display.setText(display.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            display.setText("");
        }
        if (e.getSource() == delButton) {
            String temp = display.getText();
            display.setText("");
            for (int i = 0; i < temp.length() - 1; i++) {
                display.setText(display.getText() + temp.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
