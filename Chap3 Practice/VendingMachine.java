

/**
 * A vending machine that holds cans of soda, returns cans in exchange for tokens, and can be refilled.
 * 
 * @author Yi Qiao
 * @version 18 September 2014
 */
public class VendingMachine
{
    /** number of cans in the vending machine */
    private int cans;
    
    /** number of tokens user has inserted into the machine */
    private int tokens;

    /**
     * Default constructor for a VendingMachine object with a user-specified number of cans
     */
    public VendingMachine(int totalCans)
    {
        this.cans = totalCans;
        this.tokens = 0;
    }

    /**
     * Constructor for a VendingMachine object with 10 cans
     */
    public VendingMachine()
    {
        this.cans = 10;
        this.tokens = 0;
    }
    
    /**
     * Increases number of cans in the vending machine by parameter specified by user
     *
     * @param    fillCans    number of cans that user wants to add to vending machine
     */
    public void fillUp(int fillCans)
    {
        this.cans = this.cans + fillCans;
    }

    /**
     * Inserts a token into the vending machine which results in 1 can being given away and thus lowering the number of cans by 1
     *
     * @pre     number of cans in vending machine is not equal to or less than 0
     */
    public void insertToken()
    {
        this.tokens = this.tokens + 1;
        this.cans = this.cans - 1;
    }

    /**
     * Returns number of cans in the vending machine as an integer
     *
     * @return  number of cans in the vending machine
     */
    public int getCanCount()
    {
        return this.cans;
    }

    /**
     * Returns number of tokens inserted into the vending machine as an integer
     *
     * @return  number of tokens inserted into the vending machine
     */
    public int getTokenCount()
    {
        return this.tokens;
    }

}
