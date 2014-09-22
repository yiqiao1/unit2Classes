import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Constructs a target that can be placed anywhere on the screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** The x-coordinate of the top-left corner of the target */
    private int xLeft;
    
    /** The y-coordinate of the top-left corner of the target */
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the target
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //The largest circle in the target
        Ellipse2D.Double bigCircle = new Ellipse2D.Double(xLeft + 10, yTop + 10, 50, 50);
        
        //The middle circle in the target
        Ellipse2D.Double midCircle = new Ellipse2D.Double(xLeft + 10, yTop + 10, 40, 40);
        
        //The smallest circle in the target
        Ellipse2D.Double smallCircle = new Ellipse2D.Double(xLeft + 10, yTop + 10, 30, 30);
        
        g2.draw(bigCircle);
        g2.draw(midCircle);
        g2.draw(smallCircle);
    }

}
