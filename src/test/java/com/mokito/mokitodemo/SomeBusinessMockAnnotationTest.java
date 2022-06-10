package com.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// replaced @RunWith with @ExtendWith
// replaced MockitoJUnitRunner.class with MockitoExtension.class
@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessImpl.findGreatest());
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, businessImpl.findGreatest());
	}

	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatest());
	}
}