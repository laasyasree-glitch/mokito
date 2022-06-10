package com.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockitoAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl bussinessImpl;

	@Test
	public void test3var() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24,15,3});
		assertEquals(24,bussinessImpl.findGreatest());
	}
	
	@Test
	void test1var() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {15});
		assertEquals(15,bussinessImpl.findGreatest());
	}
	@Test
	void testnovar() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,bussinessImpl.findGreatest());
	}

}

