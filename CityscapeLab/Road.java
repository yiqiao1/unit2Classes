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
    private int roadWidth;
    private int roadHeight;
    private int roadYTop;
    
    private int lineYTop;
    private int lineXRight;

    /**
     * Default constructor for objects of class Sky
     */
    public Road(int ryt, int rw, int rh, int lyt, int lxr)
    {
        roadYTop = ryt;
        roadWidth = rw;
        roadHeight = rh;
        
        lineYTop = lyt;
        lineXRight = lxr;
    }

    /**
     * Draws the road as a rectangle
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(0, roadYTop, roadWidth, roadHeight);

        g2.setColor(Color.BLACK);
        g2.draw(road);
        g2.fill(road);
        
        while (lineXRight > 0)
        {
            Rectangle line = new Rectangle(lineXRight, lineYTop, 20, 4);
            g2.setColor(Color.YELLOW);
            g2.draw(line);
            g2.fill(line);
            lineXRight = lineXRight - 40;
        }
    }
}
