package Array;
class Array1{
    public static void main(String a[]){
        int marks[] = {10,20,30,40};
        Array1 array = new Array1();
        array.Update(marks);
    }

    public void Update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] ;
        }

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}