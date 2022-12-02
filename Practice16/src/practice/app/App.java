package practice.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App extends JFrame {
    JTextArea textArea = new JTextArea();
    Font font = new Font("Times new Roman",Font.BOLD,20);
    Color color = Color.BLACK;
    JComboBox comboBoxColor = new JComboBox(new String[]{"Black","Blue","Red"});
    JComboBox comboBoxFont = new JComboBox(new String[]{"Times New Roman","MS Sans Serif","Courier New"});
    public App(){
        super("App");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        textArea.setSize(300,300);
        textArea.setFont(font);
        textArea.setForeground(color);
        add(textArea);
        add(comboBoxFont);
        add(comboBoxColor);
        comboBoxFont.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = comboBoxFont.getSelectedIndex();
                switch (index) {
                    case (0) -> {
                        font = new Font("Times new Roman", 1, 20);
                    }
                    case (1) -> {
                        font = new Font("MS Sans Serif", 1, 20);
                    }
                    case (2) -> {
                        font = new Font("Courier New", 1, 20);
                    }
                }
                textArea.setFont(font);
            }
        });
        comboBoxColor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = comboBoxColor.getSelectedIndex();
                switch (index){
                    case(0)->{
                        color = Color.BLACK;
                    }
                    case(1)->{
                        color = Color.BLUE;
                    }
                    case(2)->{
                        color = Color.RED;
                    }
                }
                textArea.setForeground(color);
            }
        });
    }
}
