import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScoresTest {
    /*
     * Constructor tests using numScores() and get()
     */
    
    /*
     * getMax() tests
     */

    ScoresCopy scores;

    @Test public void maxFirst() {
        scores = new ScoresCopy("5 1 2 3 4");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxMid() {
        scores = new ScoresCopy("1 2 5 3 4");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxLast() {
        scores = new ScoresCopy("1 2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxRepeat() {
        scores = new ScoresCopy("1 5 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void negOne() {
        scores = new ScoresCopy("-1 2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void negMult() {
        scores = new ScoresCopy("-1 -2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void EmptyList() {
        scores = new ScoresCopy("");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            scores.getMax();
        });
    }

    @Test public void letterList() {
        scores = new ScoresCopy("a b c");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            scores.getMax();
        });
    }

    // constructor tests
    @Test public void constNumScoresTest() {
        scores = new ScoresCopy("1 2 3 4 5");
        assertEquals(5, scores.getNumScores());
    }

    @Test public void constGetOOBTest() {
        scores = new ScoresCopy("1 2 3 4 5");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            scores.get(5);
        });
    }

    @Test public void constGetTest() {
        scores = new ScoresCopy("1 2 3 4 5");
        assertEquals(3, scores.get(2));
    }

}
