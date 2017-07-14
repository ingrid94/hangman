import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ingrid on 13.07.2017.
 */
class HangmanTest {
    private Hangman hman = new Hangman();
    @Test
    void takeWordTest(){
        assertNotNull(hman.takeWord());
    }
}