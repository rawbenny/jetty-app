package com.ryan.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		new TestTree().go();
	}

	public void go() {
     Book b1 = new Book("How Cats Work");
     Book b2 = new Book("Remix your Body");
     Book b3 = new Book("Finding Emo");
     
     TreeSet<Book> tree = new TreeSet<Book>(new Comparator<Book>(){
    	 public int compare(Book one,Book two){
    		 return one.title.compareTo(two.title);
    	 }
     });
     tree.add(b1);
     tree.add(b2);
     tree.add(b3);
     System.out.println(tree);
//     ArrayList<Booke> liste = new ArrayList<Book>();
//     ArrayList<Book> t = new ArrayList<Booke>();
     List<Book> list = new ArrayList<Book>();
     ArrayList<Booke> dogs = new ArrayList<Booke>();
     List<Booke> dogList = dogs;
//     ArrayList<Object> objs = new ArrayList<Booke>();/*can't compile*/
     }
	
}

class Book /*implements Comparable<Book>*/{
	protected String title;

	public Book(String t)  {
		title = t;
	}
//	public int compareTo(Book book){
//		return title.compareTo(book.title);
//	}
	public <T extends Book> void sortBook(ArrayList<T> inList){
	}
//	public void sortBook(ArrayList<? extends Book> inList){
//		
//	}
}
class Booke extends Book{
	public Booke(String a){
		super(a);
	}
}
