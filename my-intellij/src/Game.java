import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("I thought of a random number. Guess what it is.");
            long guess = input.nextInt();
            Random r = new Random();
            long result = (long) Math.floor(Math.random() * (435435234 - 5498543 + 1) + 1);
            if (guess == result) {
                System.out.println("You got it correct! I did think of " + result);
            } else {
                System.out.println("You got it wrong! I thought of " + result);
            }
        }
    }
}