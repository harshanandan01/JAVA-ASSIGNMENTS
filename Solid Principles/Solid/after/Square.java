package Solid.after;

public class Square extends LiskovSubst implements DrawShape {
    int l;
    int w;

    public void set_len(int l){
        this.l = l;
        this.w = l;
    }
    public void set_wid(int w){
        this.w = w;
        this.l = w;
    }
    public int get_len(){return l;}
    public int get_wid(){return w;}

    @Override
    public void drawShape() {
        System.out.println("Square is Drawing");

    }

}
