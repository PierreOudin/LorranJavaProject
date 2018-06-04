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
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

	private BufferedImage image;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;

    }

    /**
     * Start.
     * @return 
     *
     * @throws SQLException
     *             the SQL exception
     */
    
    public void Sprite(String image) {
        try {
            this.setImage(ImageIO.read(this.getClass().getClassLoader().getResourceAsStream(image)));
        } catch (IOException e) {
            System.err.println("Impossible to load the image"+image);
            e.printStackTrace();
        }
    }
    
    public void start() throws SQLException {
    	
        //String letter = this.getView().displayMessage()
        
        String letter = this.getModel().getExampleById(1).toString();


		int o = 0;
		
		
		JFrame frmM = new JFrame();
		frmM.setTitle("Lorran");
        frmM.setSize(new Dimension(770,500));
		frmM.setLocationRelativeTo(null);
		frmM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmM.setVisible(true);
        frmM.setResizable(false);
        JPanel pnlM = new JPanel();
        pnlM.setBackground(Color.BLACK);
        frmM.setContentPane(pnlM);
        
        
        
    	for (int i = 0 ; i < 12 ;i++)
        {
        	System.out.println("");
        	for (int y = 0; y <20; y++) {
        
                //System.out.print(this.getModel().getExampleById(1).toString().charAt(i));
                
                /*if(i>20) {
                	System.out.println("");
                }
                
                else {*/
                	
                
                //this.getView().displayMessage(this.getModel().getExampleByName("2").toString());

                /*final List<Example> examples = this.getModel().getAllExamples();
                final StringBuilder message = new StringBuilder();
                for (final Example example : examples) {
                    message.append(example);
                    message.append('\n');
                }
                this.getView().displayMessage(message.toString());*/
         /*   }
            public void Viewniveau() { */
                
                	//for (int i1 = 0; i1 > 20 ;) {
                	//if (i = 20 || i = 40 || i = 60 || i = 80 || i = 100 || i = 120 || i = 140, i || 160 || i = 180 || i = 200 ) {
                	 //   System.out.println(i);        	
	
        		//System.out.print(this.getModel().getExampleById(1).toString().charAt(o));	
        	switch (this.getModel().getExampleById(3).toString().charAt(o)) {

        	case '0':
            	
            	JLabel space = new JLabel();
                space.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\space.png"));
                pnlM.add(space);
                
                break;
            case '1':
            	
            	JLabel purse = new JLabel();
                purse.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\purse.png"));
                pnlM.add(purse);
                
                break;
                
            case '2': 
            	
            	JLabel lorann = new JLabel();
                lorann.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\lorann_r.png"));
                pnlM.add(lorann);
                
                break;
                
            case '3': 
            	
            	JLabel crystal_ball = new JLabel();
                crystal_ball.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\crystal_ball.png"));
                pnlM.add(crystal_ball);
                
                break;
                
            case '4': 
            	
            	JLabel fireball = new JLabel();
                fireball.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\fireball.png"));
                pnlM.add(fireball);
                
                break;
                
            case '5':
            	
            	JLabel gate_closed = new JLabel();
                gate_closed.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\gate_closed.png"));
                pnlM.add(gate_closed);
                
                break;
                
            case '6':
            	
            	JLabel gate_open = new JLabel();
                gate_open.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\gate_open.png"));
                pnlM.add(gate_open);
                
                break;
                
            case '7':
            	
            	JLabel vertical_bone = new JLabel();
                vertical_bone.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\vertical_bone.png"));
                pnlM.add(vertical_bone);
                
                break;
                
            case '8':
            	
                JLabel horizontal_bone = new JLabel();
                horizontal_bone.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\horizontal_bone.png"));
                pnlM.add(horizontal_bone);
                
                break;
                
            case '9':
            	
            	JLabel bone = new JLabel();
                bone.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\bone.png"));
                pnlM.add(bone);
                
                break;
                
            case 'A':
            	
            	JLabel monster_1 = new JLabel();
            	monster_1.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\monster_1.png"));
                pnlM.add(monster_1);
                
                break;
                
            case 'B':
            	
            	JLabel monster_2 = new JLabel();
            	monster_2.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\monster_2.png"));
                pnlM.add(monster_2);
                
                break;    
                
            case 'C':
            	
            	JLabel monster_3 = new JLabel();
            	monster_3.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\monster_3.png"));
                pnlM.add(monster_3);
                
                break;
                
            case 'D':
            	JLabel monster_4 = new JLabel();
            	monster_4.setIcon(new ImageIcon("C:\\Users\\pierr\\Desktop\\sprite\\monster_4.png"));
                pnlM.add(monster_4);
                break;
                
            default:
                System.out.print("error");
        	
     
        	//System.out.print(letter.charAt(i));
        }
        	o++;		
        }
        	
        }
        
    	frmM.setContentPane(pnlM);
        frmM.setVisible(true);
        frmM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
    
   
    
}
