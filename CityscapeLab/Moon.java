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
    public Moon(int mw, int mh)
    {
        moonWidth = mw;
        moonHeight = mh;
    }

    /**
     * Draws the moon as a circular ellipse and fills it in with a white-yellow color
     * 
     * @param  g2   the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(30, 30, moonWidth, moonHeight);
        Color color = new Color(255, 255, 247);
        
        g2.setColor(color);
        g2.draw(moon);
        g2.fill(moon);
    }
}
