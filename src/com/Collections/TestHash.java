package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHash {
	private static final String colors[] = { "red", "white", "blue", "green",
			"gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange" };

	public static void main(String[] args) {
		
		List<String> listColors = new ArrayList<String>(Arrays.asList(colors));
		
		Set<String> set = new HashSet<String>(listColors);
		
		System.out.println(listColors);
		System.out.println(set);
	}

}
