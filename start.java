import java.util.Scanner;

public class start {
    public static void main(String args[]) {
        int flag = 0;
        Boolean currentGameState = true;
        Scanner in = new Scanner(System.in);
        game currentGame = new game();

        while (currentGameState) {
            if (flag == 0) {
                System.out.println("I am thinking of a number between 1 - 100...");
                currentGame = GameFactory.getGame();
                flag++;
            }

            System.out.println("your guess? ");
            int guess = in.nextInt();
            String result = currentGame.getGuessHigherOrLower(guess);

            if (result == "matches") {
                System.out.println("Your guess is this number.");
                System.out.println("Would you like to play again?");

                String response = in.next();
                response = response.toLowerCase();
                char characterResponse = response.charAt(0);
                if (characterResponse == 'y') {
                    flag = 0;
                }
                else {
                    currentGameState = false;
                }
            }
            else if (result == "lower") {
                System.out.println("Your guess is higher then this number.");
            }
            else {
                System.out.println("Your guess is lower then this number.");
            }
        }
        System.out.println("Goodbye!");
        in.close();
    }
}