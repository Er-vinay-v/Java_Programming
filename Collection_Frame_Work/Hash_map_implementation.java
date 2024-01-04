package Collection_Frame_Work;

import java.util.LinkedList;

public class Hash_map_implementation {
    static class MyHashMap<k,v>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            k key;
            v value;
            Node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//the no. of entries in map
        private LinkedList<Node>[]buckets;
        private void initBuckets(int N){  //N- capacity /size of buckets array
            buckets=new LinkedList[N];
            for (int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunction(k key){
            int hc=key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        //traverse the ll and looks for a node with key,if found it returns it's index otherwise it returns null
        private int searchInBucket(LinkedList<Node>ll,k key){
            for (int i=0;i<ll.size();i++){
                if (ll.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){  //return the no. of entries in map
            return n;
        }
        private void rehash(){
            LinkedList<Node>[]oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for (var bucket:oldBuckets){
                for (var node:bucket) {
                    put(node.key, node.value);
                }
            }
        }
        public void put(k key,v value){   //insert/update
            int bi=HashFunction(key);
            LinkedList<Node>currBucket=buckets[bi];
           int ei=searchInBucket(currBucket,key);
           if (ei==-1){//key doesn't ,we have to insert a new node
               Node node =new Node(key,value);
               currBucket.add(node);
               n++;
           }else{//update
               Node currNode=currBucket.get(ei);
               currNode.value=value;
           }
           if (n>=buckets.length*DEFAULT_LOAD_FACTOR){
               rehash();
           }
        }
        public v get(k key){
            int bi=HashFunction(key);
            LinkedList<Node>currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if (ei!=-1){  //key exists
                Node currNode=currBucket.get(ei);
                return currNode.value;
            }
            //key doesn't exist
            return null;
        }

        public v remove(k key){
            int bi=HashFunction(key);
            LinkedList<Node>currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if (ei!=-1){//key exists
               Node currNode=currBucket.get(ei);
               v val=currNode.value;
               currBucket.remove(ei);
                n--;
               return val;

            }
            //key doesn't exists
                return null;

        }

    }
    public static void main(String[] args) {
       MyHashMap<String,Integer>mp=new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("x",25);
        mp.put("t",56);
        System.out.println("Testing size: "+mp.size());
        mp.put("c",34);
        System.out.println("Testing size: "+mp.size());
        //testing get
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("n"));
        System.out.println(mp.get("x"));
        System.out.println(mp.get("t"));

        //test remove
        System.out.println(mp.remove("c"));//34
        System.out.println(mp.remove("c"));//null
        System.out.println("Testing size "+mp.size());
    }
}
