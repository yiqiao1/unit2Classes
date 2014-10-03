import java.util.Scanner;

public class GiveChange
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       int amountDue;
       int amountReceived;
       int dollars;
       int quarters;
       int dimes;
       int nickels;
       int pennies;
        
       System.out.print("Please enter the amount due in pennies: ");
       amountDue = s.nextInt();
        
       System.out.print("Please enter the amount received in pennies: ");
       amountReceived = s.nextInt();
        
       int change = amountReceived - amountDue;
        

       dollars = change/100;
       change = change - (dollars*100);
   
       quarters = change/25;
       change = change - (quarters*25);
 
       dimes = change/10;
       change = change - (dimes*10);

       nickels = change/5;
       change = change - (nickels*5);

       pennies = change;
        
       System.out.println("The customer should receive:");
       System.out.println(dollars + " dollar(s)");
       System.out.println(quarters + " quarter(s)");
       System.out.println(dimes + " dime(s)");
       System.out.println(nickels + " nickel(s)");
       System.out.println(pennies + " pennies");
    }
}