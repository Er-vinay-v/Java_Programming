package Stack_question_practice;

import java.util.Scanner;
import java.util.Stack;

public class Return_balanced_brackets_string {
    static boolean isBalance(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch =='[') {
                st.push(ch);
            }
            else if(st.empty()){
                return false;
            }
            else{
                if(st.peek()=='(' && ch==')'||st.peek()=='{' && ch=='}'|| st.peek()=='['&& ch==']'){
                    st.pop();
                }
            }
        }
        if (st.size()==0)return true;
       return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string only brackets");
        String str=sc.nextLine();
        System.out.println(isBalance(str));
    }
}
