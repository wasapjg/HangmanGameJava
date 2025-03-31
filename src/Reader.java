import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Reader {
    public static String reader(){
        String line = "";
        Random random = new Random();
        ArrayList<String> words = new ArrayList<>();

        String uri= "C:\\Users\\Fede\\Documents\\java\\HangmanGame\\src\\words";
        // Guess word from file
        try(BufferedReader reader = new BufferedReader(new FileReader(uri));) {
            while ((line = reader.readLine()) != null){
                words.add(line.toUpperCase());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

        int randomNumber = random.nextInt(0, words.size());
        return words.get(randomNumber);
    }
}
