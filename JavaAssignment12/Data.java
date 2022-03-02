package Assign12;
import java.util.List;

public class Data {
    Data(){}

    public static void createData(List<Student> student) {

        Student student1 = new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        Student student2 = new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        Student student3 = new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        Student student4 = new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        Student student5 = new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        Student student6 = new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        Student student7 = new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        Student student8 = new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        Student student9 = new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        Student student10 = new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        Student student11 = new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        Student student12 = new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        Student student13 =  new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        Student student14 = new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        Student student15 = new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        Student student16 = new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        Student student17 = new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);
        student.add(student7);
        student.add(student8);
        student.add(student9);
        student.add(student10);
        student.add(student11);
        student.add(student12);
        student.add(student13);
        student.add(student14);
        student.add(student15);
        student.add(student16);
        student.add(student17);

    }
}
