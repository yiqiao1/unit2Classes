import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * A round yellow moon in the sky
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
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
