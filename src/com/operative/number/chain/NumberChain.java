package com.operative.number.chain;

import java.util.Scanner;

public class NumberChain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int chainLength = ChainLengthOfNumber.obtainChainLength(num);
		System.out.println("Chain lenth of number : " + num + " is " + chainLength);
		in.close();
	}

}
