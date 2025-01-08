
public class CreateDLLback {
    public  static void main(String[] arg){
        DNOde1 first, middle, last;
        first = new DNOde1();
        middle = new DNOde1();
        last = new DNOde1();

        first.data = 10;
        middle.data = 20;
        last.data = 30;

        first.prev = null;
        first.next = middle;

        middle.prev = first;
        middle.next = last;

        last.prev = middle;
        last.next = null;


        System.out.println("Backward moving:");
        DNOde1 temp = last;
        temp = last;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

class DNOde1{
    DNOde1 prev;
    int data;
    DNOde1 next;
}

