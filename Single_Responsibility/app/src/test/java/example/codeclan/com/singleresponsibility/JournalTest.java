package example.codeclan.com.singleresponsibility;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by petes on 06/11/2017.
 */

public class JournalTest {

    Bear bear;
    Salmon salmon;
    Journal journal;

    @Before
    public void setup(){
        bear = new Bear();
        food = new Salmon();
    }

    @Test
    public void canWriteJournalEntry(){
        bear.eat(food);
        bear.writeJournal("Dear Diary, I ate " + bear.foodCount() + " salon today.");
        assertEquals("Dear Diary, I ate 1 salon today.", bear.getLastJournalEntry());
    }
}
