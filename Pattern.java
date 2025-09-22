package Java;

class Pattern{
    public static void main(String arg[]){
        int n = 5;
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}