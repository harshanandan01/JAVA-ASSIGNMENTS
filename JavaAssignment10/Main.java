package Assign10;

public class Main {
    public static void main(String[] args){
        SListIterator<Object> obj = SList.iterator();
        obj.add(20);
        obj.add("20");
        obj.add("30");
        obj.add("40");
        obj.addAtindex(2, 78);
        obj.removeFromindex(2);
        obj.display();
    }
}
