import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth();
        int yb = getHeight();
        int yt = 3*(getHeight()/5);
        Sky sky = new Sky(x, yb);
        sky.draw(g2);
        Grass grass = new Grass(x, yt, yb);
        grass.draw(g2);
        
        int ryt = 7*(getHeight()/10);
        int ryb = 1*(getHeight()/5);
        Road road = new Road(ryt, x, ryb);
        road.draw(g2);
    }
    }

