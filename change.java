//Dontese Cocchio
//Math 201-01
//Project 2
//March 15, 2021

import java.util.*;
//Computes amount of change in quarters, dimes, nickles, and pennies
public class change
{
   public static void main(String[] args)
   {
   
   //variables for starting amount, amount after each reduction of change, and coin types
   int startAmount, amount, q, d, n, p;
   
   Scanner scan = new Scanner(System.in);
   //asks the user to input amount of change needed
   System.out.println("How many cents do you need to make change for? ");
   amount = scan.nextInt();
   
      //checks if there is change to make
      if (amount == 0) {
         System.out.println("There is no change.");
         return;
      }
   //calculates how many of a coin type can be used before reducing to a lesser coin
   startAmount = amount;
   q = amount / 25;
   amount = amount % 25;
   d = amount / 10;
   amount = amount % 10;
   n = amount / 5;
   amount = amount % 5;
   p = amount / 1;
   
   System.out.println(startAmount + " cents can be given as: ");
   
   //Prints the numbers of quarters
   if(q == 1){
      System.out.println(q + " quarter");
   }else if(q != 0){
      System.out.println(q + " quarters");
   } 
   
   //Prints the number of dimes
   if(d == 1){
      System.out.println(d + " dime");
   }else if(d != 0){
      System.out.println(d + " dimes");
   }
   
   //Prints the number of nickles
   if(n == 1){
      System.out.println(n + " nickle");
   }else if(n != 0){
      System.out.println(n + " nickles");
   }
   
   //prints the number of pennies
   if(p == 1){
   System.out.print(p + " penny");
   }else if(p != 0){
      System.out.print(p + " pennies");
   }
   }
}