import java.io.File;
import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by ozan on 6/29/17.
 */
public class SongMaker {
    public SongMaker(){
        words = getWords();
    }
    String words = "";
    //PREDEFINED LENGTH
    int pLength = 4;
    SecureRandom random = new SecureRandom();
    int min = 3;
    int max = 6;
    public static String getWords(){
        File file = new File("songs.txt");
        String words = "";
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String internalLine = input.nextLine().toLowerCase();
                if (!internalLine.equals("-----"))
                    words += internalLine+" ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
    public String generateALine(){
        String songLine = "";
        int randLineLength = random.nextInt(max-min+1)+min;
        for(int i = 0; i <randLineLength; i++){
            int randomWord = random.nextInt(wordLength());
            String[] splitted = words.split(" ");
            songLine += splitted[randomWord]+" ";
        }
        String songL = songLine.substring(0, 1).toUpperCase() + songLine.substring(1);
        return songL;
    }
    public void generateVerse(){
        for (int i = 0 ; i < 4; i++){
            System.out.println(generateALine());
        }
        System.out.println();
    }
    public void generateSong(){
        for (int i = 0; i < pLength; i++){
            generateVerse();
        }
    }
    public String songTitle(){
        String songLine="";
        for (int i = 0 ; i < 4; i++){
            int randomWord = random.nextInt(wordLength());
            String[] splitted = words.split(" ");
            songLine += splitted[randomWord]+" ";
        }
        return songLine.toUpperCase();
    }
    public int wordLength(){
        String[] splitted = words.split(" ");
        return splitted.length;
    }
}

