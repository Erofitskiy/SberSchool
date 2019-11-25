package com.sbt.lesson03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            TextWorker worker = new TextWorker();

            System.out.println("Task1___Count of unique words:\n" + worker.countOfDifferentWords());
            System.out.println("\nTask2___Sort unique words by length:\n" + worker.getUniqueWordsOrderBySize());
            System.out.println("\nTask2___Sort unique words by abc:\n" + worker.getUniqueWordsOrderByABC());
            System.out.println("\nTask3___Frequency dictionary:\n" + worker.getStatisticWords());
            System.out.println("\nTask4___Reversed text:\n" + worker.reverseText());
            System.out.println("\nTask6___Write needed line(s): ");
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> lines = new ArrayList<>();
            Scanner lineScanner = new Scanner(scanner.nextLine());
            while (lineScanner.hasNextInt()) {
                lines.add(lineScanner.nextInt());
            }
            System.out.println(worker.getLine(lines));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No such line(s)");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
