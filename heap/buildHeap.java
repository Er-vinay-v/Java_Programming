package heap;

public class buildHeap {
    public static void buildHeap(int[]arr,int n){
        int startidx=n/2-1;
        for (int i=startidx;i>=0;i--){
            heapfy(arr,n,i);
        }
    }
    public static void heapfy(int[]arr,int n,int i){
        int largest=i;
        int leftIdx=2*i+1;
        int rightIdx=2*i+2;
        if (leftIdx<n && arr[leftIdx]>arr[largest]){
            largest=leftIdx;
        }
        if (rightIdx<n && arr[rightIdx]>arr[largest]){
            largest=rightIdx;
        }
        if (largest!=i){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapfy(arr,n,largest);
        }
    }
    public static void displayHeap(int[]arr,int n){
        System.out.println("Array representation of maxheap");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,6,13,10,9,8,15,17};
        int n=arr.length;

        buildHeap(arr,n);
        displayHeap(arr,n);
    }

}
