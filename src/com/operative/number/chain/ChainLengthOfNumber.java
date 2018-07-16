package com.operative.number.chain;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ChainLengthOfNumber {

	public static int obtainChainLength(int number) {
		String str = Integer.toString(number);
		System.out.println("Original number was " + str);
		Set<String> chain = new LinkedHashSet<>();
		chain.add(str);		
		while (true) {
			str = newNumber(str);
			if (!(chain.add(str)))
				break;
		}
		return chain.size();
	}

	private static String newNumber(String string) {
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		String accendString = String.valueOf(ch);
		String descendString = new StringBuilder(accendString).reverse().toString();
		String newNum = Integer.toString((Integer.parseInt(descendString) - Integer.parseInt(accendString)));
		System.out.println(descendString + " - " + accendString + " = " + newNum);
		return newNum;
	}
}
