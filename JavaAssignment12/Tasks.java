package Assign12;

import java.util.*;
import java.util.stream.Collectors;

public class Tasks {
    static int mcount=0; static int fcount=0;
    static double highest_perc = 0;
    static Student res=null;
    //Task1
    public static void printDept(List<Student> student){
        List<String> dept = new ArrayList<>();
        student.stream().forEach(e->{
            if(!dept.contains(e.engDepartment)){
                dept.add(e.engDepartment); 
                System.out.println(e.engDepartment);}
        });
    }

    //Task2
    public static void getNames(List<Student> student){
        List<Student> streamList = student.stream().filter(e->(e.year_of_enrollment > 2018)).collect(Collectors.toList());
        streamList.stream().forEach(e->System.out.println(e.name));
    }

    //Task3
    public static List<Student> maleCompSci(List<Student> student){
        List<Student> streamList = student.stream()
        .filter(e->(e.gender.equals("Male")) && e.engDepartment.equals("Computer Science"))
        .collect(Collectors.toList());

        return streamList;
    }
    
    //Task4
    public static Map<String, Long> noOfMaleandFemale(List<Student> student) {
        Map<String, Long> result = student.stream().collect(Collectors.groupingBy(e->(String)e.gender, Collectors.counting()));
        return result;
    }

    //Task5
    public static void avgAge(List<Student> student, int []avgAge){
        
        student.stream().forEach(e->{
            if(e.gender.equals("Male")){
                avgAge[0]+=e.age; 
                mcount++;
            }
            else{avgAge[1]+=e.age; fcount++;}
        });
        avgAge[0]=avgAge[0]/mcount;
        avgAge[1]=avgAge[1]/fcount;
        mcount=fcount=0;
    }

    //Task6
    public static Student highestPerc(List<Student> student){
        res=null;
        student.stream().forEach(e->{
            if(e.perTillDate>highest_perc){res = e; highest_perc=e.perTillDate;}
        });
        return res;
    }

    //Task7
    public static Map<String, Long> noOfStudentinDept(List<Student> student) {
        Map<String, Long> result = student.stream().collect(Collectors.groupingBy(e->(String)e.engDepartment, Collectors.counting()));
        return result;
    }

    //Task8
    public static HashMap<String, Double> avgPerinEachDept(List<Student> student){
        HashMap<String, Double> avg = new HashMap<>();
        HashMap<String, Double> countOfDept = new HashMap<>();

        student.stream().forEach(e->{
            String dept = e.engDepartment;
            //update percentage sum for each dept.
            Double perc = avg.getOrDefault(dept, 0.0);
            perc+=e.perTillDate;
            avg.put(dept, perc);
            //update count of each dept.
            Double count = countOfDept.getOrDefault(dept, 0.0);
            count++;
            countOfDept.put(dept, count);
        });
        Iterator<HashMap.Entry<String, Double>> itr = avg.entrySet().iterator();
        HashMap<String, Double> avgOfDept = new HashMap<>();

        while(itr.hasNext())
        {
            HashMap.Entry<String, Double> entry = itr.next();
            String dept = entry.getKey();
            Double perc = entry.getValue();
            Double cnt = countOfDept.get(dept);
            Double avgPerc = perc/cnt;
            avgOfDept.put(dept, avgPerc);
        }
        return avgOfDept;
    }

    //Task9
    public static Student youngestStudentElectronic(List<Student> student){
        Student ans = student.stream().filter(e->(e.engDepartment.equals("Electronic")))
        .collect(Collectors.minBy(Comparator.comparingInt(e->e.age))).get();
        return ans;
    }

    //Task10
    public static Long[] maleAndFemaleCompSci(List<Student> student){
        Long noOfMale = student.stream()
        .filter(e->(e.gender.equals("Male")) && e.engDepartment.equals("Computer Science"))
        .collect(Collectors.counting());

        Long noOfFemale = student.stream()
        .filter(e->(e.gender.equals("Female")) && e.engDepartment.equals("Computer Science"))
        .collect(Collectors.counting());

        Long[] ans = new Long[2];
        ans[0]=noOfMale;
        ans[1]=noOfFemale;
        return ans;
    }

}
