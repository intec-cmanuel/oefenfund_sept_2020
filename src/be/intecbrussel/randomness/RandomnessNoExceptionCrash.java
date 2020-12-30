package be.intecbrussel.randomness;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomnessNoExceptionCrash {
    public static void main(String[] args) {
        // Create scanner and random instances
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        int userNumber = -1;
        String userLine;

        // Ask a number and prevent crashes due to a input mismatch exception
        do {
            userLine = scanner.nextLine();

            if (userLine.matches("-?\\d+")) {
                userNumber = Integer.parseInt(userLine);
            }
        } while (userNumber < 20);

        // creating and offset (rolling a 1 will be considered index 0 in array, so the offset of reality/array is 1)
        int offset = 1;

        // Creating an array and filling with 0s (indexes 0 -> 5 is rolling a 1 -> 6)
        int[] diceRolls = new int[6];
        Arrays.fill(diceRolls, 0);

        // Roll the dies
        for (int i = userNumber; i > 0; i--) {
            diceRolls[rng.nextInt(6)]++;
        }

        // Print results
        for (int i = 0; i < diceRolls.length; i++) {
            System.out.printf("Amount of %d rolled: %d. Percentage: %.2f%s.%n", i + offset, diceRolls[i], diceRolls[i] * 100.0 / userNumber, "%");
        }
    }
}
