import java.util.Scanner;
public class Quiz {
 public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    //Question #1
    System.out.println("Enter a number greater than or equal to 12 but not 5: ");
    int answer1= sc.nextInt();
    if (answer1 >= 12 && answer1 != 5){
        System.out.println("Correct, well done!");
       score++;
    } else {
        System.out.println("Incorrect.");
    }
    // Question #2
    System.out.println("Enter a number less than 20 but not 15");
    int answer2= sc.nextInt();
    if (answer2 < 20 && answer2 != 15){
        System.out.println("Correct, well done!");
        score++;
    } else {
        System.out.println("Incorrect.");
    }


    // Question #3
    System.out.println("Enter a number equal to 8 or 12 ");
    int answer3= sc.nextInt();
    if (answer3 == 8 || answer3 == 12){
        System.out.println("Correct, well done!");
        score++;
    } else {
        System.out.println("Incorrect.");
    }

    System.out.println("You got " + score + " out of 3 correct!");
    sc.close();
}


        }
