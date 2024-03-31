import java.util.HashMap;

public class WordCount {
        public static void frequencyOfWords(HashMap<String,Integer>a){
            int wordCount = 0;
            for(String key: a.keySet()){
                wordCount = wordCount + a.get(key);
            }
            System.out.println("The quantity of words of the list: " + wordCount);
    }
}
