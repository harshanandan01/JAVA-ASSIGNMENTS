package Assign11;
/*Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a command line argument and 
counts the occurrence of all the different characters. Save the results in a text file.*/
import java.io.*;
import java.util.*;

public class IO {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scn = new Scanner(System.in);
        PrintWriter pw;
        HashMap<Character, Integer> mp = new HashMap<>();
        String fileName = scn.next();

        pw = new PrintWriter("output.txt");
        CountChar.countCharinFile(fileName, mp);
        for (Map.Entry<Character,Integer> alphabets : mp.entrySet()){
            pw.println("Key = " + alphabets.getKey() +", Value = " + alphabets.getValue());
        }
        pw.close();
        
    }
}
