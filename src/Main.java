/**
 * Created by ozan on 6/28/17.
 */
public class Main {
    public static void main(String[] args) {
        SongMaker maker = new SongMaker();
        System.out.println("Serdar Ipsum Generator - JAVA EDITION\nnow with MARKOV CHAIN!\n");
        System.out.println(maker.songTitle() + "\n");
        maker.generateSong();
        //System.out.println(maker.generateALine());
        System.out.println(" - Serdar Ortaç\n");
    }
}
