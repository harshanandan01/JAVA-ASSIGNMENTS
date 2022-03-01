package Assign11;

import java.io.*;
import java.util.*;

public class CountChar {
    public static void countCharinFile(String fileName, HashMap<Character, Integer> mp) throws FileNotFoundException{
        String line;
        File file = new File(fileName);
        Scanner name = new Scanner(file);
        while(name.hasNext()){
            line = name.nextLine();
            String[] words = line.split(" ");
            for(int i=0; i<words.length; i++){
                String temp = words[i];
                for(int j=0; j<temp.length(); j++){
                    char c = temp.charAt(j);
                    int count = mp.getOrDefault(c, 0);
                    mp.put(c, count+1);
                }
            }
        }
        name.close();
    }
}
