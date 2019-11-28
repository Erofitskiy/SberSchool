package com.sbt.lesson03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class TextWorker {
    private TreeSet<String> uniqueWords;
    private TreeMap<String, Integer> countWords;
    private ArrayList<String> lines;

    TextWorker() {
        uniqueWords =  new TreeSet<>();
        countWords = new TreeMap<>();
        lines = new ArrayList<>();
        try {
            Scanner in = new Scanner(new File("lesson03/src/resources/File.txt"));
            while(in.hasNextLine()) {
                String lineValue = in.nextLine();
                lines.add(lineValue);
                Scanner scannerLine = new Scanner(lineValue);
                scannerLine.useDelimiter("\\W+");
                while(scannerLine.hasNext()) {
                    String str = scannerLine.next();
                    uniqueWords.add(str.toLowerCase());
                    if ((countWords.containsKey(str)))
                        countWords.put(str, countWords.get(str) + 1);
                    else
                        countWords.put(str, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Task1
    int countOfDifferentWords() {
        return uniqueWords.size();
    }

    //Task2.1
    String getUniqueWordsOrderBySize() {
        StringBuilder result = new StringBuilder();
        ArrayList<String> temp = new ArrayList<>(uniqueWords);
        temp.sort(Comparator.comparingInt(String::length));
        for (String str : temp)
            result.append(str).append(" ");
        return result.toString();
    }
    //Task2.2
    String getUniqueWordsOrderByABC(){
        StringJoiner result = new StringJoiner(" ");
        for(String str : uniqueWords)
            result.add(str);
        return result.toString();
    }

    //Task3
    String getStatisticWords() {
        StringJoiner result = new StringJoiner("\n");
        countWords.forEach((k,v)->result.add(k + ": " + v));
        return result.toString();
    }

    //Task4
    String reverseText() {
        StringJoiner result = new StringJoiner("\n");
        ArrayList<String> temp = new ArrayList<>(lines);
        Collections.reverse(temp);
        for (String line : temp)
            result.add(line);
        return result.toString();
    }

    //Task6
    private String getLine(int lineNum) throws ArrayIndexOutOfBoundsException{
        if (lineNum > lines.size() - 1)
            throw new ArrayIndexOutOfBoundsException();
        return lines.get(lineNum);
    }

    String getLine(List<Integer> numLines) throws ArrayIndexOutOfBoundsException {
        StringJoiner result = new StringJoiner("\n");
        for (Integer lineNum : numLines)
            result.add(getLine(lineNum));
        return result.toString();
    }
}
