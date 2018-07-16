package com.operative.number.chain.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operative.number.chain.ChainLengthOfNumber;

public class ChainLengthOfNumberTest {

	@Test
	public void testObtainChainLength() {
		assertEquals(2, ChainLengthOfNumber.obtainChainLength(123456789));
		assertEquals(4, ChainLengthOfNumber.obtainChainLength(1234));
		assertEquals(2, ChainLengthOfNumber.obtainChainLength(444));
	}

}
