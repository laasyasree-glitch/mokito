package com.mokito.mokitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	int findGreatest() {
		int[] data =dataService.retriveAllData();
		int greatest=Integer.MIN_VALUE;
		for(int value : data) {
			if(value>greatest) {
				greatest=value;
			}
		}
		return greatest;
	}	
}

