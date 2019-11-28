package com.sbt.lesson03;

import java.util.*;

public class ReverseIterator<E> implements Iterator {
    private ListIterator<E> iterator;

    public ReverseIterator(List<E> source) throws NullPointerException {
        if (source.size() == 0) {
            throw new NullPointerException();
        }
        iterator = source.listIterator(source.size());
    }

    @Override
    public boolean hasNext() {
        return (iterator.hasPrevious());
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw  new NoSuchElementException();
        }
        return iterator.previous();
    }
}
