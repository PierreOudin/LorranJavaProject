package model;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

    /** The id. */
    private final int id;

    /** The name. */
    private String    name;

	private String chemin;


    /**
     * Instantiates a new example.
     *
     * @param string
     *            the name
     * @param chemin 
     */
    public Example(final int id, final String chemin, final String string) {
        super();
        this.id = id;
        this.name = string;
        this.chemin = chemin;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setchemin(final String chemin) {
    	this.chemin = chemin;
    }
    
    public String getchemin() {
    	return this.chemin;
    }


    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return /*this.getId() + " : " + */this.getName()/* + " : " + this.getchemin()*/;
    }
}
