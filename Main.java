import java.util.HashMap;

public class Main {
    public static void main() {
        HashMap<String,Integer> wordslist = new HashMap<>();
        wordslist = WordListInit.ListInit();
        WordCount.frequencyOfWords(wordslist);
        LongestWord.findLongest(wordslist);
        Frequency.frequencyOfWords(wordslist);
    }
}
