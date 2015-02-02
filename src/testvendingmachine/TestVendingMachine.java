/*
	Program to simulate the operation of a vending machine.
	Author: Amirkhan Mukashev. Sudent, ID: 6605412.
	E-mail Address: am25524@email.vccs.edu.
	Programming Assignment #1.
	Date Modified: 012/02/2015.
*/

/*
Problem Statement
•	The vending machine offers 5 products
•	The vending machine accepts coins, 1 dollar bills, and 5 dollar bills
•	The change is always given in coins, with maximum possible number of coins in each value: 25, 10, 5 or 1 cent.
•	The selections available for user are numbers from 1 to 5.
•	The user enters the money – simulate the action through a loop that ends when the user enters 0. Each coin, or paper bill will be read individually.
•	Once an item is delivered, the machine gives the change in coins.
•	There is no increment for the money during one selection.
•	The user can stop the selection at any time by entering 0 for the product selection.
•	If the user chooses to cancel the selection, the machine returns the initial amount in coins.
•	Display the outcome of the operation for each alternative you consider possible for the vending machine.
•	Make sure that the machine returns the correct change at all times.
Use appropriate selection and repetition loops to solve the problem.  
Write a test program that would take at least 3 combinations of amounts entered and choices of products, and displays the results of all three trials. You can include the vending machine program as a method in the testing program.

*/

package testvendingmachine;
import java.util.Scanner;
public class TestVendingMachine 
{

