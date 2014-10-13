import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A black road divided in the middle by a perforated yellow line that runs across the middle of the grass 
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Road
{
    /** Width of the road which equals the width of the frame */
    private int roadWidth;
    /** Height of the road which equals 1/5 the height of the frame */
    private int roadHeight;
    /** Y-coordinate of the top left corner of the road */
    private int roadYTop;
    
    /** Y-coordinate of the top left corner of the left-most section of the perforated line */
    private int lineYTop;
    /** X-coordinate of the top left corner of the left-most section of the perforated line */
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
     * Draws the road as a black rectangle, draws the perforated yellow line as repeating smaller yellow rectangles 
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
        // Draws more line segments to the left of the right-most line segment 
        // until the X-coordinate of the left-most line segment is equal to or less than 0 (touching or past the left side of the frame)
        {
            Rectangle line = new Rectangle(lineXRight, lineYTop, 20, 4);
            g2.setColor(Color.YELLOW);
            g2.draw(line);
            g2.fill(line);
            
            // Subtracts width of line segment + 20 from X-coordinate of top left corner of line segment so next segment will be drawn 20 pixels away from current one
            lineXRight = lineXRight - 40;
        }
    }
}
