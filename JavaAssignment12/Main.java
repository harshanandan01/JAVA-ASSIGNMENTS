package Assign12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Data.createData(students);

        //Task1
        Tasks.printDept(students);

        //Task2
        Tasks.getNames(students);

        //Task3
        List<Student> maleStudentCompSci = Tasks.maleCompSci(students);
        System.out.println(maleStudentCompSci);

        //Task4
        Map<String, Long> result = Tasks.noOfMaleandFemale(students);
        System.out.println(result);

        //Task5
        int []avgAge = new int[2];
        Tasks.avgAge(students, avgAge);
        System.out.println("Average Males Age is: "+avgAge[0]);
        System.out.println("Average Females Age is: "+avgAge[1]);
        
        //Task6
        Student student_with_highest_per = Tasks.highestPerc(students);
        System.out.println(student_with_highest_per.name);

        //Task7
        Map<String, Long> result2 = Tasks.noOfStudentinDept(students);
        System.out.println(result2);

        //Task8
        HashMap<String, Double> avgOfDept = Tasks.avgPerinEachDept(students);
        System.out.println(avgOfDept);

        //Task9
        Student ans = Tasks.youngestStudentElectronic(students);
        System.out.println(ans.name);

        //Task10
        Long []maleandfemaleCompSci = Tasks.maleAndFemaleCompSci(students);
        System.out.println("Male students in CompSci: "+maleandfemaleCompSci[0]);
        System.out.println("Female students in CompSci: "+maleandfemaleCompSci[1]);
    }
    
}
