package practice.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private class PLus implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 + number2;
                showResult(result);
            }
            catch (Exception exception){
                showError();
            }
        }
    }
    private class Minus implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            try{
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 - number2;
                showResult(result);
            }
            catch (Exception exception){
                showError();
            }
        }
    }
    private class Multiplication implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            try{
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 * number2;
                showResult(result);
            }
            catch (Exception exception){
                showError();
            }
        }
    }
    private class Division implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                double number1 = Double.parseDouble(textField1.getText());
                double number2 = Double.parseDouble(textField2.getText());
                double result = number1 / number2;
                showResult(result);
            } catch (Exception exception) {
                showError();
            }
        }
    }

    JTextField textField1 = new JTextField(10);
    JTextField textField2 = new JTextField(10);

    JButton plusButton = new JButton("Plus");
    JButton minusButton = new JButton("Minus");
    JButton multiButton = new JButton("Multiplication");
    JButton divButton = new JButton("Division");

    Font font = new Font("Times new roman",Font.BOLD,20);
    public Calculator(){
        super("Calculator");
        setDefaultCloseOperation(3);
        setSize(400,400);
        setLayout(new FlowLayout());
        setFont(font);
        add(new JLabel("Enter the first number"));
        add(textField1);
        add(new JLabel("Enter the second number"));
        add(textField2);
        add(plusButton);
        add(minusButton);
        add(multiButton);
        add(divButton);
        plusButton.addActionListener(new PLus());
        minusButton.addActionListener(new Minus());
        multiButton.addActionListener(new Multiplication());
        divButton.addActionListener(new Division());
    }

    private void showResult(double result){
        JOptionPane.showMessageDialog(null,"Result = " + result,"Result",JOptionPane.INFORMATION_MESSAGE);
    }
    private void showError(){
        JOptionPane.showMessageDialog(null,"Error in numbers","Error",JOptionPane.ERROR_MESSAGE);
    }
}
