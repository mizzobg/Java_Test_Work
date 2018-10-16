package Blackjack;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class BlackJack2 {
	BlackJack b= new BlackJack();
@Parameters
	public static Collection<Object[]>data(){
	return Arrays.asList(new Object[][] {{0,-10,-10},{0,-10,10},{11,10,11},{0,10,32},{20,20,30}});
}
private int exp1;
private int play1;
private int deal1;
	public BlackJack2(int expected, int player, int dealer) {
		exp1 = expected;
		play1 = player;
		deal1 = dealer;
	}
@Test
public void test() {
	assertEquals(exp1,b.play(play1,deal1));
}
}
