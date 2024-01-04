package String;

public class add2binaryString {
    public static void main(String[] args) {
        String l1 = "10010";
        String l2 = "11001";
        String ans="";
        for (int i=0;i<l1.length();i++){
            ans =l1+l2;
        }
        System.out.println(ans);



    }
}