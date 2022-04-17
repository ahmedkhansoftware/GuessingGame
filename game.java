import java.util.Random;

public class game {
    private int randomNumber;
    private int numberOfGuess;

    public game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(101); 
    }

    public int getGameStats() {
        return numberOfGuess;
    }

    public String getGuessHigherOrLower(int guess) {
        if (guess == randomNumber) {
            return "matches";
        }

        numberOfGuess++;

        if (guess > randomNumber) {
            return "lower";
        }

        return "higher";
    } 
}