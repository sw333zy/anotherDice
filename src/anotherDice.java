import java.util.Scanner;

public class anotherDice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int die1 = 0;
        int die2 = 0;
        int count = 0;
        int score = 0;

        System.out.println("Welcome! Let's Play Roll Dice!");
        System.out.println("Would you like to play a game? (y/n)");
        String question = keyboard.next();
        if (question.equals("y")) {

            do {
                die1 = (int) (Math.random() * 6 + 1);
                die2 = (int) (Math.random() * 6 + 1);
                if (die1 == 1 && die2 == 1) {
                    score = 25;
                    count += score;
                    System.out.println("You rolled a " + die1 + " and a " + die2 + ". Bonus points!");
                    System.out.println("Your score is: " + count);
                    System.out.println("Would you like to play again? (y/n)");
                    question = keyboard.next();
                    if (question.equals("n")){
                        System.out.println("Okay maybe next time");
                        System.exit(0);
                    }

                } else if (die1 == 1 || die2 == 1) {
                    score = 0;
                    count += score;
                    System.out.println("You rolled a " + die1 + " and a " + die2 + ". No new points!");
                    System.out.println("Your score is: " + count);
                    System.out.println("Would you like to play again? (y/n)");
                    question = keyboard.next();
                    if (question.equals("n")){
                        System.out.println("Okay maybe next time");
                        System.exit(0);
                    }
                } else {
                    score = die1 + die2;
                    count += score;
                    System.out.println("You rolled a " + die1 + " and a " + die2);
                    System.out.println("Your score is: " + count);
                    System.out.println("Would you like to play again? (y/n)");
                    question = keyboard.next();
                    if (question.equals("n")){
                        System.out.println("Okay maybe next time");
                        System.exit(0);
                    }
                }

            } while (count < 100);
            System.out.println("You have scored over 100! Congratulations, You win!");
        }
        System.out.println("Okay maybe next time");
    }

}
