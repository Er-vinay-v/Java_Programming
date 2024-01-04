package Wrapper_Method;

import java.util.ArrayList;

public class Array_List_class {
    public static void main(String[] args) {
        //Wrapper classes
        ArrayList<Integer>l=new ArrayList<>();

        //Add new elements into the back
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);

        //print an elements at index i using 'get' method
        System.out.println(l.get(3));

        //print with for loop
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();

        //Print array list directly  no need any types loop directly pass array list name i.e l;
        System.out.println(l);  //[5,6,7,8]

        //Adding elements at some index i
        l.add(3,80);
        System.out.println(l);

        //Modifying elements at index i
        l.set(0,50);
        System.out.println(l);

        //Removing an element at index i
        l.remove(3);
        System.out.println(l);

        //Removing an element e (in this case there are no given which index elements remove only given elements)
        l.remove(Integer.valueOf(50));
        System.out.println(l);

        //Checking if an element exists
        boolean ans=l.contains(Integer.valueOf(7));
        System.out.println(ans);

        //if you don't specify class,you can put anything inside array list l
        ArrayList l1=new ArrayList<>();
        l1.add("vinay");
        l1.add(500);
        l1.add(true);
        l1.add(56.34);
        System.out.println(l1);

        l1.add(2,'V');
        System.out.println(l1);

    }
}
