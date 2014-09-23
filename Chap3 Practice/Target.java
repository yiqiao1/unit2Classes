import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

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

    public static int WIDTH = 300;
    public static int HEIGHT = 300;
    
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
        Ellipse2D.Double bigCircle = new Ellipse2D.Double(xLeft, yTop, 300, 300);
        
        //The middle circle in the target
        Ellipse2D.Double midCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, 200, 200);
        
        //The smallest circle in the target
        Ellipse2D.Double smallCircle = new Ellipse2D.Double(xLeft + 100, yTop + 100, 100, 100);
        
        g2.setPaint(Color.RED);
        g2.draw(bigCircle);
        g2.fill(bigCircle);
        
        g2.setPaint(Color.BLUE);
        g2.draw(midCircle);
        g2.fill(midCircle);
        
        g2.setPaint(Color.BLACK);
        g2.draw(smallCircle);
        g2.fill(smallCircle);
        
    }

}
