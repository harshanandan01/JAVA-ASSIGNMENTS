package Solid.before;

public class Circle extends Shapes{
    public int r=0;

    public Circle(int r){
        this.r = r;
    }

    public void draw(){
        System.out.println("Circle is drawing");
    }

}
