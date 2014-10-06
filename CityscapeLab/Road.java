import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A road that runs across the grass
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Road
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xRight;
    private int roadYBottom;
    private int roadYTop;

    /**
     * Default constructor for objects of class Sky
     */
    public Road(int yt, int x, int yb)
    {
        xRight = x;
        roadYTop = yt;
        roadYBottom = yb;
    }

    /**
     * Draws the road as a rectangle
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(0, roadYTop, xRight, roadYBottom);

        g2.setColor(Color.BLACK);
        g2.draw(road);
        g2.fill(road);
    }
}
