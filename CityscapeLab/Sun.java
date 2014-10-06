import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * A round yellow sun in the sky
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    private int sunWidth;
    private int sunHeight;
    
    /**
     * Constructor for objects of class Sun
     */
    public Sun(int sw, int sh)
    {
        sunWidth = sw;
        sunHeight = sh;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(50, 50, sunWidth, sunHeight);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
    }
}
