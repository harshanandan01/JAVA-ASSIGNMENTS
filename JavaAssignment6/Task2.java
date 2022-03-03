package Assign6;
// Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
public class Task2 {
    Task2(){
        //this keyword is used to call some other constructor of same class.
        this("Random");
    }
    Task2(String name){
        System.out.println("Overloaded Constructor. Hello "+name);
    }
    public static void main(String[] args){
        Task2 obj = new Task2();
    }
}
