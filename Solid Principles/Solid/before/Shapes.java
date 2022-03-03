package Solid.before;


public class Shapes {
    String shapeName;
    int shapeDi;

    Shapes(){
        this.shapeName = null;
        this.shapeDi = 0;
    }
    public Shapes(String sn,int sd ){
        this.shapeName = sn;
        this.shapeDi=sd;
    }

    public void drawShape(){
        System.out.println("Drawing "+shapeName);
    }

    //violating Single Responsibility Principle
    public void printShapeDim()
    {
        System.out.println("The dimensions "+shapeDi);
    }
}
