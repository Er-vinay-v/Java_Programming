package Stack_question_practice;

import java.util.Stack;

public class Prefix_to_postfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String>val=new Stack<>();
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(""+ch);
            }else {
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                if (ch=='+')val.push(v1+v2+op);
                if (ch=='-')val.push(v1+v2+op);
                if (ch=='*')val.push(v1+v2+op);
                if (ch=='/')val.push(v1+v2+op);
            }
        }
        System.out.println(val.peek());
    }
}
