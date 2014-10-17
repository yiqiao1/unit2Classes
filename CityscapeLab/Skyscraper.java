import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Skyscraper of a random size with windows
 * 
 * @author Yi Qiao
 * @version 6 October 2014
 */
public class Skyscraper
{
    /** X-coordinate of the top left corner of the skyscraper */
    private int scraperXRight;
    /** Y-coordinate of the top left corner of the skyscraper */
    private int scraperYTop;
    /** Width of the skyscraper */
    private int scraperWidth;
    /** Height of the skyscraper */
    private int scraperHeight;
    /** Width of the frame */
    private int frameWidth;
    /** Y-coordinate of the top left corner of the grass */
    private int grassYTop;
    /** X-coordinate of the top left corner of the window to the left of the middle of the skyscraper */
    private int windowXRightL;
    /** X-coordinate of the top left corner of the window to the right of the middle of the skyscraper */
    private int windowXRightR;
    /** Y-coordinate of the top left corner of the window */
    private int windowYTop;

    /**
     * Constructor for objects of class Skyscraper
     * 
     * @param  x   the width of the frame in pixels
     * @param  gyt   the Y-coordinate of the top left corner of the grass
     */
    public Skyscraper(int frameWidth, int frameHeight)
    {
        this.frameWidth = frameWidth;
        grassYTop = 3*(frameHeight/5);     
    }

    /**
     * Draws the skyscraper as a gray rectangle of a random size, draws evenly distributed yellow windows on the skyscraper 
     * 
     * @param  g2   the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Random num = new Random();
        
        // Sets the Y-coordinate of the top left corner of the skyscraper as a random number of pixels between 60 - 260
        scraperYTop = num.nextInt(201) + 60;
        // Sets the width of the skyscraper to a random number of pixels between 50 - 100
        scraperWidth = num.nextInt(51) + 50;
        // Sets X-coordinate of top left coordinate of the right-most skyscraper 
        // so that there will always be a skyscraper 20 pixels away from the right side of the frame 
        scraperXRight = frameWidth - scraperWidth - 20;
        // Sets the height of the skyscraper so that it will always extend all the way down to the top of the grass
        scraperHeight = grassYTop - scraperYTop - 1;
        
        while (scraperXRight > 0)
        // Starts with a skyscraper at the right of the frame and keeps adding more skyscrapers to the left 
        // while the X-coordinate of the top left corner of the leftmost skyscraper is not equal or less than 0
        {
            Rectangle skyscraper = new Rectangle(scraperXRight, scraperYTop, scraperWidth, scraperHeight);
            Random colorGenerator = new Random();
            int red = colorGenerator.nextInt(256);
            int green = colorGenerator.nextInt(256);
            int blue = colorGenerator.nextInt(256);
            Color color = new Color(red, green, blue);
            
            g2.setColor(color);
            g2.draw(skyscraper);
            g2.fill(skyscraper);
            
            // Sets the X-coordinate of the top of the middle of the skyscraper 
            int scraperHalf = scraperXRight + (scraperWidth/2);
            // Sets the width of half the skyscraper
            int scraperHalfWidth = scraperWidth/2;
            
            // To ensure that the windows will always be centered in the middle of the skyscraper:
            // Sets the X-coordinate of the top left corner of the uppermost window to the left of the middle of the skyscraper
            windowXRightL = scraperHalf - 20;
            // Sets the X-coordinate of the top left corner of the uppermost window to the right of the middle of the skyscraper
            windowXRightR = scraperHalf + 5;
            
            // Sets the Y-coordinate of the top left corner of the uppermost row of windows
            windowYTop = scraperYTop + 10;
            
            while (scraperHeight >= 40)
            // Starts with 2 windows at the top of the middle of the skyscraper and adds more windows below them 
            // but leaves 39 - 25 pixels of space between the bottom of the last window and the bottom of the building
            {
                // The uppermost window to the left of the middle of the skyscraper
                Rectangle window3 = new Rectangle(windowXRightL, windowYTop, 15, 15);
                // The uppermost window to the left of the middle of the skyscraper
                Rectangle window4 = new Rectangle(windowXRightR, windowYTop, 15, 15);

                g2.setColor(Color.YELLOW);
                g2.draw(window3);
                g2.fill(window3);
                g2.draw(window4);
                g2.fill(window4);
                
                // Subtracts width of window + 10 from width of half the skyscraper to account for first 2 columns of windows and the space in between them
                scraperHalfWidth = scraperHalfWidth - 25;
                
                // Subtracts height of window + 15 so that the next window will be 15 pixels below the current one 
                scraperHeight = scraperHeight - 30;
                
                while (scraperHalfWidth >= 40)
                // Starts with 2 windows to the left and right of the initial 2 in the middle and keeps adding more windows to the left and right 
                // but leaves 39 - 25 pixels of space between the sides of the left-most and right-most windows and the sides of the buildings
                {              
                    // Sets X-coordinate of top left corner of next window to the left to 25 pixels to the left 
                    // so that there will be 10 pixels of space between the sides of the windows
                    windowXRightL = windowXRightL - 25;
                    // Sets X-coordinate of top left corner of next window to the right to 25 pixels to the right 
                    // so that there will be 10 pixels of space between the sides of the windows
                    windowXRightR = windowXRightR + 25;
                    
                    // Subtracts width of window + 10 so that the next windows will be 10 pixels to the left/right of the current one
                    scraperHalfWidth = scraperHalfWidth - 25;
                    
                    Rectangle window1 = new Rectangle(windowXRightL, windowYTop, 15, 15);
                    Rectangle window2 = new Rectangle(windowXRightR, windowYTop, 15, 15);
                    
                    g2.setColor(Color.YELLOW);
                    g2.draw(window1);
                    g2.fill(window1);
                    g2.draw(window2);
                    g2.fill(window2);
                }
                
                // Resets previous values changed in above while loop to start new row of windows below previous row
                scraperHalfWidth = scraperWidth/2;
                windowXRightL = scraperHalf - 20;
                windowXRightR = scraperHalf + 5;
                
                // Sets Y-coordinate of top left corner of the next window down to 30 pixels below the above window
                // so that there will be 15 pixels of space between each 15 pixel long window
                windowYTop = windowYTop + 30;
            }
            
            // Subtracts width of largest possible skyscraper + 60 extra pixels from X-coordinate of the top left corner of skyscraper
            // to make sure there is at least 60 pixels of space between each skyscraper
            scraperXRight = scraperXRight - 160;
            
            // Generates new values for skyscraper's width and height to randomize skyscrapers
            scraperYTop = num.nextInt(201) + 60;
            scraperWidth = num.nextInt(101) + 50;
            scraperHeight = grassYTop - scraperYTop - 1;
        }
    }
}
