package Recursion_of_Array;

public class PrintSSQ {
    static void PrintSSQ(String s,String currAns){
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        PrintSSQ(remString,currAns+curr);
        PrintSSQ(remString,currAns);
    }
    public static void main(String[] args) {
        PrintSSQ("ABC","");
    }
}
