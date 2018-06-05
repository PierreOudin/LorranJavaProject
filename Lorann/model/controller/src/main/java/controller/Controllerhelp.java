package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import model.Example;
import model.IModel;
import view.IView;
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
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Controllerhelp extends JFrame
implements KeyListener
{
	
	private static final long serialVersionUID = 1L; // cette ligne ne sert à rien mais je n'ai jamais compris pourquoi éclipse veut que je la mette
	 
    public void Fenetre()
    {
        // je créé ma fenetre
 
        setTitle("Test");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
 
        // j'ajoute un objet implémentant l'interface KeyListener à ma fenetre
 
        addKeyListener(this);
         
        // Je demande à ce que ce soit ma fenetre qui intercepte les touches du clavier
         
        requestFocusInWindow();
    }
 
    // Méthode redéfinie depuis KeyListener
    public void keyPressed(KeyEvent key)
    {
        // touche pressée
         
        // Je test les valeurs de ma touche
         
        int codeDeLaTouche = key.getKeyCode();
         
        switch (codeDeLaTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
        {
            case KeyEvent.VK_UP: // si la touche enfoncée est celle du haut
                fonctionPourAvancer();
                break;
            case KeyEvent.VK_LEFT: // si la touche enfoncée est celle de gauche
                fonctionPourAllerAGauche();
                break;
            case KeyEvent.VK_RIGHT: // si la touche enfoncée est celle de droite
                fonctionPourAllerADroite();
                break;
            case KeyEvent.VK_DOWN: // si la touche enfoncée est celle du bas
                fonctionPourReculer();
                break;
        }
    }
 
    // Méthode redéfinie depuis KeyListener
    public void keyReleased(KeyEvent key)
    {
        // touche relachée
    }
 
    // Méthode redéfinie depuis KeyListener
    public void keyTyped(KeyEvent key)
    {
        // touche appuyée, bizarrement ça ne détecte pas les touches flêchées
    }
 
    public void fonctionPourAvancer()
    {
        // tu fait ce que tu veut ici
    }
 
    public void fonctionPourAllerAGauche()
    {
        // tu fait ce que tu veut ici
    }
 
    public void fonctionPourAllerADroite()
    {
        // tu fait ce que tu veut ici
    }
 
    public void fonctionPourReculer()
    {
        // tu fait ce que tu veut ici
    }
}

		