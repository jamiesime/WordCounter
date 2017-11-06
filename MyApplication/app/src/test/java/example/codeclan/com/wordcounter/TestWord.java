package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/11/2017.
 */

public class TestWord {

    public Word word;
    public String testString;

    @Before
    public void setUp(){
        word = new Word();

    }

    @Test
    public void testCountWords(){
        testString = "The sad man ate and was happy.";
        assertEquals(7, word.countWords(testString));
    }

    @Test
    public void testCountDuplicates(){
        testString = "Big Big Big Beach Beach Party Party Time";
        word.countWords(testString);
        assertEquals(3, word.countDuplicate("Big"));
    }

    @Test
    public void testAddDuplicateToHash(){
        testString = "Big Big Big Beach Beach Party Party Time";
        word.countWords(testString);
        word.countOccurrences(word.getList());
        assertEquals(true, word.checkKeyExists("Big"));
        assertEquals(3, word.getWordCountValue("Big"));
    }

    @Test
    public void testOccurrenceCount(){
        testString = "Big Big Big Beach Beach Party Party Time";
        word.countWords(testString);
        word.countOccurrences(word.getList());
        assertEquals(3, word.getWordCountValue("Big"));
    }

    @Test
    public void testWordCountHash(){
        testString = "Big Big";
        word.countWords(testString);
        assertEquals("{Big=2}", word.countOccurrences(word.getList()));
    }


}
