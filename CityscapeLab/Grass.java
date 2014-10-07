import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Green grass on the ground?
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Grass
{
    /** description of instance variable x (add comment for each instance variable) */
    private int grassWidth;
    private int grassHeight;
    private int yTop;

    /**
     * Default constructor for objects of class Grass
     */
    public Grass(int yt, int gw, int gh)
    {
        yTop = yt;
        grassWidth = gw;
        grassHeight = gh;
    }

    /**
     * Draws the grass as a rectangle
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle(0, yTop, grassWidth, grassHeight);
        Color color = new Color(0, 204, 0);

        g2.setColor(color);
        g2.draw(grass);
        g2.fill(grass);
    }
    
    
}
