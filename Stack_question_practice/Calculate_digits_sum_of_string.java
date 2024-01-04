package Stack_question_practice;

import java.util.Stack;

public class Calculate_digits_sum_of_string {
    public static void main(String[] args) {
        String s="11111222223";
        int k=3;
        int x=0;
        String ans="";
        Stack<String>st=new Stack<>();
        Stack<Integer>val=new Stack<>();
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            val.push(ascii-48);
            //st.push(""+ch);
        }
        System.out.println(val);
       while(val.size()!=0){

           if (k!=0){
               st.push(""+val.pop());
               k--;
           }
       }
        System.out.println(st);
        System.out.println(x);
    }
}
