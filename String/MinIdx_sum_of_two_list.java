package String;

public class MinIdx_sum_of_two_list {
    public static void main(String[] args) {
        String[] l1={"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[]l2={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        int idx=20;
        for (int i=0;i<l1.length;i++){
            for (int j=0;j<l2.length;j++){
                if (l1[i].equals(l2[j]) && (i+j)<=idx ){
                    idx=i+j;
                    System.out.println(l2[i]);
                }
            }
        }
       // System.out.println(l1[idx]);
    }
}
