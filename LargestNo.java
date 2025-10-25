package Array;
public class LargestNo {
    public static void main(String[] args) {
        int array[] = {30,810,83,10,100,45};
        LargestNo obj = new LargestNo();
        int large = obj.LargeNum(array);
        System.out.println("Large numbaer is: "+large);
    }

    public int LargeNum(int array[]){
        int temp = array[0];
        for(int i=1; i<array.length; i++){
            if(temp < array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
}
