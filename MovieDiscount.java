/*
 * Programmer:Kelten Forgie
 * Date:9/25/2020
 * Purpose: to make a ticket for a person 
 */
import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Creates the input scanner
        Scanner input = new Scanner(System.in);
        double priceOfTicket = 14.50;

        // Asks the user for there age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();
        //adds the discount if they are older then 65 or 13 or younger.
        if (age < 13 || age >= 65) {
        	priceOfTicket -= 3;
        }
      //adds the discount if they have a coupon .
        if (coupon == true) {
        	priceOfTicket -= 2;
        }

        // Print the cost of a movie ticket
        System.out.println("Your ticket costs $" + priceOfTicket + "." );
        
    }
}
