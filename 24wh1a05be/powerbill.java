package comsample;
import java.util.Scanner;
public class empl 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter old reading of units:");
        int oldReading = input.nextInt();
        
        System.out.println("Enter current reading of units:");
        int currentReading = input.nextInt();

        if (currentReading < oldReading) 
        {
            System.out.println("Error bcz Current reading can't be less.");
        } else 
        {
            int units = currentReading - oldReading;
            int bill = 0;
            if (units <= 50) 
            {
                bill = units * 1;
            } else if (units <= 100) 
            {
                bill = 50 * 1 + (units - 50) * 2;
            } else if (units <= 200) 
            {
                bill = 50 * 1 + 50 * 2 + (units - 100) * 3;
            } else if (units <= 400) 
            {
                bill = 50 * 1 + 50 * 2 + 100 * 3 + (units - 200) * 4;
            } else 
            {
                bill = 50 * 1 + 50 * 2 + 100 * 3 + 200 * 4 + (units - 400) * 5;
            }

            System.out.println("Total units:" + units);
            System.out.println("bill:₹" + bill);
        }

        input.close();
    }
}
