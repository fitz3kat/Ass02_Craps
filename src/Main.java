import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1;
        int die2;
        int crapsRoll;
        int points = 0;
        boolean done = false;
        String playAgain;
        boolean correctInput = true;

        do {

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die2 + die1;

            System.out.println("The first die is :" + die1 + " The second die is: " + die2 + " The sum of the dies is: " + crapsRoll);

            if ((crapsRoll == 2) || (crapsRoll == 3) || (crapsRoll == 12)) { //lose if 2,3, or 12
                System.out.println("Craps! You lose, game over.");

            } else if ((crapsRoll == 7) || (crapsRoll == 11)) {
                System.out.println("You win!");

            } else {

                while (points != crapsRoll && points != 7) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    points = die2 + die1;

                    System.out.println("The first die is :" + die1 + " The second die is: " + die2 + " The sum of the dies is: " + points);
                }
                if (points == crapsRoll) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                done = true;
            }
            if (playAgain.equalsIgnoreCase("Y")) {
                done = false;
            }


        }while (!done);
    }
}
