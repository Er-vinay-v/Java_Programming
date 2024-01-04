package BasicsOfJava;

import java.util.ArrayList;

public class create_string_array {
    public static void main(String[] args) {
        String []s={"h","k","l","l","o"};
        int j=s.length-1;
        for (int i=0;i<j;i++){
            String temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;

        }
        ArrayList<String>str=new ArrayList<>();
        for(String val:s){
           str.add(val);
        }
        System.out.println(str);
    }
}
