import java.util.Scanner;
import java.util.Random;
// Represents a single case in the game
class Case {
    int number; // case number (1-26)
    int value;  // Amount of money in that case
    boolean opened; // Whether the case was opened

    public Case(int number, int value) {
        this.number = number;
        this.value = value;
        this.opened = false; // Initially, all cases are unopened
    }
// Open the case and return its value
    public int open() {
        this.opened = true;
        return this.value;
    }
}
// Game's logic
class Game {
    Case[] cases; // Array of all 26 cases
    Case playerCase; // Case the player chose
    Random rand = new Random();

    public Game(int[] values) {
        // shuffle values
        for (int i = values.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
// Creates case objects with shuffled values
        cases = new Case[26];
        for (int i = 0; i < 26; i++) {
            cases[i] = new Case(i + 1, values[i]);
        }
    }
// Choose the player's case at the beginning
    public void choosePlayerCase(int number) {
        playerCase = cases[number - 1];
        playerCase.opened = true; // selected
    }
// Open a specific case by number
    public int openCase(int number) {
        Case c = cases[number - 1];
        if (c.opened) return -1;
        return c.open();
    }
// Get values of all remaining unopened cases
    public int[] remainingValues() {
        int count = 0;
        for (Case c : cases) if (!c.opened) count++;
        int[] rem = new int[count];
        int idx = 0;
        for (Case c : cases) {
            if (!c.opened) rem[idx++] = c.value;
        }
        return rem;
    }
// Banker Offer = average of cases remaining
    public int bankerOffer() {
        int[] rem = remainingValues();
        int sum = 0;
        for (int v : rem) sum += v;
        return sum / rem.length;
    }
// Display numbers of all remaining unopened cases
    public void displayRemainingCases() {
        System.out.print("Remaining cases: ");
        for (Case c : cases) {
            if (!c.opened) System.out.print(c.number + " ");
        }
        System.out.println();
    }
}
// Main class that runs the game
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// All 26 values
        int[] values = {
            1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750,
            1000, 5000, 10000, 25000, 50000, 75000,
            100000, 200000, 300000, 400000, 500000,
            750000, 1000000, 1500000
        };

        Game game = new Game(values); // Game object
// Player chooses their case
        System.out.println("Welcome to Deal or No Deal!");
        System.out.print("Choose your case (1-26): ");
        int playerChoice = scanner.nextInt();
        game.choosePlayerCase(playerChoice);
        System.out.println("You chose case #" + playerChoice + ". Keep it safe!\n");

        // Round structure
        int[] rounds = {6, 5, 4, 3, 2, 1, 1, 1, 1};
// Loop through each round
        for (int round = 0; round < rounds.length; round++) {
            int casesToOpen = rounds[round];
            System.out.println("--- Round " + (round + 1) + " ---");
            System.out.println("Open " + casesToOpen + " case(s)");
// Player opens cases in the current round
            for (int i = 0; i < casesToOpen; i++) {
                game.displayRemainingCases();
                System.out.print("Pick a case to open: ");
                int pick = scanner.nextInt();
                int result = game.openCase(pick);
                if (result == -1) {
                    System.out.println("Case already opened! Pick again.");
                    i--; // retry this turn
                    continue;
                }
                System.out.println("Case #" + pick + " had: $" + result);
            }

            // Banker offer
            int offer = game.bankerOffer();
            System.out.println("Banker offers: $" + offer);
            System.out.print("Deal or No Deal? (deal/no): ");
            String decision = scanner.next();

            if (decision.equalsIgnoreCase("deal")) {
                System.out.println("You accepted $" + offer + "!");
                System.out.println("Your original case had: $" + game.playerCase.value);
                scanner.close();
                return; // End the game if deal is accepted
            }
        }

        // Last case
        System.out.println("Final round! Your case contained: $" + game.playerCase.value);
        scanner.close();
    }
}
