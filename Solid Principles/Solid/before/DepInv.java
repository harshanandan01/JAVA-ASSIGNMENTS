package Solid.before;

//high level module directly depends on low level module
//violates dependency inv principle

public class DepInv {
    public Circle c;
    DepInv(Circle c){
        this.c =c;
    }

    public void draw(){
        c.draw();
    }
}
