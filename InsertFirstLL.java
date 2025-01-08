public class InsertFirstLL {
    public static void main(String[] arg){
        Node1 head = null;
        int value = 10;

        Node1 newNode = new Node1();
        newNode.data = value;
        newNode.next = head;
        head = newNode;


        System.out.println("Elements in the Linked-List:");
        Node1 temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Node1{
    int data;
    Node1 next;
}
