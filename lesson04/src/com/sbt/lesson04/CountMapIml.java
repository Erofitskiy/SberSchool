package com.sbt.lesson04;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

class CountMapIml<T> implements CountMap<T> {

    private HashMap<T, Integer> map = new HashMap<>();

    // добавляет элемент в этот контейнер.
    @Override
    public void add(T element){
        map.put(element, map.containsKey(element) ? map.get(element) + 1 : 1);
    }

    //Возвращает количество добавлений данного элемента
    @Override
    public int getCount(T element){
        return map.getOrDefault(element, 0);
    }

    //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
    @Override
    public int remove(T element){
        int count = map.get(element);
        map.remove(element);
        return count;
    }

    //количество разных элементов
    @Override
    public int size(){
        return map.size();
    }

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения
    @Override
    public void addAll(CountMap<T> source){
        source.toMap().forEach((key, value) -> {
            map.put(key, map.containsKey(key) ? map.get(key) + value : 1);
        });
    }

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    @Override
    public Map<T, Integer> toMap(){
        return map;
    }

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    @Override
    public void toMap(Map<T, Integer> destination){
        destination.putAll(map);
    }
}
