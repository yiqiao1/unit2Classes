import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

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
        Sky sky = new Sky(x, yb);
        sky.draw(g2);
        
        int gyt = 3*(getHeight()/5);
        Grass grass = new Grass(gyt, x, yb);
        grass.draw(g2);
        
        int ryt = 7*(getHeight()/10);
        int rh = 1*(getHeight()/5);
        int lyt = 8*(getHeight()/10);
        int lxr = getWidth() - 20;
        Road road = new Road(ryt, x, rh, lyt, lxr);
        road.draw(g2);
        
        int mw = 1*(getWidth()/9);
        int mh = mw;
        Moon moon = new Moon(mw, mh);
        moon.draw(g2);
        
        Random num = new Random();
        int ssyt = num.nextInt(201) + 60;
        int ssw = num.nextInt(101) + 50;
        Skyscraper skyscraper = new Skyscraper(x, gyt, ssyt, ssw);
        skyscraper.draw(g2);
        
    }
    }

