import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestWord {
    public static void findLongest(HashMap<String,Integer> a) {
        int maxlength = 0;
        List<String> longestWord=new ArrayList<>();
        for(String key: a.keySet()){
            if(key.length()>maxlength){
                maxlength= key.length();
                longestWord.removeAll(longestWord);
                longestWord.add(key);
            }else if(key.length()==maxlength){
                longestWord.add(key);
            }
        }
        if(longestWord.size()>1){
            System.out.println("Longest words of the list: " + longestWord.toString().replace("[", "").replace("]", ""));
        }else {     
            System.out.println("The longest word of the list: " + longestWord.toString());
        }
    }
}
