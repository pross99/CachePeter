package com.example.demo;


import java.util.HashMap;

public class Cache {



    HashMap<Integer, String> map = new HashMap<>();


    public Cache(HashMap<Integer, String> map) {
        this.map = map;
    }

    public String get(Integer key){

        return map.get(key);
    }

    public void set(Integer key, String value){
        map.put(key,value);

    }

    public boolean has(Integer key) {

        return map.containsKey(key);
    }

    public void delete(Integer key)
    {
        map.remove(key);

    }






}

