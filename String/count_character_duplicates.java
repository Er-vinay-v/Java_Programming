package String;

public class count_character_duplicates {
    public static void main(String[] args) {
        String s="aaaabbbbccccdddaaajk";
        String ans=""+s.charAt(0);
        int count=1;
        for (int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char pre=s.charAt(i-1);
            if (curr==pre){
                count++;
            }
            else{
               if(count>1) ans+=count;
                count=1;
                ans+=curr;
            }
        }
       if(count>1) ans+=count;
       System.out.println(ans);
    }
}
