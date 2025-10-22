package Java.String;

import java.util.Scanner;

public class AnagramStr {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        AnagramStr obj = new AnagramStr();
        boolean ret = obj.CheckAnagrams(str1,str2);

        if(ret==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public boolean CheckAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i=0; i<s1.length();i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
