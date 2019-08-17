package com.java.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.java.corejava.string.EqualsMethodExample;

public class MockitoPractice {

    @Mock
    EqualsMethodExample equalsMethodExample;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testString() {
        EqualsMethodExample var = mock(EqualsMethodExample.class);
        String str = var.getString("hello");
        assertEquals("hello", str);
        verify(equalsMethodExample).getString("hello");
    }

}
