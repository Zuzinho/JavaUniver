package practice;

import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    public JLabel label;
    public Picture(){
        super("Animation");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(1300,700);
        label = new JLabel();
        add(label);
    }

    public void setLabel(String path) {
        setTitle(path);
        this.label = new JLabel(new ImageIcon(path));
        setVisible(true);
    }
}
