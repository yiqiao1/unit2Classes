import java.util.Scanner;

public class RectangleSides
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double l, w;
        
        System.out.print("Enter the rectangle's length: ");
        l = s.nextDouble();
        
        System.out.print("Enter the rectangle's width: ");
        w = s.nextDouble();
        
        double area = l*w;
        double perimeter = (2*l) + (2*w);
        double diagonal = Math.sqrt(l*l + w*w);
        
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is " + diagonal);
    }
}
        