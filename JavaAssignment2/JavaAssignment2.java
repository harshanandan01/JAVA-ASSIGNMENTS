import java.util.*;
import java.util.Scanner;
public class JavaAssignment2 {
   public static void main(String[] args) {
      String str;
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter your String ");
      str =sc.nextLine();
      str = str.toLowerCase();
      boolean[] alphaList = new boolean[26]; 
      int index = 0,flag = 1;
      for (int i = 0; i < str.length(); i++) {
        if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') 
        {
            index = str.charAt(i) - 'a'; 
         }
         alphaList[index] = true; 
      }
      for (int i = 0; i <= 25; i++)
       {
         if (alphaList[i] == false)
            flag = 0;
      }
      if (flag == 1)

         System.out.println("The string has all alphabets");
      else
         System.out.println("The string doesn't have all alphabets");
   }
}
//Time complexity O(N) , because loop for (int i = 0; i < str.length(); i++) iterates only for str.length times
//Space complexity O(1) , we have only used constant length of boolean array(26)  