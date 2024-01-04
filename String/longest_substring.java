package String;

public class longest_substring {
    public static void main(String[] args) {
        String s="abcadb";
        String str="";
        int long_substring_leng=0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
//                System.out.print(s.substring(i,j)+" ");
                str+=s.substring(i,j)+" ";
            }
        }
        System.out.println(str);

    }
}
