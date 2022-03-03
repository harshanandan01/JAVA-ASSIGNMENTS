package Solid.before;

public class Triangle extends Shapes implements InterfaceMeasure{
    public int b;
    public int h;

    public Triangle(int b, int h){
        this.b=b;
        this.h=h;
    }

    @Override
    public void circumference() {
        System.out.println("Sum of all sides");

    }

    //violates interface segregation
    @Override
    public void printVolume() {
        // It doesn't have volume

    }


}
