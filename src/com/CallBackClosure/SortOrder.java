package com.CallBackClosure;

public class SortOrder {
	
	private class Upward implements Sortable{

		public boolean greater(int a, int b) {
			// TODO Auto-generated method stub
			return a>b;
		}
		
	}
	
	private class Downward implements Sortable{

		public boolean greater(int a, int b) {
			// TODO Auto-generated method stub
			return a<b;
		}
	}
	
	public Sortable upWard(){
		return new Upward();
	}
	
	public Sortable downWard(){
		return new Downward();
	}
}
