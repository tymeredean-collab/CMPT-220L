import java.util.Scanner
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        int vowels = countVowels(sentence);
        System.out.println("Number of vowels: " + vowels);

        sc.close();
    }

    public static int countVowels(String text) {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
        
    
    }
   
}
