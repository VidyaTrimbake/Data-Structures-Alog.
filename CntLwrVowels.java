package Java.String;

import java.util.Scanner;

public class CntLwrVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        CntLwrVowels obj = new CntLwrVowels();
        int cnt = obj.Count(str);
        System.out.println("Lower case vowels are: "+cnt);
    }

    public int Count(String str){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u' ){
                cnt++;
            }
        }
        return cnt;
    }
}
