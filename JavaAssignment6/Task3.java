package Assign6;
/*3. Create a class with a constructor that takes a String argument. During construction, print the argument. 
Create an array of object references to this class, but don’t actually create objects to assign into the array. 
When you run the program, notice whether the initialization messages from the constructor calls are printed.
4. Complete the previous exercise by creating objects to attach to the array of references.*/
public class Task3 {
    Task3(String arg){
        System.out.println(arg);
    }
    public static void main(String[] args) {
        Task3 arr[] = new Task3[3];
        // for(int i=0; i<3; i++){
        //     arr[i]=new Task3("argument "+i);
        // }
    }
    //Created array of reference type task3 but nothing is printed when prg is executed.
    //But if we put an object inside array it prints value from contructor.
}
