

/**
 * The door class contains the measurements of the door and if it is open or closed.
 * 
 * @author Yi Qiao
 * @version 17 September 2014
 */
public class Door
{
    /** name of door that distinguishes it from other doors, such as 
     * "front" or side" */
    private String name;
    
    /** whether door is opened or closed */
    private String state;

    /**
     * Default constructor for objects of class Door
     */
    public Door(String doorName, String doorState)
    {
        this.name = doorName;
        this.state = doorState;
    }

    /**
     * Changes the state of the door to closed.
     *
     * @pre        Door should be open
     * 
     */
    public void close()
    {
         this.state = "close";
    }


    /**
     * Changes the state of the door to open
     *
     * @pre     Door should be closed
     */
    public void open()
    {
        this.state = "open";
    }


    /**
     * Returns name of door
     *
     * @return  Name of door
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets name of door as a string parameter inputted by user
     *
     * @param   newName   name of door
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    
}
