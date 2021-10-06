//Dontese Cocchio
//Math 201-01
//Project 2
//April 5, 2021

import java.util.*;

//prints all permuations of a string in lexicographic order
public class permutation
{
   public static void main(String[] args)
   {   
   Scanner scan = new Scanner(System.in);
   
   //asks the user for the string and stores it
   System.out.println("Enter a string of integers");
   String str = scan.next();
   int n = str.length();
   
  
   //Runs the permuation function with the given string
   permutation permutation = new permutation();
   permutation.permute(str, 0, n-1);
   }

   /*
    permutation function
    @param str calculates permutations
    1 = starting index  
    r = end index
   */
   private void permute(String str, int l, int r)
   {
      if (l == r)
         System.out.println(str);
      else
      {
         for (int i = l; i <= r; i++)
         {
            str = swap(str,l,i);
            permute(str, l+1, r);
            str = swap(str,l,i);
         }
      }
   }

   /*
    swaps Char positions
    a = string value
    i = position 1
    j = position 2
    return the swapped string
   */
   public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}