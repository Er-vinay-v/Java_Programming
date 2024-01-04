package Recursion_of_Array;

public class print_max_elements {
    static int max_Element(int[]arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
         int small_ans=max_Element(arr,idx+1);
        return Math.max(arr[idx],small_ans);
    }

    public static void main(String[] args) {
        int []arr={3,4,5,69,24,500,56};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       int ans= max_Element(arr,0);
        System.out.println("max value of the array elements is "+ans);
    }
}
