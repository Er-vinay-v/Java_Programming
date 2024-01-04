package collection_frameWork_problem;

import java.util.HashMap;

public class valid_Anagram {
    static HashMap<Character,Integer>makeFreqMap(String str){
        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!hm.equals(ch)){
                hm.put(ch,1);
            }
            else{
               // int currFreq=hm.get(ch);
                hm.put(ch,hm.get(ch)+1);
            }
        }
        return hm;
    }
    public static boolean is_anagram(String s,String s1){
        if (s.length()!=s1.length())return false;
        HashMap<Character,Integer>hm=makeFreqMap(s);
        HashMap<Character,Integer>hm2=makeFreqMap(s1);
        return hm.equals(hm2);
    }
    public static void main(String[] args) {
        String s="silent";
        String s1="listen";
      boolean b= is_anagram(s,s1);
        System.out.println(b);

    }
}
