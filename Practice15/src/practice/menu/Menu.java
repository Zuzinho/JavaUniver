package practice.menu;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    JMenuBar menuBar = new JMenuBar();


    public Menu(){
        super("Menu");
        setSize(400,400);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(3);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem saveMenu = new JMenuItem("Save");
        JMenuItem exitMenu = new JMenuItem("Exit");
        JMenuItem copyMenu = new JMenuItem("Copy");
        JMenuItem cutMenu = new JMenuItem("Cut off");
        JMenuItem insertMenu = new JMenuItem("Insert");
        fileMenu.add(saveMenu);
        fileMenu.add(exitMenu);
        editMenu.add(copyMenu);
        editMenu.add(cutMenu);
        editMenu.add(insertMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
    }
}
