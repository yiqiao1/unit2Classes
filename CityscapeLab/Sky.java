import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * A sky that transitions from day to night
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class Sky
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xRight;
    private int yBottom;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky(int x, int y)
    {
        xRight = x;
        yBottom = y;
    }

    /**
     * Draws the sky as a rectangle
     *
     * @param    g2    the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(0, 0, xRight, yBottom);
        Color color1 = new Color(153, 255, 255);
        Color color2 = new Color(51, 255, 255);
        Color color3 = new Color(0, 240, 240);
        Color color4 = new Color(0, 204, 204);
        Color color5 = new Color(153, 255, 255);
        Color color6 = new Color(153, 255, 255);
        Color color7 = new Color(153, 255, 255);
        Color color8 = new Color(153, 255, 255);
        Color color9 = new Color(153, 255, 255);
        Color color10 = new Color(153, 255, 255);
        Color color11 = new Color(153, 255, 255);
        Color color12 = new Color(153, 255, 255);
        Color color13 = new Color(153, 255, 255);
        Color color14 = new Color(153, 255, 255);
        Color color15 = new Color(153, 255, 255);
        
        g2.setColor(color1);
        g2.draw(sky);
        g2.fill(sky);
        Thread.sleep(1000);
        g2.setColor(color2);
        g2.draw(sky);
        g2.fill(sky);
        g2.setColor(color3);
        g2.draw(sky);
        g2.fill(sky);
        g2.setColor(color4);
        g2.draw(sky);
        g2.fill(sky);
        g2.setColor(color5);
        g2.draw(sky);
        g2.fill(sky);
    }

}
