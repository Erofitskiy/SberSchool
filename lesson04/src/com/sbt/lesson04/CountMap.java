package com.sbt.lesson04;


import java.util.Map;

//Параметризовать CountMap и реализовать его.
public interface CountMap <T> {
    // добавляет элемент в этот контейнер.
    void add(T element);

    //Возвращает количество добавлений данного элемента
    int getCount(T element);

    //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
    int remove(T element);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения
    void addAll(CountMap<T> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map<T, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<T, Integer> destination);
}

