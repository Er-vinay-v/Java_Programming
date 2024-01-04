package String;

public class count_substring_in_a_string {
    static boolean ispalindrome(String s){
       int i=0,j=s.length()-1;
       while(i<=j){
           if (s.charAt(i)!=s.charAt(j))return false;
           i++;
           j--;
       }
       return true;
    }
    static int count_string(String s){
        int count=0;

        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                if (ispalindrome(s.substring(i,j))==true){
                    System.out.print(s.substring(i,j)+" ");
                    count++;

                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="abcba";
       int ans= count_string(s);
        System.out.println();
        System.out.println("The no. of palindromic substring is : "+ans);
    }
}
