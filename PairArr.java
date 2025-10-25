package Array;
public class PairArr {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        PairArr obj = new PairArr();
        obj.Paired(array);
    }

    public void Paired(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
