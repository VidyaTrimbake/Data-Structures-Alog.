

//***********Maximum number in array**************


import java.util.Scanner;

class Array1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int iSize = sc.nextInt();

        Numbers nObj = new Numbers(iSize);
        nObj.Accept();
        nObj.Display();
        nObj.MaxNumber();

    }
}

class Numbers
{
    public int Arr[];

    public Numbers(int iSize){
        Arr = new int[iSize];
    }

    public void Accept(){
        System.out.println("Enter the elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
    }

    void Display(){
        System.out.println("The elements in Arr are: ");
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }
    }

    void MaxNumber(){
        System.out.println("The maximum element in Arr is: ");
        int Max = Arr[0];
        for(int i=1; i<Arr.length; i++){
            if(Arr[i] > Max){
                Max = Arr[i];
            }
        }
        System.out.println(Max);
    }
}