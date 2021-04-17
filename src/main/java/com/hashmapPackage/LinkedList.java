package com.hashmapPackage;

public class LinkedList<K> {
    public INode tail;
    public INode head;

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


    public void append(INode myNode) {
        if (tail == null) {
            this.tail = myNode;
        }
        if (head == null) {
            this.head = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void printMyNodes() {
        StringBuffer currentNodes = new StringBuffer("Nodes are: ");
        System.out.println(" Print statement");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            currentNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)){
                currentNodes.append(" ->");
            }
            tempNode = tempNode.getNext();
        }
        currentNodes.append(tempNode.getKey());
        System.out.println(currentNodes);
    }

    public void insert(INode node, INode newNode) {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
    }

    public void popLast() {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
    }

    public INode search(K key) {
        INode tempNode = head;
        while (tempNode != null ) { // && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }

    public void searchInsert(K data, INode newNode) {
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(data)) {
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
            if (tempNode.getNext().getKey().equals(key)) {
                INode temp = tempNode.getNext();
                tempNode.setNext(temp.getNext().getNext());
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