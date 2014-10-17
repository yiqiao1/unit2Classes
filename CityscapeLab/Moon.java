import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * A round yellow moon in the upper-left corner of the sky
 * 
 * @author Yi Qiao 
 * @version 5 October 2014
 */
public class Moon
{
    private int moonWidth;
    private int moonHeight;
    
    /**
     * Constructor for objects of class moon
     */
    public Moon(int frameWidth)
    {
        // Moon width is 1/9 width of frame
        moonWidth = 1*(frameWidth/9);
        // Moon height is equal to moon width so moon will be circle
        moonHeight = moonWidth;
    }

    /**
     * Draws the moon as a circular ellipse and fills it in with a white-yellow color
     * 
     * @param  g2   the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(40, 40, moonWidth, moonHeight);
        Color color = new Color(255, 255, 247);
        
        g2.setColor(color);
        g2.draw(moon);
        g2.fill(moon);
    }
}
