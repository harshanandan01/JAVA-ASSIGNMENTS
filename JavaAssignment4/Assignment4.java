package Assign4;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no of inputs to be passed: ");
        int n = scn. nextInt();
        scn.nextLine();
        System.out.println("Enter Signup Date and Current Date in the format given");
        System.out.println("dd-mm-yyyy dd-mm-yyyy");
        ArrayList<String> input = new ArrayList<>();
        while(n-- >0){
            String temp = scn.nextLine();
            input.add(temp);
        }
        PrintAns.printAns(input);
    }
}
// Test cases
// 16-07-1998 27-06-2017
// 04-02-2016 04-04-2017
// 04-05-2017 04-04-2017
// 04-04-2015 04-04-2016
// 04-04-2015 15-03-2016