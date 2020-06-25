/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Menu extends Frame implements ActionListener {

    Button btnPlay, btnMode, btnExit;
    public int modeThroughWall;

    public Menu() {

        setTitle("Menu");
        setBackground(Color.WHITE);
        setLayout(null);

        btnPlay = new Button("Play");
        btnPlay.setBounds(90, 60, 120, 40);
        btnPlay.addActionListener(this);
        add(btnPlay);

        btnExit = new Button("Exit");
        btnExit.setBounds(90, 120, 120, 40);
        btnExit.addActionListener(this);
        add(btnExit);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPlay) {
            Menu f1 = new Menu();
            f1.setVisible(false);
            
            Window f2 = new Window();
            f2.setTitle("Game");
            f2.setSize(400, 400);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }
}