    public static void main(String[] args) 
    {
        //I decided to use whole numbers because that way it is simpler to operate the calculations
        int H2O = 75;               //water 
        int Cola = 100;             //coke
        int SnickersBar = 155;      //snickers
        int SevenUp = 100;          //sevenup
        int Chips = 190;            //Doritos
        
        int quarters, dimes, nickels, pennies; // coins
        
        int purchase;   //choice for one of the products
        int sum = 0;    // the sum of money entered by a user
        int money;      // money that the user enters
        
        //initial message                                                                                             here: since I use integers, I figured that $5.20 will have to be equal to 520 cents 
        System.out.println ("To use this vending machine please note that in this machine you must use whole numbers,\n i.e. $1 = 100 cents, $5 = 500 cents and therefore $1.25 = 125 cents");
        System.out.println ("Out of bills, it only accepts 5 and 1 dollar bills; and accepts all coins no greater than 1000");
        System.out.println ("Vending machine only accepts Quarter, Dime, Nickel, and Penny in any amount");
        System.out.println (" ");
        System.out.println ("(1) Water price 75 cents");
        System.out.println ("(2) Coke price 100 cents");
        System.out.println ("(3) Snickers price 155 cents");
        System.out.println ("(4) SevenUp price 125 cents");
        System.out.println ("(5) Doritos price 190 cents");
        System.out.println (" ");
       
        
        System.out.println ("Now keep entering your money until you are done or press 0 to stop");
        Scanner keyboard = new Scanner (System.in);    
        
        //boolean loop to insert money
        boolean haveMoney = true;
            
            while (haveMoney)
            {
                money = keyboard.nextInt();
                if (money == 0)
                    haveMoney = false;
                
                else 
                    sum = sum + money;
                                    
            }
            
            System.out.println ("You entered: " + sum + " in cents");
            if (sum < 75)  // 75 -> minimal price of a product
            {
                    System.out.println (" 75 cents is a minimal price to make a purchase");
                    System.out.println ("Your operation is cancelled, here are your money: ");    
                    
                    //to calculate the change
                    quarters = sum/25;
                    sum = sum % 25;
                    dimes = sum/10;
                    sum = sum % 10;
                    nickels = sum/5;
                    sum = sum % 5;
                    pennies = sum;
                    
                    //amount of money to return
                    System.out.println(quarters + " quarter(s)");
                    System.out.println(dimes + " dime(s)");
                    System.out.println(nickels + " nickel(s) and");
                    System.out.println(pennies + " pennies");
                    System.out.println("Thank you! Goodbye!");
                    System.exit(0);}

            if (sum >= 190 && sum < 1000) // When there are enough money for all products, maximum 999 cents, i.e. $9.99
            {
                System.out.println ("Now choose one of the following options: ");
                System.out.println (" ");
                System.out.println ("Press (0) to exit");
                System.out.println ("Press (1) Water price 75 cents");
                System.out.println ("Press (2) Coke price 100 cents");
                System.out.println ("Press (3) Snickers price 155 cents");
                System.out.println ("Press (4) SevenUp price 125 cents");
                System.out.println ("Press (5) Doritos price 190 cents");

        
                purchase = keyboard.nextInt();
                        
                switch(purchase) // switch method for selection purposes, there are 6 cases in total
                {
                    case 0: // to cancel operation
                        System.out.println ("Operation cancelled");
                        System.out.println ("Here is your change:" + sum + " in cents");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
                        break;
                        
                    case 1:  // 75 cents to spend
                        System.out.println ("You chose Water for 75 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - H2O;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                    
                    case 2:  // 100 cents to spend
                        System.out.println ("You chose Coke for 100 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - Cola;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 3:  // 155 cents to spend
                        System.out.println ("You chose Snickers for 155 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - SnickersBar;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 4: // 125 cents to spend
                        System.out.println ("You chose 7-Up for 125 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - SevenUp;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 5: // 190 cents to spend
                        System.out.println ("You chose Doritos for 190 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - Chips;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    default:   // if the user inputs one of the non-existing options the below actions will be taken
                        System.out.println("Invalid choice! Returning your money: " + sum  + " cents in coins: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
            
                }
            System.exit(0);
            }
                
            if (sum >= 75 && sum < 100) // Only two options to choose from either Cancel or 75 cents (0 and 1)
            {
                System.out.println ("Now choose one of the following options: ");
                System.out.println (" ");
                System.out.println ("Press (0) to exit");
                System.out.println ("Press (1) Water price 75 cents");
                
                
                purchase = keyboard.nextInt();
                        
                switch(purchase)
                {
                    case 0: 
                        System.out.println ("Operation cancelled");
                        System.out.println ("Here is your change:" + sum + " in cents");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
                        break;
                        
                    case 1: 
                        System.out.println ("You chose Water for 75 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - H2O;
                        System.out.println ("Your change in cents will be given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                } 
                System.exit(0);
            }
            if (sum >= 100 && sum < 125)    // three available options: 0, 1 and 2, 
            {
                System.out.println ("Now choose one of the following options: ");
                System.out.println (" ");
                System.out.println ("Press (0) to exit");
                System.out.println ("Press (1) Water price 75 cents");
                System.out.println ("Press (2) Coke price 100 cents");
                        
                purchase = keyboard.nextInt();
                        
                switch(purchase)
                {
                    case 0: 
                        System.out.println ("Operation cancelled");
                        System.out.println ("Here is your change:" + sum + " in cents");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
                        break;
                        
                    case 1: 
                        System.out.println ("You chose Water for 75 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - H2O;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                    
                    case 2: 
                        System.out.println ("You chose Coke for 100 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - Cola;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                }
            System.exit(0);
            }
            if (sum >= 125 && sum < 155)        // Four available options: 0, 1, 2, 4 (Option 3 is missing because option 4 is cheaper than option 3)
            {
                System.out.println ("Now choose one of the following options: ");
                System.out.println (" ");
                System.out.println ("Press (0) to exit");
                System.out.println ("Press (1) Water price 75 cents");
                System.out.println ("Press (2) Coke price 100 cents");
                
                System.out.println ("Press (4) SevenUp price 125 cents");
              

        
                purchase = keyboard.nextInt();
                        
                switch(purchase)
                {
                    case 0: 
                        System.out.println ("Operation cancelled");
                        System.out.println ("Here is your change:" + sum + " in cents");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
                        break;
                        
                    case 1: 
                        System.out.println ("You chose Water for 75 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - H2O;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                    
                    case 2: 
                        System.out.println ("You chose Coke for 100 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - Cola;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 4: 
                        System.out.println ("You chose 7-Up for 125 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - SevenUp;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                }
                System.exit(0);
            }
            if (sum >= 155 && sum < 190)        // Five available options: 0, 1, 2, 3, and 4
            {
                System.out.println ("Now choose one of the following options: ");
                System.out.println (" ");
                System.out.println ("Press (0) to exit");
                System.out.println ("Press (1) Water price 75 cents");
                System.out.println ("Press (2) Coke price 100 cents");
                System.out.println ("Press (3) Snickers price 155 cents");
                System.out.println ("Press (4) SevenUp price 125 cents");
                

        
                purchase = keyboard.nextInt();
                        
                switch(purchase)
                {
                    case 0: 
                        System.out.println ("Operation cancelled");
                        System.out.println ("Here is your change:" + sum + " in cents");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
                        break;
                        
                    case 1: 
                        System.out.println ("You chose Water for 75 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - H2O;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                    
                    case 2: 
                        System.out.println ("You chose Coke for 100 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - Cola;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 3: 
                        System.out.println ("You chose Snickers for 155 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - SnickersBar;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                        
                    case 4: 
                        System.out.println ("You chose 7-Up for 125 cents");
                        System.out.println ("You entered: " + sum + " in cents");
                        sum = sum - SevenUp;
                        System.out.println ("Your change in cents is: " + sum);
                        System.out.println ("Your change " + sum + " is given as follows: ");
                        
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
             
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you! Enjoy your purchase!");
             
                        break;
                }
                System.exit(0);
            }
            if (sum >= 1000)           // the maximum amount of money that the machine can accept is $10.00, i.e. 1000 cents 
                System.out.println ("The maximum amount exceeded, please take back your money and start from the beginning ");
                System.out.println ("You entered " + sum + " in cents. It will be given to you as follows:");
            
                        quarters = sum/25;
                        sum = sum % 25;
                        dimes = sum/10;
                        sum = sum % 10;
                        nickels = sum/5;
                        sum = sum % 5;
                        pennies = sum;
            
                        System.out.println(quarters + " quarter(s)");
                        System.out.println(dimes + " dime(s)");
                        System.out.println(nickels + " nickel(s) and");
                        System.out.println(pennies + " pennies");
                        System.out.println("Thank you!!");
                       
                
                
            
            
        }
    
}        
    
    
        
    
            
    
        
        
        
        
        
        
        
        
        

    






