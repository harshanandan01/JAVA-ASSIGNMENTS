package Solid.before;

//violation of Open Closed Principle

public class PrintShapeArea {
    public static void printArea(Shapes s, int r)
    {
        if(s instanceof Circle){
            System.out.println((22/7)*(r*r));
        }
        else if(s instanceof Sphere)
        {
            System.out.println(4*(22/7)*(r*r));
        }
        else {
            System.out.println("Wrong Entry");
        }
    }
}
