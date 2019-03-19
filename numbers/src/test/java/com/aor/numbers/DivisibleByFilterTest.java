package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleByFilterTest {

    DivisibleByFilter test;

    @Before
    public void set_up()
    {
        test = new DivisibleByFilter(2);
    }

    @Test
    public void divisible(){
        assertTrue(test.accept(4));
    }

    @Test
    public void non_divisible(){
        assertFalse(test.accept(3));
    }

}