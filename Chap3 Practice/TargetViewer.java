import javax.swing.JFrame;

/**
 * Shows a frame that contains a TargetComponent
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
    
        JFrame frame = new JFrame();
        
        frame.setSize(400, 400);
        frame.setTitle("A Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}