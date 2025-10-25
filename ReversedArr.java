package Array;
public class ReversedArr {
    public static void main(String[] args) {
        
        int array[] = {20,19,36,84,10,34};
        ReversedArr obj = new ReversedArr();
        obj.Reversed(array);
 
    }

    public void Reversed(int arr[]){
        // int copyArr[] = arr;
        System.out.println("Old Array is: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println();
        System.out.println("New Reversed Array is: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
