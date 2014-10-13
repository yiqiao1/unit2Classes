import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Green grass that covers the bottom 2/5 of the frame
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Grass
{
    /** Width of the grass which equals the width of the frame */
    private int grassWidth;
    /** Height of the grass which equals 2/5 of the height of the frame */
    private int grassHeight;
    /** Y-coordinate of the top left corner of the grass */
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
     * Draws the grass as a rectangle and fills it in with a green color
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
