package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    private int milanGoalsCount = 0;
    private int realGoalsCount = 0;
    JButton milanButton = new JButton("AC Milan");
    JButton realButton = new JButton("Real Madrid");
    JLabel resultLabel = new JLabel("Result: " + milanGoalsCount + " X " + realGoalsCount);
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    JLabel winnerLabel = new JLabel("Winner: DRAW");
    public Match(){
        super("Match");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(milanButton);
        add(realButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        milanButton.addActionListener(e -> {
            milanGoalsCount++;
            resultLabel.setText("Result: " + milanGoalsCount + " X " + realGoalsCount);
            lastScorerLabel.setText("Last Scorer: AC Milan");
            winnerLabel.setText("Winner: " + getWinner());
        });
        realButton.addActionListener(e -> {
            realGoalsCount++;
            resultLabel.setText("Result: " + milanGoalsCount + " X " + realGoalsCount);
            lastScorerLabel.setText("Last Scorer: Real Madrid");
            winnerLabel.setText("Winner: " + getWinner());
        });
    }
    private String getWinner(){
        if(milanGoalsCount > realGoalsCount) return "AC Milan";
        if(realGoalsCount > milanGoalsCount) return "Real Madrid";
        return "DRAW";
    }
}
