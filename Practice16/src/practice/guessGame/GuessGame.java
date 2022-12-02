package practice.guessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGame extends JFrame {
    private Random random = new Random();
    JTextField textField = new JTextField(2);
    JButton button = new JButton("Guess");
    int randomNumber;
    int tryCount = 0;
    boolean isWinner;
    public GuessGame(){
        super("Guess game");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        isWinner = false;
        randomNumber = random.nextInt(20);
        add(textField);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isWinner){
                    JOptionPane.showMessageDialog(null,"You have already won. Game over!!!","Winner",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(tryCount == 3){
                    JOptionPane.showMessageDialog(null,"You lost","Loser",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                int number;
                try{
                    number = Integer.parseInt(textField.getText());
                    tryCount++;
                    String result = compare(number);
                    if(result.equals("Equals")){
                        JOptionPane.showMessageDialog(null,"You guess the number, count of tries: " + tryCount,"Winner",JOptionPane.INFORMATION_MESSAGE);
                        isWinner = true;
                        return;
                    }
                    if(tryCount == 3){
                        JOptionPane.showMessageDialog(null,"You lost. The right number is " + randomNumber,"Loser",JOptionPane.INFORMATION_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(null,"Your number is " + result + " than guessed number","",JOptionPane.INFORMATION_MESSAGE);


                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Error in numbers","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
    private String compare(int number){
        if(number > randomNumber) return "More";
        if(number < randomNumber) return "Less";
        return "Equals";
    }
}
