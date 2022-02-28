package Assign10;

public class SListIterator<T>{
    SList<T> head;
    SList<T> tail;

    public void add(T data){
        SList<T> node = new SList<>();
        node.data = data;
        node.next = null;

        if(head==null){
            head=tail=node;
        }else{
            tail.next=node;
            tail=tail.next;
        }
    }
    public void addAtindex(int index, T data){
        SList<T> node = new SList<>();
        node.data = data;
        node.next = null;
        
        if(index==0){
            node.next=head;
            head=node;
            if(tail==null){tail=node;}
        }
        else{
            int idx=0;
            SList<T> curr = head;
            while(idx!=index-1){
                curr=curr.next;
                idx++;
            }
            node.next=curr.next;
            curr.next=node;
        }
    }

    public void remove(T dataVal){
        if(head==null){
            return;
        }
        SList<T> curr =head;
        while(curr.next.data!=dataVal && curr.next!=null){
            curr=curr.next;
        }
        if(curr.next==null){return;}
        curr.next=curr.next.next;
    }
    public void removeFromindex(int index){
        if(index==0 && head!=null){
            head=head.next;
        }
        else{
            int idx=0;
            SList<T> curr = head;
            while(idx!=index-1 && curr.next!=null){
                curr=curr.next;
                idx++;
            }
            if(curr.next==null){return;}
            curr.next=curr.next.next;
        }
    }

    public void display(){
        SList<T> curr = head;

        while(curr!=null){
            System.out.print(curr.data+"\t");
            curr=curr.next;
        }
    }
    
} 
