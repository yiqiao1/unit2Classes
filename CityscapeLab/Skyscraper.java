import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Write a description of class Skyscraper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skyscraper
{
    // instance variables - replace the example below with your own
    private int scraperXRight;
    private int scraperYTop;
    private int scraperWidth;
    private int scraperHeight;
    private int frameWidth;
    private int grassYTop;

    /**
     * Constructor for objects of class Skyscraper
     */
    public Skyscraper(int x, int gyt, int ssyt, int ssw)
    {
        frameWidth = x;
        grassYTop = gyt;
        scraperYTop = ssyt;
        scraperWidth = ssw;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        scraperXRight = frameWidth - scraperWidth;
        scraperHeight = grassYTop - scraperYTop;
        
        while (scraperXRight > 0)
        {
            Rectangle skyscraper = new Rectangle(scraperXRight, scraperYTop, scraperWidth, scraperHeight);
            g2.setColor(Color.GRAY);
            g2.draw(skyscraper);
            g2.fill(skyscraper);
            scraperXRight = scraperXRight - 160;
        }
    }
}
