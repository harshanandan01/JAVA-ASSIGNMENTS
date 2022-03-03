package Solid.after;

public class DependencyInversion {
    public DrawShape d;

    public void draw(){
        d.drawShape();
    }
}
