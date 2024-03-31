import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordListInit {
    public static HashMap<String,Integer> ListInit() {

        HashMap <String,Integer> wordslist = new HashMap<>( );
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for(int i =0;i<words.length;i++){
                    if(wordslist.containsKey(words[i])){
                        wordslist.put(words[i], wordslist.get(words[i])+1);
                    } else{
                        wordslist.put(words[i],1);
                    }
                }
            }
            wordslist.remove("");
            

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return wordslist;
    }
}
