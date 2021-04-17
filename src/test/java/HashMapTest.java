import com.hashmapPackage.HashMap;
import com.hashmapPackage.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Locale;

public class HashMapTest {

    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency()
    {

        String sentence = "To be or not to be";
        HashMap <String, Integer> myHashMap = new HashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assertions.assertEquals(2, frequency);
    }

    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency()
    {

        String sentance = "Paranoids are not" + " paranoid because they are paranoid but"
                + " because they keep putting themselves" + " deliberately into paranoid avoidable" + " situations";
        HashMap<String, Integer> myHashMap = new HashMap();
        String[] words = sentance.toLowerCase().split(" ");

        for (String word : words)
        {
            Integer value = myHashMap.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }

        int frequency = myHashMap.get("paranoid");
        System.out.println(myHashMap);
        Assertions.assertEquals(3, frequency);
    }

    @Test
    public void givenSentenceWhenWordIsRemovedFromoListShouldReturnFrequency()
    {

        String sentance = "Paranoids are not" + " paranoid because they are paranoid but"
                + " because they keep putting themselves" + " deliberately into paranoid avoidable" + " situations";
        HashMap<String, Integer> myHashMap = new HashMap();
        String[] words = sentance.toLowerCase().split(" ");

        for (String word : words)
        {
            Integer value = myHashMap.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }
        myHashMap.searchDelete("avoidable");
        int frequency = myHashMap.get("avoidable");
        System.out.println(myHashMap);
        Assertions.assertNull( frequency);
    }
}
