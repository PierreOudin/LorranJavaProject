package test;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Main { 
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
	switch (keyCode) 
    {
        case KeyEvent.VK_UP: 
        	//Player.movePlayUp(52, 75, map);
        	System.out.println("up");
            break;
        case KeyEvent.VK_LEFT: 
        	//Player.movePlayLeft(52, 75, map);
        	System.out.println("left");
            break;
        case KeyEvent.VK_RIGHT: 
        	//Player.movePlayRight(52, 75, map);
        	System.out.println("right");
            break;
        case KeyEvent.VK_DOWN: 
        	//Player.movePlayDown(52, 75, map);
        	System.out.println("down");
            break;
    }}
}
