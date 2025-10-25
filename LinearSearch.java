package Array;
import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number which you want to search:");
            int no = sc.nextInt();
            int array[] = {20,19,36,84,10,34};
            LinearSearch obj = new LinearSearch();
            boolean retV = obj.Search(array, no);
            if(retV == true){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }

    public boolean Search(int array[], int no){
        for(int i=0; i<array.length; i++){
            if(no == array[i]){
              return true;  
            }
        }
        return false;
    }
}
