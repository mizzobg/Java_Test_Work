package Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Bust {
	BlackJack b= new BlackJack();
	@Test
	public void  test1() {
		assertEquals("1 valid 1 bust 10,22",10,b.play(10,22));
	}
	@Test
	public void  test2() {
		assertEquals("1 valid 1 bust 22,10",10,b.play(22,10));
	}
	@Test
	public void  test3() {
		assertEquals("1 invalid 1 valid 10,30",10,b.play(10,30));
	}
}
