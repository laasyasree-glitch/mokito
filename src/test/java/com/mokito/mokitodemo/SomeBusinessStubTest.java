package com.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void test() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int r=businessImpl.findGreatest();
		assertEquals(24,r);
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {24,6,15};
	}
	
}