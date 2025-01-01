import java.util.Scanner;

public class ArrayAcceptNo {
    public static void main(String[] arg){
        ArrayAcceptNo a = new ArrayAcceptNo();
        int[] arr = a.ArrAcceptNo();

        System.out.println("The elements of array: ");
        for(int num : arr){
            System.out.println(num);
        }

    }

    public int[] ArrAcceptNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int iSize = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] iArr = new int[iSize];

        for(int i=0; i<iSize; i++){
            iArr[i] = sc.nextInt();
        }
        return iArr;
    }
}

