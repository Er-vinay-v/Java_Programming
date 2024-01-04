package Recursion_of_Array;

public class KeyPaid {
    static void keyPaid(String dig,String[]kp,String res){
        if (dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0'; //2
        String currChoices=kp[currNum]; //"abc"
        for (int i=0;i<currChoices.length();i++){
            keyPaid(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String dig="23";
        //kp[7]="pqrs"
        String[]kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        keyPaid(dig,kp,"");
    }
}
