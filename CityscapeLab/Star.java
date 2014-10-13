import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
 * White points that act as stars in the night sky
 * 
 * @author Yi Qiao 
 * @version 8 September 2014
 */
public class Star
{
    // X coordinate of the star object
    private int starX;
    // Y coordinate of the star object
    private int starY;

    /**
     * Constructor for objects of class Star
     */
    public Star(int x, int y)
    {
        starX = x;
        starY = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double star = new Ellipse2D.Double(starX, starY, 2, 2);
        
        Color color = new Color(255, 255, 247);
        g2.setColor(color);
        g2.draw(star);
        g2.fill(star);
    }
}


