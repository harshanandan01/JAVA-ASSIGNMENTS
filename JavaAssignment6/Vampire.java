import java.lang.*;
import java.io.*;
import java.util.*;
public class Vampire{
    public static void main(String args[]) {
     int count = 100;
     int c = 0;
     int i = 10;
     while(count>c)
     {
        //  System.out.println(i);
         String s=String.valueOf(i);
         int len = s.length();
         if(len%2==0)
         {
            int k = (int)Math.pow(10,len/2);
            int a = i/k;
            int reverse=0;
            while(a != 0)   
            {  
                int remainder = a % 10;  
                reverse = reverse * 10 + remainder;  
                a = a/10;  
            }  
            a= reverse;
            int b = i%k;
            if(a*b == i)
            {
                System.out.println(i);
                c++;
            }
         }
         i++;
     }
    }
}