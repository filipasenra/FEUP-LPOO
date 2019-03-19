package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListFiltererTest {

    List<Integer> list;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add(-1);
        list.add(2);
        list.add(-3);
        list.add(4);
    }


    @Test
    public void ListFilterer()
    {
        //We are going to create a stub of the class that is passed to ListFilterer:
        // remember we only want to test this class and not other classes

        //Mocks the class IListFilter
        IListFilter mock_filter = Mockito.mock(IListFilter.class);

        //When the method accept of the class filter is called with -1 it should return true
        Mockito.when(mock_filter.accept(-1)).thenReturn(false);
        Mockito.when(mock_filter.accept(2)).thenReturn(true);
        Mockito.when(mock_filter.accept(-3)).thenReturn(false);
        Mockito.when(mock_filter.accept(4)).thenReturn(true);

        List<Integer> expected = new ArrayList<>();

        expected.add(2);
        expected.add(4);

        //Object of class to be tested
        ListFilterer testing_listFilterer = new ListFilterer(this.list);

        //Return list
        List<Integer> return_list = testing_listFilterer.filter(mock_filter);

        //Let's compare the two classes
        assertEquals(expected, return_list);

    }
}
