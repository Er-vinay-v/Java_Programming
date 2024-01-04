package Wrapper_Method;
import java.util.Collections;
import java.util.ArrayList;

public class Reverse_array_list {
    static void ReverseList(ArrayList<Integer>arr){
        int i=0,j=arr.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(arr.get(i));
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(4);
        arr.add(12);
        arr.add(5);
        arr.add(1);
        arr.add(45);
        arr.add(7);
        System.out.println("Original array list - arr");
        System.out.println(arr);
        System.out.println("After reverse array elements -arr");
        //ReverseList(arr); //for method
        //System.out.println(arr);
        Collections.reverse(arr); //Using collection inbuilt method for array reversing;
        System.out.println("Reverse arr : "+arr);

        //using collection inbuilt method for sorting arraylist i.e:-
        Collections.sort(arr);
        System.out.println("Ascending order : "+arr);
        //if we want to reverse arraylist in descending order then
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("Descending order :"+arr);
    }
}
