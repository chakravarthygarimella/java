package com.mockito.examples;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.java.corejava.string.EqualsMethodExample;

@RunWith(MockitoJUnitRunner.class)
public class MockitoPractice {
    
    @Mock
    EqualsMethodExample equalsMethodExample;
    
    @Test
    public void testString() {
        EqualsMethodExample var = new EqualsMethodExample(equalsMethodExample);
        String str = var.getString("hello");
        assertEquals("hello", str);
        verify(equalsMethodExample).getString("hello");
        
    }

}
