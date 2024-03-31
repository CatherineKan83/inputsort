import java.util.HashMap;

public class LongestWord {
    public static String findLongest(HashMap<String,Integer> a) {
        int maxlength = 0;
        String longestWord="";
        for(String key: a.keySet()){
            if(key.length()>maxlength){
                maxlength= key.length();
                longestWord = key;
            }
        }
        return longestWord;
        
    }
}
