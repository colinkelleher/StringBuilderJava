/**
 * This is a simple implementation of a <b>Builder</b> class
 * for representing and building {@code Strings}
 *
 *
 * @author Colin Kelleher
 * @version 1
 *
 */

public class Builder {

    private String string;

    /**
     * Constructor for the Builder class which constructs a Builder instance
     * which represents an empty {@code String}
     */
    public Builder(){
        this.string = "";
    }

    /**
     * Instance method which appends {@code that}to the current
     * instance's {@code String}representation
     *
     * @param that represents a string to be added onto the current string representation
     */
    public void append(final String that) {
        this.string = this.string + that;
    }

    /**
     * A method which returns the {@code String} represented by the current
     * {@code Builder} instance
     *
     * @return the current string represented by the instance
     */
    @Override
    public String toString() {
        return this.string;
    }

}
