

class Node{
    int data;
    Node next;
}
public class CreateLL {
    public static void main(String[] agr){
        Node head,middle,last;

        head = new Node();
        middle = new Node();
        last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        middle.next = last;
        last.next = null;

        System.out.println("Elements in the Linked-List:");
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


