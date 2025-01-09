public class CreateCircularSLL {
    public static void main(String[] arg){
        CSNode first, middle, last,head;
        first = new CSNode();
        middle = new CSNode();
        last = new CSNode();

        first.data = 10;
        middle.data = 20;
        last.data = 30;

        first.next = middle;
        middle.next = last;
        last.next = first;

        System.out.println("Singly Circular Linked List --->");
        System.out.println("Elements are: ");

        if(first.next==null){
            return;
        }
        else{
            CSNode temp = first;
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }while (temp != first);

        }
    }
}

class CSNode{
    int data;
    CSNode next;
}
