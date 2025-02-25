package com.leverx.course.generics;

public class MapClass <K, V>{

    K key;
    V value;

    public MapClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public static void main(String[] args) {

        MapClass<String, Integer> mapClass = new MapClass<>("Luka", 24);

    }

}
