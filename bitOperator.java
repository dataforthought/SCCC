//Dontese Cocchio
//Math 201-01
//Project 1
//March 9, 2021

import java.util.*;
public class bitOperator
{
      
   //computes the AND truth table for the two strings
   public static String bitA(String str1, String str2)
   {
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<str1.length(); i++)
      {
         char ch1 = str1.charAt(i);
         char ch2 = str2.charAt(i);
         int local = (ch1-'0') & (ch2-'0');
         sb.append((char)(local+'0'));
      }
      return sb.toString();
   }
   
   //computes the OR truth table for the two strings
   public static String bitO(String str1, String str2)
   {
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<str1.length(); i++)
      {
         char ch1 = str1.charAt(i);
         char ch2 = str2.charAt(i);
         int local = (ch1-'0')|(ch2-'0');
         sb.append((char)(local+'0'));
      }
      return sb.toString();
   }
   
   //computes the XOR truth table for the two strings
   public static String bitX(String str1, String str2)
   {
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<str1.length(); i++)
      {
         char ch1 = str1.charAt(i);
         char ch2 = str2.charAt(i);
         int local = (ch1-'0')^(ch2-'0');
         sb.append((char)(local+'0'));
      }
      return sb.toString();
   }
   public static void main(String[] args)
   {
   //asks the user to input the two strings
   Scanner scan = new Scanner(System.in);
   String str1,str2;
   System.out.println("input bitwise string 1: ");
   str1 = scan.next();
   System.out.println("input bitwise string 2: ");
   str2 = scan.next();
     
   //prints out the three truth values
   System.out.println("The bitwise AND of string 1 and string 2 is "+ bitA(str1, str2) + ".");
   System.out.println("The bitwise OR of string 1 and string 2 is "+ bitO(str1, str2) + ".");
   System.out.println("The bitwise XOR of string 1 and string 2 is "+ bitX(str1, str2) + ".");
   }
}