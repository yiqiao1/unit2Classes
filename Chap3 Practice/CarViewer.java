import javax.swing.JFrame;

/**
 * Shows a frame that contains a TargetComponent
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarViewer
{
    public static void main(String[] args)
    {
    
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
