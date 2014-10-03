import java.util.Scanner;

public class PhoneNumberReader
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String x;
        
        System.out.print("Please print a 10-digit phone number: ");
        x = s.next();
        
        String a = x.substring(0, 3);
        String b = x.substring(3, 6);
        String c = x.substring(6);
        
        a = "(" + a + ")";
        String finalNum = a + " " + b + "-" + c;
        
        System.out.println(finalNum);
    }
}
        