
//**************Reverse number in array******************

import java.util.Scanner;

class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int iSize = sc.nextInt();

        Numbers nObj = new Numbers(iSize);
        nObj.Accept();
        nObj.Display();
        nObj.ReverseArr();

    }
}

/**
 *  
 */
class Numbers  {
    int Arr[];
    public Numbers(int iSize){
        Arr = new int[iSize];
    }

    void Accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        for(int i=0;i<Arr.length;i++){
            Arr[i] = sc.nextInt();
        }
    }
    
    void Display(){
        System.out.println("Elements in the array are:");
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }

    void ReverseArr(){
        System.out.println("Elements in the array in reverse form are:");

        for(int i=Arr.length-1;i>=0;i--){
            System.out.println(Arr[i]);
        }
    }
}
