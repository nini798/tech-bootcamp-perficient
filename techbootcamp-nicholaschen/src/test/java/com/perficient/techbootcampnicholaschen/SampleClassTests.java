package com.perficient.techbootcampnicholaschen;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SampleClassTests {

	@Mock
	SampleObject mockObj;
	
	@Test
	void testCheckVal1() {
		assertNotNull(mockObj);
		when(mockObj.getValue()).thenReturn(3);
		SampleClass t = new SampleClass(mockObj);
		assertEquals(t.checkVal(), 3, "This should pass");
	}
	
	@Test
	void testCheckVal2() {
		assertNotNull(mockObj);
		when(mockObj.getValue()).thenReturn(4);
		SampleClass t = new SampleClass(mockObj);
		assertEquals(t.checkVal(), 3, "This should fail");
	}

}
