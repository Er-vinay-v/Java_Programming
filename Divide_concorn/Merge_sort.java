package Divide_concorn;

public class Merge_sort {
    static void merge(int[]arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++)left[i]=arr[i+l];
        for ( j=0;j<n2;j++)right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if (left[i]<right[j])arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergeSort(int[]arr,int l,int r){
        if(l>=r)return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void display(int[]arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={30,25,5,41,21,15,10,8,1,12};
        int n=arr.length;
        System.out.println("unsorted array :");
        display(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("sorted array :");
        display(arr,n);
    }
}
