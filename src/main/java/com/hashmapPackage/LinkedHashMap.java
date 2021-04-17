package com.hashmapPackage;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {
    private final int numBuckets;
    ArrayList<LinkedList> myBucketArray;

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }

    public LinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++)
            this.myBucketArray.add(null);
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        LinkedList myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) return null;
        MapNode<K, V> myMapNode = (MapNode<K, V>) myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        LinkedList myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new LinkedList<>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MapNode<K, V> myMapNode = (MapNode<K, V>) myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MapNode<>(key, value);
            myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    public V removeWord(K key) {

        int index = this.getBucketIndex(key);

        LinkedList<K> linkedList = this.myBucketArray.get(index);
        MapNode<K, V> myMapNode = (MapNode<K, V>) linkedList.search(key);
        MapNode<K,V> prev =null;
        while(myMapNode != null){
            if(myMapNode.key.equals(key))
                break;
            prev = myMapNode;
            myMapNode = myMapNode.next;
        }
        if (myMapNode == null) {
            return null;
        }

        if (prev != null) {
          prev.next = myMapNode.next;
        } else
            myBucketArray.set(index,myMapNode.next);

            return myMapNode.value;
    }
}
