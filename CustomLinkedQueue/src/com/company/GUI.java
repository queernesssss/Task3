package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GUI {

    private JTable table1;
    private JPanel panel1;
    private JButton openFile;
    private JButton removeOdd;
    private JButton fillQueue;
    private JTextField textField1;

    public GUI() {
        LinkedQueue queue = new LinkedQueue();
        final String[] file = new String[1];

        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file[0] = textField1.getText() + ".txt";
            }
        });

        fillQueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner scan = new Scanner(new File(file[0]));
                    while (scan.hasNext()) {
                        queue.offer(Integer.parseInt(scan.nextLine()));
                    }
                    JTableUtils.initJTableForArray(table1, 40, true, true, true, true);
                    com.company.JTableUtils.writeArrayToJTable(table1, queue.toArray());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        removeOdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner scan = new Scanner(new File(file[0]));
                    while (scan.hasNext()) {
                        queue.offer(Integer.parseInt(scan.nextLine()));
                    }
                    JTableUtils.initJTableForArray(table1, 40, true, true, true, true);
                    com.company.JTableUtils.writeArrayToJTable(table1, LinkedQueueUtils.removeOdd(queue).toArray());
                    queue.clean();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setContentPane((new GUI().panel1));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
