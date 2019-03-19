package com.aor.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveFilterTest {

    PositiveFilter test = new PositiveFilter();

    @Test
    public void PositiveFilterTest_1(){

        assertFalse(test.accept(-1));
    }

    @Test
    public void PositiveFilterTest_2(){

        assertTrue(test.accept(1));
    }

    @Test
    public void PositiveFilterTest_3(){

        assertFalse(test.accept(0));
    }

}