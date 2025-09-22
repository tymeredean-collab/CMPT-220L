import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Reads input from the keyboard

        // Ask the user for a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) { //I used a for loop with i starting at 0 and running while i < input.length(). 
          // I chose < input.length() because string indices in Java start at 0, so the last character is at input.length() - 1.
            System.out.println(input.charAt(i));
        }

        sc.close();
    }
}

// I googled “Java print each character of a string” and found that charAt() is the standard method to access individual characters.
