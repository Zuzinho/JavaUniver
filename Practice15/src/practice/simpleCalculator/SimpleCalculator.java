package practice.simpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class SimpleCalculator extends JFrame {
    private class PLus implements Calculable{
        @Override
        public double getResult(double a, double b) {
            return a + b;
        }
    }
    private class Minus implements Calculable{
        @Override
        public double getResult(double a, double b) {
            return a - b;
        }
    }
    private class Division implements Calculable{
        @Override
        public double getResult(double a, double b) {
            return a / b;
        }
    }
    private class Multiplication implements Calculable{
        @Override
        public double getResult(double a, double b) {
            return a * b;
        }
    }

    JTextArea textArea = new JTextArea(10,10);
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton buttonDiv = new JButton("/");
    JButton buttonMulti = new JButton("*");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonIs = new JButton("=");
    JButton buttonPoint = new JButton(".");

    Calculable operation;

    public SimpleCalculator(){
        super("Simple calculator");
        setSize(500,500);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        add(textArea);
        add(button7);
        add(button8);
        add(button9);
        add(buttonDiv);
        add(button4);
        add(button5);
        add(button6);
        add(buttonMulti);
        add(button1);
        add(button2);
        add(button3);
        add(buttonMinus);
        add(button0);
        add(buttonPoint);
        add(buttonIs);
        add(buttonPlus);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("9");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(".");
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = new Division();
                textArea.append("/");
            }
        });
        buttonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = new Multiplication();
                textArea.append("*");
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = new Minus();
                textArea.append("-");
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation = new PLus();
                textArea.append("+");
            }
        });
        buttonIs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("\\+|-|\\*|/");
                String[] numbers = pattern.split(textArea.getText());
                try{
                    double number1 = Double.parseDouble(numbers[0]);
                    double number2 = Double.parseDouble(numbers[1]);
                    double result = operation.getResult(number1,number2);
                    textArea.setText(String.valueOf(result));
                }
                catch (Exception exception){
                    System.out.println(exception);
                    JOptionPane.showMessageDialog(null,"Error in numbers","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
