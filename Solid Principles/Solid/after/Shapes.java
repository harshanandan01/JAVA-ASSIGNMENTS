package SOLID.after;


public class Shapes {
    String shapeName;

    Shapes(){
        this.shapeName = null;
    }
    public Shapes(String sn){
        this.shapeName = sn;
    }

    public void drawShape(){
        System.out.println("Drawing "+shapeName);
    }

}
