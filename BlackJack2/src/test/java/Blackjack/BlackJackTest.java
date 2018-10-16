package Blackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackJackTest {
	BlackJack b= new BlackJack();
	static int cnt=1;
//	public void counter() {
//		int count=1;
//	}
	@BeforeClass
	public static void welcome() {
		System.out.println("Welcome to the TESTS");
		
	}
	@Before
	public void setup() {
		System.out.println("Test "+cnt+"/17");
	}
	@After
	public void teardown() {
		System.out.println("Test "+cnt+"/17 completed");
		cnt++;
	}
	@AfterClass
	public static void finish() {
		System.out.println("All test have been completed");
	}
	@Test
	public void  test1() {
		assertEquals("2 Invalid values -10,-10",0,b.play(-10,-10));
	}
	@Test
	public void  test2() {
		assertEquals("1 Invalid Value -10,10",0,b.play(-10,10));
	}
	@Test
	public void  test3() {
		assertEquals("1 invalid, 1 bust -10,30",0,b.play(-10,30));
	}
	@Test
	public void  test4() {
		assertEquals("2 invalid values -10,50",0,b.play(-10,50));
	}
	@Test
	public void  test5() {
		assertEquals("2 invalid values -10,0 ",0,b.play(-10,0));
	}
	@Test
	public void  test6() {
		assertEquals("2 valid values 10,12",12,b.play(10,12));
	}
	@Test
	public void  test7() {
		assertEquals("2 valid values 12,10",12,b.play(12,10));
	}
	@Test
	public void  test8() {
		assertEquals("1 valid 1 bust 10,22",10,b.play(10,22));
	}
	@Test
	public void  test9() {
		assertEquals("1 valid 1 bust 22,10",10,b.play(22,10));
	}
	@Test
	public void  test10() {
		assertEquals("1 invalid 1 bust 30,-10",0,b.play(30,-10));
	}
	@Test
	public void  test11() {
		assertEquals("1 bust , 1 invalid 30,50",0,b.play(30,50)); 
	}
	@Test
	public void  test12() {
		assertEquals("2 Invalid 50,-10",0,b.play(50,-10));
	}
	@Test
	public void  test13() {
		assertEquals("1 impossible 1 vaild 50,10",0,b.play(50,10));
	}
	@Test
	public void  test14() {
		assertEquals("1 bust, 1 impossible 50,30",0,b.play(50,30));
	}
	@Test
	public void  test15() {
		assertEquals("2 impossible 50,50",0,b.play(50,50));
	}
	@Test
	public void  test16() {
		assertEquals("1 Invalid 1 Bust 0,22",0,b.play(0,22));
	}
	@Test
	public void  test17() {
		assertEquals("1 invalid 1 valid 10,30",10,b.play(10,30));
	}
	

}
