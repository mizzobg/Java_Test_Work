package Blackjack;

public class BlackJack {
	
	public static void main (String args[]) {
		
	
	}
	
	public int play(int player, int dealer) {
		if (player >0 && player <32 && dealer >0 && dealer <32) {
			if (player <22 && dealer <22) {
				if(player>dealer){
					return player;
				}
				else {
					return dealer;
				}
			}
			else {
				if (player >21 && dealer <22) {
					return dealer;
				}
				if (player <22 && dealer >21) {
					return player;
				}
			}
		}
		return 0;
	}
}