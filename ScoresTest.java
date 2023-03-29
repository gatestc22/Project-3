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

    Scores scores;

    @Test public void maxFirst() {
        scores = new Scores("5 1 2 3 4");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxMid() {
        scores = new Scores("1 2 5 3 4");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxLast() {
        scores = new Scores("1 2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void maxRepeat() {
        scores = new Scores("1 5 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void negOne() {
        scores = new Scores("-1 2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void negMult() {
        scores = new Scores("-1 -2 3 4 5");
        assertEquals(5, scores.getMax());
    }

    @Test public void EmptyList() {
        scores = new Scores("");
        assertThrows(NoSuchElementException.class, () -> {
            Scores.getMax(scores);
        });
    }

    @Test public void letterList() {
        scores = new Scores("a b c");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            scores.getMax();
        });
    }

    // constructor tests
    @Test public void constNumScoresTest() {
        scores = new Scores("1 2 3 4 5");
        assertEquals(5, scores.getNumScores());
    }

    @Test public void constGetOOBTest() {
        scores = new Scores("1 2 3 4 5");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            scores.get(5);
        });
    }

    @Test public void constGetTest() {
        scores = new Scores("1 2 3 4 5");
        assertEquals(3, scores.get(2));
    }



    // new stuff
    Scores scores1;

    @Test public void constIllegal() {
        assertThrows(IllegalArgumentException.class, () -> {
            // TODO: finish this
        });
    }

}
