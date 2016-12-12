package jUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StudentTest {
	
	Student student = new Student("Shushi");

	@Test
	public void testGetBooks() {
		List<String> list = new ArrayList<String>();
		list.add("Math");
		list.add("English");
		assertEquals(list, student.getBooks());
	}

}
