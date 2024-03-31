import java.util.HashMap;

public class Main {
    public static void main() {
        HashMap<String,Integer> wordslist = new HashMap<>();
        wordslist = WordListInit.ListInit();
        System.out.println("The longest word of the list is " + "\""+ LongestWord.findLongest(wordslist)+ "\"");
    }
}
