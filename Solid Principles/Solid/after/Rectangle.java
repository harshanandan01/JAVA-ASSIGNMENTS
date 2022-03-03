package Solid.after;

public class Rectangle extends LiskovSubst {
    private int len;
    private int wid;

    public void set_len(int l){
        this.len = l;
    }
    public void set_wid(int w){
        this.wid = w;
    }
    int get_len(){return len;}
    int get_wid(){return wid;}

}
