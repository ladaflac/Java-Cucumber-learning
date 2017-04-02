/**
 * Created by Lada on 13.3.2016.
 */

package com.javafortesters.myfirsttest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2+2;
        assertEquals("greska na 2+2=4", 4, answer);
    }
    @Test
    public void twoMinusTwoZero() {
        int answer = 2-2;
        assertEquals("greška, 2-2 <> 0", 0, answer);
    }
    @Test
    public void calculateDivisionRemainder() {
        int answer = 3%2;
        assertEquals("ostatak od 3:2 nije ispao 1", 1, answer);
    }
    @Test
    public void checksDivisionNotEqualToOne() {
        int answer = 3%2;
        assertNotEquals("ostatak ne smije biti jednak 1", 0, answer);
    }
}
