package service;

import java.util.Random;
import java.util.Scanner;

public class GameService {

    public static void guessNumber(int rn, int range, Scanner sc) {

        int count = 0;
        

        while (true) {

            if (count == 15) {
                System.out.println("");
                break;
            }

            System.out.println("...YOU CAN GUESS ONLY 15 TIMES...");

            System.out.print("ENTER GUESS NUMBER: ");
            int guessNum = sc.nextInt();
            boolean isValide = utils.InputValidator.isGuessNumInRange(guessNum, range);
            if (!isValide) {
                System.out.println("......ENTER NUMBER BETWEEN 1 AND " + range + ".......");
                break;
            }
            count++;

            if (guessNum > rn) {
                System.out.println("TOO HIGH ");
                System.out.println("NO. OF ATTEMPT : " + count + " GUESSED NO. : " + guessNum);

            } else if (guessNum < rn) {
                System.out.println("TOO LOW");
                System.out.println(" NO. OF ATTEMPT : " + count + " GUESSED NO. : " + guessNum);

            } else {
                System.out.println("YOUR GUESS IS CORRECT.");
                System.out.println("<<<<<<<<<<YOU WIN THE GAME >>>>>>>>>>>>");
                System.out.println();

                break;

            }

        }

    }

    public static void lowLevelGame(Scanner sc) {
        Random rand = new Random();
        int rn = rand.nextInt(50) + 1;
        int range = 50;

        guessNumber(rn, range, sc);

    }

    public static void meduimLevelGame(Scanner sc) {
        Random rand = new Random();
        int rn = rand.nextInt(100) + 1;
        int range = 100;
        guessNumber(rn, range, sc);
    }

    public static void highLevelGame(Scanner sc) {
        Random rand = new Random();
        int rn = rand.nextInt(500) + 1;
        int range = 500;
        guessNumber(rn, range, sc);
    }
}
