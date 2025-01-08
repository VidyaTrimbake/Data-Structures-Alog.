public class CreateDLL {
    public  static void main(String[] arg){
        DNode first, middle, last;
        first = new DNode();
        middle = new DNode();
        last = new DNode();

        first.data = 10;
        middle.data = 20;
        last.data = 30;


        first.prev = null;
        first.next = middle;

        middle.prev = first;
        middle.next = last;

        last.prev = middle;
        last.next = null;


        System.out.println("Forward moving:");
        DNode temp = first;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class DNode{
    DNode prev;
    int data;
    DNode next;
}
