package com.hashmapPackage;

import java.security.Key;

public class MapNode<K, V> implements INode<K> {

    K key;
    V value;
    MapNode<K,V> next;

    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getData() {
        return key;
    }

    @Override
    public void setData(K key) {
    this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MapNode<K, V>)next;
    }
    public V getValue(){
        return this.value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public String toString(){
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MapNode{" + "K=").append(key)
                .append(" V= ").append(value).append("}");
        if(next != null)
            mapNodeString.append("->").append(next);
        return mapNodeString.toString();
    }
}
