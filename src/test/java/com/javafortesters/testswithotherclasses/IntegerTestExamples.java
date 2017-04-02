package com.javafortesters.testswithotherclasses;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lada on 13.3.2016.
 */
public class IntegerTestExamples {
    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue vraća int 4", 4, four.intValue());
        }

    @Test
    public void convertIntToHex() {
        assertEquals("11 becomes b", "b", Integer.toHexString(11));
         }

    @Test
    public void confirmMaxAndMin() {
        assertEquals("int minimum", -2147483648, Integer.MIN_VALUE);
    }

    @Test
    public void canConfirmIntMinAndMaxLimits(){
        int minimumInt = -2147483648;
        int maximumInt = 2147483647;
        assertEquals("integer min", minimumInt, Integer.MIN_VALUE);
        assertEquals("integer max", maximumInt, Integer.MAX_VALUE);
    }
}
