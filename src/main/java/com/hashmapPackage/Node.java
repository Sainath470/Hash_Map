package com.hashmapPackage;

public class Node<K> implements INode<K> {
    private K data;
    private INode next;

    //constructor
    public Node(K data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public K getData() {
        return data;
    }

    @Override
    public void setData(K key) {
        this.data = key;
    }


    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

}
