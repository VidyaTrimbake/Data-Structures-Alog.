package Java;

import java.util.Scanner;

public class ArraysCC2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArraysCC2 ar = new ArraysCC2();
        ar.insert(size);
    }

    public void insert(int size){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
}

