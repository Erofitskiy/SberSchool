package com.sbt.lesson04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List newArrayList() {
        return new ArrayList<T>();
    }

    public static<T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static<T> List<T> limit(List<? extends T> source, int size) {
        List<T> list = new ArrayList<T>();
        if (size > source.size()) {
            list.addAll(source);
        } else {
            for (int i = 0; i < size; i++) {
                list.add(source.get(i));
            }
        }
        return list;
    }

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t : c2)
            if (c1.contains(t))
                return true;
        return false;
    }


    //       TODO
    //public static List range(List list, Object min, Object max) {
    //}

    //public static List range(List list, Object min, Object max, Comparator comparator) {
    //}

}
/*
    Пояснения к некоторым методам.

//true если первый лист содержит все элементы второго
public static boolean containsAll(List c1, List c2) {
        }

//true если первый лист содержит хотя-бы 1 второго
public static boolean containsAny(List c1, List c2) {
        }

//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
public static List range(List list, Object min, Object max) {
        }

//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
public static List range(List list, Object min, Object max, Comparator comparator) {
        }
 */

