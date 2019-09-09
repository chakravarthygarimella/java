package com.mockito.mockitopractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WithoutMockAnnotationExample {

    @Captor
    private ArgumentCaptor<List<String>> captor;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenNotToUseMockitoAnnotation() {
        List mockList = mock(ArrayList.class);
        mockList.add("first");
        verify(mockList).add("first");
        assertEquals(0, mockList.size());
        when(mockList.size()).thenReturn(200);
        assertEquals(200, mockList.size());

    }

    @Test
    public void testComparable1() {
        Comparable<Integer> c = mock(Comparable.class);
        when(c.compareTo(2)).thenReturn(-1);
        assertEquals(-1, c.compareTo(2));
        verify(c).compareTo(2);
    }

    @Test
    public void testComparable2() {
        Comparable<String> c = mock(Comparable.class);
        when(c.compareTo("chakri")).thenReturn(1);
        when(c.compareTo("honey")).thenReturn(2);
        assertEquals(1, c.compareTo("chakri"));
        assertEquals(2, c.compareTo("honey"));
    }

    @Test
    public void testPropertyClass() {
        Properties p = mock(Properties.class);
        when(p.getAge()).thenReturn(new Integer(10));
        assertEquals(new Integer(10), p.getAge());
        verify(p).getAge();

        doReturn("chakri").when(p).getName();

        String str = p.getName();
        assertEquals("chakri", str);
    }

    @Test
    public void testLinkedListWithSpy() {
        List<String> list = spy(LinkedList.class);
        doReturn("chakri").when(list).get(0);
        assertEquals("chakri", list.get(0));
    }

    @Test
    public void testAgumentCap() {
        List<String> list = Arrays.asList("c", "b", "d");
        List<String> mockList = mock(List.class);
        mockList.addAll(list);

        verify(mockList).addAll(captor.capture());
        List<String> capturedArgs = captor.getValue();
        // assertThat(capturedArgs, "c");

    }

}
