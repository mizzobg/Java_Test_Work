package Blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Normal {
	BlackJack b= new BlackJack();
	@Test
	public void  test1() {
		assertEquals("2 valid values 10,12",12,b.play(10,12));
	}
	@Test
	public void  test2() {
		assertEquals("2 valid values 12,10",12,b.play(12,10));
	}
	
}
