package Selection_sort;

public class selectionSort {
    static void S_sort(int[]arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min_idx=i;
            for (int j=i+1;j<n;j++) {
                if (arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }

    }
    public static void main(String[] args) {
        int []arr={4,3,7,2,0,1,6};
        S_sort(arr);
        for (Integer i:arr){
            System.out.print(i +" ");
        }
    }
}

