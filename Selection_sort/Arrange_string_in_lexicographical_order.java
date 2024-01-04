package Selection_sort;

public class Arrange_string_in_lexicographical_order {
    static void selectionSort(String[]s){
        int n=s.length;
       for (int i=0;i<n-1;i++){
           int min_idx=i;
           for (int j=i+1;j<n;j++){
               if (s[j].compareTo(s[min_idx])<0){
                   min_idx=j;
               }

           }
           String temp=s[i];
           s[i]=s[min_idx];
           s[min_idx]=temp;
       }
    }
    public static void main(String[] args) {
        String[]s={"mango","banana","apple","aeroplane","litchi","kiwi","pineapple","papaya"};
        selectionSort(s);
        for (String i:s){
            System.out.print(i+" ");
        }
    }
}
