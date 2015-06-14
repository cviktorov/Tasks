package com.Lambda;

import java.util.Arrays;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void method(Function<Double, Double> function) {
		System.out.println(function.apply(2.5));
		
	}
	
	public static void main(String[] args) {
		Integer[] nums = {5,3,7,9,5,6,3,1,7};
		
		Arrays.sort(nums,(a,b) -> b-a);
		
		//System.out.println(Arrays.asList(nums));
		
		Predicate<Integer> p = (a) -> a>2;
		System.out.println(p.test(3));
		
		BiPredicate<Computer, Computer> bip = (Computer a, Computer b) -> a.getYear() < b.getYear();
		System.out.println(bip.test(new Computer("a", 1993), new Computer("b", 1994)));
		
		Function<Computer, Double> func = (Computer c) -> c.getYear() * 2.5;
		System.out.println(func.apply(new Computer("a", 1993)));
		
		Consumer<Integer> cons = a -> System.out.println("COns" + a);
		cons.accept(2);
		
		Supplier<String> supp = () -> "Hello";
		System.out.println(supp.get());
		
		BinaryOperator<Integer> biOp = (a,b) -> a+b;
		System.out.println(biOp.apply(1, 2));

		Computer comp = new Computer("Name", 1234);
		method(x -> 2.3 * x);
		method(Math::sqrt);
		method(comp::getPlusSix);
		
	}

}
