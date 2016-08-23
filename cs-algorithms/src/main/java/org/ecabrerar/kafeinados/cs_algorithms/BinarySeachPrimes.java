package org.ecabrerar.kafeinados.cs_algorithms;

import java.util.function.BiFunction;

/**
 * @author ecabrerar
 * @date Aug 23, 2016
 */
public class BinarySeachPrimes {

	public static void main(String[] args) {

	BiFunction<Integer[], Integer, Integer> doSearch = (Integer[] array,
				Integer targetValue) -> {

			int min = 0;
			int max = array.length - 1;
			int guess;

			while (min <= max) {

				guess = (int) Math.floor(((min + max) / 2));

				if (array[guess] == targetValue) {
					return guess;
				} else 	if (array[guess] < targetValue) {
					min = guess + 1;
				} else {
					max = guess - 1;
				}
			}

			return -1;
		};

		Integer[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
		      		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

		int result = doSearch.apply(primes, 73);

		System.out.println("Found prime at index " + result);
	}
}
