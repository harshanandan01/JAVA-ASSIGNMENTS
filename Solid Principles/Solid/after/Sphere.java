package Solid.after;

public class Sphere implements InterfaceCircumference, InterfaceVolume {
    int r;
    Sphere(int r){
        this.r=r;
    }

    @Override
    public void printVolume(Shapes s, int r) {
        System.out.println(4/3*22/7*r*r*r);

    }

    @Override
    public void printCircumference() {
        System.out.println(6.28*r);

    }

}
