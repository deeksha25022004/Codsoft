import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(101);

        int trial = 0;

        while (true) {
            System.out.println("Enter your guess between 1-100 :");

            int userNumber = sc.nextInt();
            trial++;

            if (randomNumber == userNumber) {
                System.out.println("oohooo! correct! you win.");
                System.out.println("your trial : " + trial);
                break;
            } else if (randomNumber > userNumber) {
                System.out.println("Nope! Number is lower. please guess again.");
            } else {
                System.out.println("nope! number is higher. please guess again.");
            }

        }
    }
}