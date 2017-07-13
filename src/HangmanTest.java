import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ingrid on 13.07.2017.
 */
class HangmanTest {
    @Test
    void takeWordTest(){
        Hangman hman = new Hangman();
        assertEquals("Test", hman.takeWord());
        assertEquals("Kaelkirjak", hman.takeWord());
    }
}