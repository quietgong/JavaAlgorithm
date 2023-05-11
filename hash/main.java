package com.example.algorithm.hash;

import java.util.LinkedList;

class HashTable{
    class Node{
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        void value(String value){
            this.value=value;
        }
        String value(){
            return this.value;
        }
    }
    LinkedList<Node>[] data;
    HashTable(int size){
        this.data = new LinkedList[size];
    }
    Node searchKey(LinkedList<Node> list, String key){
        if(list==null)
            return null;
        for(Node node:list){
            if(node.key.equals(key))
                return node;
        }
        return null;
    }
    int hashCode(String key){
        int hashCode=0;
        for(char c : key.toCharArray())
            hashCode+=c;
        return hashCode;
    }
    int convertToIndex(int hashCode){
        return hashCode%data.length;
    }
    String get(String key){
        int hashCode = hashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        if(node==null)
            return "Not Found";
        else{
            return node.value();
        }
    }
    void put(String key, String value){
        // key에 맞는 공간에 value를 저장
        int hashCode = hashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        if(list==null) {
            list = new LinkedList<>();
            data[index]=list;
        }
        Node node = searchKey(list, key);
        if(node==null){
            list.addLast(new Node(key, value));
        }
        else {
            node.value(value);
        }
    }
}
public class main {
    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("john", "01-23");
        h.put("smith", "01-26");
        System.out.println(h.get("john"));
        System.out.println(h.get("smith"));
    }
}
