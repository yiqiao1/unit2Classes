import java.util.Scanner;

public class NumberReader
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String x;
        
        System.out.print("Please enter an integer between 1000 and 999999: ");
        x = s.next();
        
        int y = x.length()-3;
        
        String a = x.substring(y);
        a = "," + a;
        
        String b = x.substring(0, y);
        
        System.out.println(b + a);
        
    }
}
        