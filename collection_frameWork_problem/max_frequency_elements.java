package collection_frameWork_problem;
import java.util.*;
public class max_frequency_elements {
    static void frequencyCount(int[]arr,int n){
        Map<Integer,Integer>hp=new HashMap<>(n);
       for (var e:arr){
           if (!hp.containsKey(e)){
               hp.put(e,1);
           }else{
               hp.put(e,hp.get(e)+1);
           }
       }
        System.out.println("Frequency map");
        System.out.println(hp.entrySet());
        int maxfrq=0,anskey=-1;
        for (var e:hp.entrySet()){
            if (e.getValue()>maxfrq){
                maxfrq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",anskey,maxfrq);
    }
    public static void main(String[] args) {
        int[]arr={1,4,2,5,1,4,4,6,4,4,4,2,1};
        int n=arr.length;
        frequencyCount(arr,n);
    }
}
