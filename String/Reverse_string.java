package String;

public class Reverse_string {
    public static void main(String[] args) {
        String s="I AM A STUDENT";
        System.out.println(s);
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb.delete(0,sb.length());
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
