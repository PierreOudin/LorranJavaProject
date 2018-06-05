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
    

    
    public void start() throws SQLException {
    	
        /**String letter = this.getView().displayMessage();*/
    	String letter = this.getModel().getExampleById(1).toString();

    	/**initialization off o */
		int o = 0;
		/**first @for used for drop the line 12 time*/
    	for (int i = 0 ; i < 12 ;i++)
        {
        	System.out.println("");
        	/**second @for used for use the switch 20 times*/
        	for (int y = 0; y <20; y++) {
        

        		
        		/**change here the number of the map (1,2,3,4...)*/
        		/**switch for start the map*/
        	switch (this.getModel().getExampleById(4).toString().charAt(o)) {

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
