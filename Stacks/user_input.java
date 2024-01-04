package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the elements");
        while(n!=0){
            int x=sc.nextInt();
            st.push(x);
            n--;
        }
        System.out.println(st);

    }
}
