package jUnit;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	List<String> books;
	Student(String name){
		this.name  = name;
		books = new ArrayList<String>();
		books.add("Math");
		books.add("English");
	}
	 public List<String> getBooks(){
		 return books;		 
	 }
	 public void display(){
		 System.out.println("display student");
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	 
	
}
