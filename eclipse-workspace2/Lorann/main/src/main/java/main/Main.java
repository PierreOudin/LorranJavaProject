package main;

import java.sql.SQLException;

import controller.*;
import contract.*;
import model.*;
import view.*;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */

public abstract class Main {

	public static void main(final String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view,model);
		view.setController(controller);
		controller.start();
	}
}

/*public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    /*public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
            //controller.keyPressed();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        } 
    }

}*/

