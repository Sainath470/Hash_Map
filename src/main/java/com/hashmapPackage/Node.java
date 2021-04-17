package com.hashmapPackage;

public class Node<K> implements INode<K> {
    public K Key;
    public INode next;

    public Node(K data) {
        this.Key = data;
        this.next = null;
    }

    @Override
    public K getKey() {
        return Key;
    }

    @Override
    public void setKey(K key) {
        this.Key = key;
    }


    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

}
