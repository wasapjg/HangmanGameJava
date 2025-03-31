import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Guess word
        String word = Reader.reader();
        String normalWord = NormalizerWord.removeAccents(word);
        ArrayList<String> wordGuess = new ArrayList<>();
        int wrongGuess = 0;

        // Show the word with "_" for any character
        for (int i = 0; i < word.length(); i++){
            wordGuess.add(i ,"_");
        }

        while (wrongGuess < 6){
            System.out.println("Guess the word: " + String.join(" ",wordGuess));

            // Let player guess the letter
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a letter: ");
            Character guess = scanner.next().toUpperCase().charAt(0);

            // change "_" for the letter if the guess was right OR show a part of Hangman
            if (normalWord.contains(String.valueOf(guess))){
                for (int i = 0; i < normalWord.length(); i++) {
                    if(normalWord.charAt(i) == guess){
                        wordGuess.set(i, String.valueOf(guess));
                    }
                }
            } else {
                wrongGuess++;
            }

            System.out.print(Hangman.man(wrongGuess));

            if (!wordGuess.contains("_")) {
                break;
            }
        }
        // If the body is full GAME OVER!
        // If the word is full    WIN!
        if(wrongGuess == 6){
            System.out.println("GAME OVER!");
        }
        else{
            System.out.println("Congratulation the word was: " + word);
            System.out.println("WIN!");
        }
    }


}