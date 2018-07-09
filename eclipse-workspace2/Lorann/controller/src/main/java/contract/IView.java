package contract;

import java.util.Observer;

import controller.IController;


public interface IView 
{

	/**
	 *a method
	 * update what the user see on screen
	 */
	void repaint();

	
	/**
	 * a methode
	 * Open the window
	 */
	void openFrame();

	
	/**
	 * Get the observer of the view
	 * @return
	 * An observer
     */
	Observer getObserver();

	
	/**
	 * Setter of the controller
	 * @param controller
	 * Set the controller of the view
	 */
	void setController(IController controller);

}

