package com.mockito.mockitopractice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {
	
	    @InjectMocks
	    RecordService service;

	    @Mock
	    DatabaseDao dataDao;

	    @Rule
	    public MockitoRule rule = MockitoJUnit.rule();

	    @Mock
	    NetworkDao networkDao;

	    @Before
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	    }
	    
	    @Test
	    public void testDaos() {
	        Boolean saved = service.save("file.txt");
	        assertEquals(true, saved);
	        
	        verify(dataDao, times(1)).save("file.txt");
	        verify(networkDao, times(2)).save("file.txt");
	    }

	
}
