package com.ryan.app;
import java.util.LinkedList;

public class SortMountains {
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class NameCompare implements java.util.Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return one.name.compareTo(two.name);
		}
	}
	class HeightCompare implements java.util.Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return -(one.height - two.height);
		}
	}
	public void go(){
		mtn.add(new Mountain("Longs", 14255));
	    mtn.add(new Mountain("Elbert", 14433));
	    mtn.add(new Mountain("Maroon", 14156));
	    mtn.add(new Mountain("Castle", 14265));
	    System.out.println("as entered:\n" + mtn);
	    NameCompare nc = new NameCompare();
	    java.util.Collections.sort(mtn,nc);
	    
	    System.out.println("by name:\n" + mtn); 
	    HeightCompare hc = new HeightCompare();
	    java.util.Collections.sort(mtn, hc);
	    System.out.println("by height:\n" + mtn); 
	}
	public static void main(String a[]){
		new SortMountains().go();
	}
}
class Mountain implements Comparable<Mountain>{
	String name;
	int height;
	
	public Mountain(String name, int height){
		this.name = name;
		this.height = height;
	}
	
	public String toString(){
		return this.name + "  "+this.height ;
	}

	public int compareTo(Mountain o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}