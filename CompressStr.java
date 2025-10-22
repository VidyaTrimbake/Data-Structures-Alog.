package Java.String;

public class CompressStr {
    public static void main(String[] args) {
        String str = "aaabjjjjj";
        int cnt = 1;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                cnt++;
                i++;
            }
            sb.append(str.charAt(i));
            if(cnt>1){
                sb.append(cnt);
            }
            cnt = 1;
        }
        System.out.println(sb);
    }
}
