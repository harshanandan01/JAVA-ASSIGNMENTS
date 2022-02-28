package Assign8;
/*Error Handling
Create three new types of exceptions. Write a class with a method that throws all three. 
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. 
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.*/

public class New {
    public static void exception(String arg){
        int a= 5;
        int b = 2;
        
        try{
            if(arg.equals("Husain")){
                throw new NameException("Name is Husain");
            }
            System.out.println("Hello "+arg);
            
            if(b==1){throw new DivideByOne();}
            System.out.println(a/b);

        }
        catch(NameException e){
            System.out.println(e.getMessage());
        }
        catch(DivideByOne e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        finally{
            System.out.println("This will execute no matter what");
        }
    }
    public static void main(String[] args){
        exception(null);
    }
}
