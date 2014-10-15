import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 * cityscape to these object.
 * 
 * @author Yi Qiao
 * @version 3 October 2014
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        Sky sky = new Sky(frameWidth, frameHeight);
        sky.draw(g2);
        
        // Y-coordinate of top left corner of grass is 3/5 down the frame
        int GrassYTop = 3*(getHeight()/5);
        Grass grass = new Grass(GrassYTop, frameWidth, frameHeight);
        grass.draw(g2);
        
        Road road = new Road(frameWidth, frameHeight);
        road.draw(g2);
        
        // Moon width is 1/9 width of frame
        int moonWidth = 1*(getWidth()/9);
        // Moon height is equal to moon width so moon will be circle
        int moonHeight = moonWidth;
        Moon moon = new Moon(moonWidth, moonHeight);
        moon.draw(g2);
        
        Random num = new Random();
        int count = 0;
        while (count < (frameWidth/2))
        // Number of stars equal to half of frame width (so will increase as size of frame increases)
        {
            // X-coordinate of star random number between 0 and frame width - 1
            int starX = num.nextInt(frameWidth);
            // Y-coordinate of star random number between 0 and top of grass - 1
            int starY = num.nextInt(GrassYTop);
            
            Star star = new Star(starX, starY);
            star.draw(g2);
            
            count++;
        }
        
        Skyscraper skyscraper = new Skyscraper(frameWidth, GrassYTop);
        skyscraper.draw(g2);
    }
}

