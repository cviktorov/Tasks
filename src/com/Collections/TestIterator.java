package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		String[] books = {"b1","b2","b3","b4"};
		String[] books2 = {"b5","b6","b3","b7"};

		List<String> listBooks = new ArrayList<String>(Arrays.asList(books));
		List<String> listBooks2 = new ArrayList<String>(Arrays.asList(books2));
		
		
		
		Iterator iterator = listBooks.listIterator();
		
		while(iterator.hasNext()){
			if(listBooks2.contains(iterator.next())){
				iterator.remove();
			}
		}
		
		System.out.println(listBooks);
		System.out.println(listBooks2);
	}

}
