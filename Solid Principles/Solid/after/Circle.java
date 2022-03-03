package Solid.after;

public class Circle extends Shapes implements PrintArea, InterfaceCircum{
    public int r=0;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public void printArea(Shapes s, int r) {
        System.out.println((22/7)*(r*r));

    }

    @Override
    public void printCircum() {
        System.out.println(2*(22/7)*r);

    }



}
