import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A blue sky that covers the entire screen
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xRight;
    private int yBottom;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky(int x, int y)
    {
        xRight = x;
        yBottom = y;
    }

    /**
     * Draws the sky as a rectangle
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0, 0, xRight, yBottom);
        Color color = new Color(0, 0, 102);
        
        g2.setColor(color);
        g2.draw(sky);
        g2.fill(sky);
    }
    
    
}
