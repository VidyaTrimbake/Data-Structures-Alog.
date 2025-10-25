package Array;
public class MaxSumSubArr {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        MaxSumSubArr obj = new MaxSumSubArr();
        obj.subArr(arr);

    }

    public void subArr(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    
                }
                
                System.out.println();
            }
            sum = sum + arr[i];
            System.out.print(sum);
            System.out.println();
        }
        //System.out.println();
    }
}
