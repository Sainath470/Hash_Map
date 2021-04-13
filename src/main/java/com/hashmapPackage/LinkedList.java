package com.hashmapPackage;

public class LinkedList<K> {
    public INode head;
    public INode tail;


    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }


    public void append(INode<K> newNode) {
        if (tail == null) {
            this.tail = newNode;
        }
        if (head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printMyNodes() {
        System.out.println("myNodes: "+head);
    }

    @Override
    public String toString(){
        return "HashMaoNodes{" +head + '}';
    }
    public void insert(INode node, INode newNode) {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode<K> search(K data) {
        INode<K> tempNode = head;
        while (tempNode != null)
        {
            if (tempNode.getData().equals(data)) {
                System.out.println(" The node is present ");
                return tempNode;
            }
            else return null;
        }
        return null;
    }

    public void searchInsert(K data, INode newNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getData().equals(data)) {
                INode temp = tempNode.getNext();
                tempNode.setNext(newNode);
                newNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }


    public void searchDelete(K key) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getNext().getData().equals(key)) {
                INode temp = tempNode.getNext().getNext();
                tempNode.setNext(temp);
            }
            tempNode = tempNode.getNext();
        }
    }

    public int size(){
        INode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }
}