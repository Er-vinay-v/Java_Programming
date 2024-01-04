package All_Sorting_algorithm;

public class Sort_array {
    static void array(int[]arr){
        for (int val:arr) System.out.print(val+" ");

    }
    static void sortArray(int[]arr){
        int n=arr.length;
        if (n<=1)return;
        int x=-1,y=-1;
        for (int i=1;i<n;i++){
            if (arr[i-1]>arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }
                else y=i;
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[]arr={6,2,3,5,1,7,8};
       // int[]arr={6};  //for testing purpose
        System.out.println("unsorted array");
        array(arr);
        System.out.println();
        sortArray(arr);
        System.out.println("sorted array");
        array(arr);
    }
}
