package Array;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
         while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number which you warrnt to search:");
            int key = sc.nextInt();
            int array[] = {20,19,36,84,10,34};
            Arrays.sort(array);
            BinarySearch obj = new BinarySearch();
            boolean retV = obj.Search(array, key);
            if(retV == true){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }

    public boolean Search(int arr[], int key){
        int end = arr.length-1;
        int start = 0;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(key == arr[mid]){
                return true;
            }
            else if(arr[mid] < key){
                //start=0;
                start=mid+1;
            }
            else{
                end = mid-1;
                //end = arr.length;
            }
        }

        return false;
    }
}
