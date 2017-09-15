package com.stringtutorial;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int TABLE_SIZE = 4;
        printTable(TABLE_SIZE);

        generateShips(TABLE_SIZE, 3);

    }




    static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    static void generateShips(int size, int shipNr) {
        String[][] tableArray = new String[size][size];

        for (int i = 0; i < shipNr ; i++) {
            int rowNr = randInt(0,size);
            int colNr = randInt(0,size);

            tableArray[r1][r2]

            if (tableArray[rowNr][colNr] == "") {
                tableArray[rowNr][colNr] = "X ";
            } else {
                i--;
            }

            for(int x = 0; x < 4; x++){
                System.out.println();
                for(int y = 0; y < 4; y++){
                    System.out.print(tableArray[x][y]);
                }
            }


        }

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
