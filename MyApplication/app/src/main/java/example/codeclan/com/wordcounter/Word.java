package example.codeclan.com.wordcounter;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static android.R.attr.value;
import static java.util.Collections.frequency;

/**
 * Created by user on 06/11/2017.
 */

public class Word {

    public ArrayList<String> list;
    public String string;

    private HashMap<String, Integer> wordCounts;


    public Word() {
        this.list = new ArrayList<>();
        this.wordCounts = new HashMap<>();
    }

    public Integer getListSize() {
        return list.size();
    }

    public ArrayList<String> getList(){
        return this.list;
    }

    public HashMap<String, Integer> getWordCounts(){
        return this.wordCounts;
    }

    public boolean checkKeyExists(String key){
        return wordCounts.containsKey(key);
    }

    public int getWordCountValue(String key){
        return this.wordCounts.get(key);
    }

    public int countWords(String input){
        string = input.toString();
        String[] splitWords = string.split(" ");
        for (String word : splitWords){
            list.add(word);
        }
        return list.size();
    }

//    public int countDuplicate(String input){
//        return Collections.frequency(list, input);
//    }

    public int countDuplicate(String input){
        int count = 0;
        for (String word : list){
            if (word.equals(input)){
                count++;
            }
        }
        return count;
    }

    public String countOccurrences(ArrayList<String> list){
        for (String word : list){
            int count = countDuplicate(word);
            wordCounts.put(word, count);
        }
        return wordCounts.toString();
    }


}
