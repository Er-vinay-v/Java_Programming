package All_Sorting_algorithm;

public class QuickSort {
    static void printArray(int []arr){
        for (int val:arr) System.out.print(val+" ");
    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[]arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for (int i=st+1;i<=end;i++){
            if (arr[i]<=pivot)count++;
        }
        int pivotIdx=st+count;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;
            if (i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quick_Sort(int[]arr,int st,int end){
      if (st>=end)return;
      int pi=partition(arr,st,end);
      quick_Sort(arr,st,pi-1);
      quick_Sort(arr,pi+1,end);

    }
    public static void main(String[] args) {
        int[]arr={5,2,8,6,3,7,4,1};
        System.out.println("unsorted array");
        printArray(arr);
        System.out.println();
        quick_Sort(arr,0,arr.length-1);
        System.out.println("sorted array");
        printArray(arr);
    }
}
