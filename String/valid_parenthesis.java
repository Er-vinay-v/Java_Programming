package String;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    static boolean isValid(ArrayList<Character>lst,int n){ //Not complete this program
        Stack<Character>st=new Stack<>();
        for (int i=1;i<n;i++){
            if (lst.get(i)=='(' || lst.get(i)=='{' ||lst.get(i)=='[') {
                st.push(lst.remove(i));
            }
            else if(st.empty())return false;
            else{
                if(st.peek()=='('&& lst.get(i)==')'){
                    st.pop();
                }
                if(st.peek()=='{'&& lst.get(i)=='}'){
                    st.pop();
                }
                if(st.peek()=='['&& lst.get(i)==']'){
                    st.pop();
                }

            }
        }
        if (st.size()==0)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        ArrayList<Character>ch=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            ch.add(str.charAt(i));
        }
        System.out.println(ch);
        int n=ch.size();
        boolean b=isValid(ch,n);
        System.out.println(b);
    }
}
