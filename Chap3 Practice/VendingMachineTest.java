

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A unit test of the class VendingMachine that tests all of the methods of that class
 * 
 * @author Yi Qiao
 * @version 19 September 2014
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    @Test
    public void testFillUp()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.fillUp(10);
        int cans = testVendingMachine.getCanCount();
        assertEquals(20, cans, 1e-6);
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    @Test
    public void testInsertToken()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.insertToken();
        int tokens = testVendingMachine.getTokenCount();
        int cans = testVendingMachine.getCanCount();
        assertEquals(1, tokens, 1e-6);
        assertEquals(9, cans, 1e-6);
    }

}
