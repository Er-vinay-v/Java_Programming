package Collection_Frame_Work;

import java.util.*;

public class hashMap {
    static void HashMap(){
        //syntax
        Map<String,Integer>hp=new HashMap<>();
        //Adding elements
        hp.put("virat",5);
        hp.put("shubhman",12);
        hp.put("Rohit",10);
        hp.put("Kl_Rahul",9);
        //printing elements
        System.out.println(hp);
        //Getting value of a key from the Hashmap
        System.out.println(hp.get("Rohit"));
        System.out.println(hp.get("soni"));
        //changing value of a key in the Hashset
        hp.put("virat",19);
        System.out.println(hp);
        //Removing a pair from hashMap
        hp.remove("Rohit");
        System.out.println(hp.remove(10));
        System.out.println(hp);
        //checking if a key is in the Hashmap
        System.out.println(hp.containsKey("soni"));
        System.out.println(hp.containsKey("virat"));
        //Adding a new entry only if the new key doesn't exist already
        hp.putIfAbsent("virat",30);
        System.out.println(hp);
        //get all keys in the Hashmap
        System.out.println(hp.keySet());
        //get all values in the hash set
        System.out.println(hp.values());
        //get all entries in the hash map
        System.out.println(hp.entrySet());
        //Traversing all  entries of Hashmap-multiples method
        for (String val:hp.keySet()){
            System.out.printf("Rating of %s is %d\n",val,hp.get(val));
        }
        System.out.println();
        for (var e:hp.keySet()){
            System.out.printf("Rating of %s is %d\n",e,hp.get(e));
        }
    }
    public static void main(String[] args) {
        HashMap();
    }
}
