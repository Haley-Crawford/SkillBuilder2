
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (Haley Crawford)
 * @version (0.1)
 */
public class PowerPill
{
    private static final int DEFAULT_POWER = 10;

    // instance variables
    private int power;
    private String name;


    // constructors

    /**
     * Initializes this power pill to a default power value
     * and sets the name of the pill to name.
     * @param name the name of this power pill.
     */
    public PowerPill(String name)
    {
        this.name = name;
        power = DEFAULT_POWER;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
    public PowerPill(String name, int power)
    {
        this.name = name;
        this.power = power;
    }


    // accessor methods

    /**
     * Gets the name of this power pill
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the power level of this power pill
     */
    public int getPower()
    {
        return power;
    }


    // mutator methods

    /**
     * Sets the name of this power pill
     * @param name the new name of this power pill
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets the power level of this power pill
     * @param power the new power level of this power pill
     */
    public void setPower(int power)
    {
        this.power = power;
    }

    // toString method

    /**
     * Returns the name of this power pill with its associated power level
     */
    public String toString()
    {
        return "PowerPill " + name + " = " + power;
    }
}