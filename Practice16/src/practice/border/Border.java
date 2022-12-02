package practice.border;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Border extends JFrame {
    JTextField northPanel = new JTextField(10);
    JTextField southPanel = new JTextField(10);
    JTextField eastPanel = new JTextField(10);
    JTextField westPanel = new JTextField(10);
    JTextField centerPanel = new JTextField(10);
    public Border(){
        super("Border layout");
        setSize(400,400);
        setDefaultCloseOperation(3);
        setLayout(new BorderLayout());
        northPanel.setBackground(Color.RED);
        southPanel.setBackground(Color.BLUE);
        eastPanel.setBackground(Color.BLACK);
        westPanel.setBackground(Color.GREEN);
        centerPanel.setBackground(Color.YELLOW);
        add(northPanel,"North");
        add(southPanel,"South");
        add(eastPanel,"East");
        add(westPanel,"West");
        add(centerPanel,"Center");
        northPanel.setSize(100,50);
        southPanel.setSize(500,100);
        eastPanel.setSize(500,100);
        westPanel.setSize(100,50);
        centerPanel.setSize(50,50);
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                northPanel.setText("NORTH");
            }
        });
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                southPanel.setText("SOUTH");
            }
        });
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                eastPanel.setText("EAST");
            }
        });
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                westPanel.setText("WEST");
            }
        });
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                centerPanel.setText("CENTER");
            }
        });
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                northPanel.setText("");
            }
        });
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                southPanel.setText("");
            }
        });
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                eastPanel.setText("");
            }
        });
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                westPanel.setText("");
            }
        });
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                centerPanel.setText("");
            }
        });
    }
}
