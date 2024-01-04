package Recursion;

public class Print_array_elements {
    static void print_array(int[]arr,int index){
        if (index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        print_array(arr,index+1);
       // System.out.print(arr[index]+" ");
    }
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,12};
        //System.out.println(index);
        print_array(arr,0);

    }
}
