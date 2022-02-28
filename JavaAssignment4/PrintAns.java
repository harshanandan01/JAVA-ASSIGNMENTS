package Assign4;

import java.util.ArrayList;

public class PrintAns {
    public static void printAns(ArrayList<String> input){
        ArrayList<String> list = new ArrayList<>();
        System.out.println();
        for(String s: input){
            String[] splited = s.split(" ");
            String t[] = splited[1].split("-");

            int year = Integer.parseInt(t[2]);
            String temp1 = ThirtyMinus.thirtyMin(splited[0], year);
            String temp2 = ThirtyPlus.thirtyPlus(splited[0], splited[1], year);
            
            if(temp1.equals(temp2)){list.add("No Range");}
            else{
                String finalAns = temp1+" "+temp2;
                list.add(finalAns);
            }
        }
        for(String s: list){
            System.out.println(s);
        }
    }
}
