class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }

}
class list{
    node head;
    list(){
        this.head = null;
    }
    void add(int data){
        node temp = head ;
        if(head == null){
            head = new node(data);
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new node(data);
        }

    }
}
public class linked {
    public static void main(String[] args) {
        list m = new list();
        m.add(4);
        m.add(5);
        m.add(6);
        while(m.head!=null){
            System.out.println(m.head.data);
            m.head = m.head.next;
        }
    }
}
