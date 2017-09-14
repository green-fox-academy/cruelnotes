package com.stringtutorial;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int TABLE_SIZE = 4;


        printTable(TABLE_SIZE);
        int[][] tableArray = new int[TABLE_SIZE][TABLE_SIZE];
        int rowNr = randInt(0,TABLE_SIZE);
        int colNr = randInt(0,TABLE_SIZE);;




    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    static void printTable(int size) {
        for (int i = 0; i <= size; i++) {
            System.out.println();
            for (int j = 0; j <= 4 ; j++) {
                System.out.print("O ");
            }
        }

    }

}
