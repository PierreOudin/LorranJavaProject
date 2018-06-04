package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
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
    	
        //String letter = this.getView().displayMessage();
    	String letter = this.getModel().getExampleById(1).toString();


		int o = 0;
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
        	switch (this.getModel().getExampleById(1).toString().charAt(o)) {

        case '0':
        	System.out.print("nothing");
        	break;
        case '1':
        	System.out.print("purse");
        	break;
        case '2': 
        	System.out.print("lorann");
        	break;
        case '3': 
        	System.out.print("crystall ball");
        	break;
        case '4': 
        	System.out.print("fireball");
        	break;
        case '5':
        	System.out.print("gate closed");
        	break;
        case '6':
        	System.out.print("gate open");
        	break;
        case '7':
        	System.out.print("vertical bone");
        	break;
        case '8':
        	System.out.print("horizontal bone");
        	break;
        case '9':
        	System.out.print("bone");
        	break;
		case 'A':
        	System.out.print("monster 1");
        	break;
		case 'B':
			System.out.print("monster 2");
			break;	
		case 'C':
        	System.out.print("monster 3");
        	break;
		case 'D':
        	System.out.print("monster 4");
        	break;
        	
        default:
        	System.out.print("error");
        	
     
        	//System.out.print(letter.charAt(i));
        }
        	o++;		
        }
        	
        }
        
        
        
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
