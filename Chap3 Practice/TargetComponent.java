import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws the target.
 * 
 * Yi Qiao
 * 22 September 2014
 */
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = (getWidth() - Target.WIDTH)/2;
        int y = (getHeight() - Target.HEIGHT)/2;
        
        Target target1 = new Target(x, y);
        
        target1.draw(g2);
    }
}


        
