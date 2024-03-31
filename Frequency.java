import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void frequencyOfWords(HashMap<String,Integer>a){
        System.out.println("\tThe frequency of words of the list:");
        for(Map.Entry<String, Integer>entry: a.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
