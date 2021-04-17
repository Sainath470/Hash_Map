package com.hashmapPackage;
public class HashMap<K, V> {
    private final LinkedList linkedList;
    public INode head;

    public  HashMap() {
        this.linkedList = new LinkedList<K>();
    }

    public V get(K key) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MapNode<K, V> mapNode = (MapNode<K, V>) this.linkedList.search(key);
        if (mapNode == null) {
            mapNode = new MapNode<>(key, value);
            this.linkedList.append(mapNode);
        } else
            mapNode.setValue(value);
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
    public String toString() {
        return "HashMapNodes{" + linkedList + "}";
    }
}
