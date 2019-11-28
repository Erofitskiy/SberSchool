package com.sbt.lesson04;

public class Main {
    public static void main(String[] args) {
        //System.out.println("111");
        CountMap<Integer> map = new CountMapIml<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        map.remove(10);
        System.out.println(map.getCount(10));
/*
        int count = map.getCount(5); // 2
        int count = map.getCount(6); // 1
        int count = map.getCout(10); // 0

 */


    }
}
