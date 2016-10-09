package thirdTask;

import java.util.ArrayList;

public class planet_war {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		commonFunction cf = new commonFunction();
		pageNum pn = new pageNum();
		int returnValue = 0;
		int myHeroNum = 0;
		int yourHeroNum = 0;
		int turn = 1;
		int victory = 0;
		int turnValid = 0;
		int mana = 0;
		// Hero
		ArrayList myDeck = new ArrayList();
		ArrayList yourDeck = new ArrayList();
		ArrayList myHandCard = new ArrayList();
		ArrayList yourHandCard = new ArrayList();
		ArrayList myField = new ArrayList();
		ArrayList yourField = new ArrayList();
		int[] attackValid = new int[5];
		
		//attackValid값이 1이면 공격 할 수 있다. 
		for(int i = 0 ; i < 5 ; i++) {
			attackValid[i] = 1; 
		}
		
		while (1 == 1) {
			
			myDeck.clear();
			yourDeck.clear();
			myHandCard.clear();
			yourHandCard.clear();
			myField.clear();
			yourField.clear();
			
			// 1:human 2:demon
			myHeroNum = pn.onePage();

			if (myHeroNum == 1) {
				yourHeroNum = 2;
			} else if (myHeroNum == 2) {
				yourHeroNum = 1;
			}

			hero myHero = new hero(myHeroNum);
			hero yourHero = new hero(yourHeroNum);

			// Deck Shuffle
			myDeck = cf.deckShuffle(myHeroNum, myDeck);
			yourDeck = cf.deckShuffle(yourHeroNum, yourDeck);

			// 첫 Deck Draw(5장)
			myHandCard = cf.deckDraw(5, myHandCard, myDeck);
			yourHandCard = cf.deckDraw(5, yourHandCard, yourDeck);

			
			
			while (1 == 1) {

				//Unit 공격
				returnValue = pn.pageTwo(turn, myHero, yourHero, myDeck,
						yourDeck, myHandCard, yourHandCard, myField, yourField);

				if (returnValue == 1) { //Unit 또는 Hero 공격
					victory = pn.pageThree(turn, myHero, yourHero, myField, yourField, attackValid);
				
					if ( victory == 1 || victory == 2) {
						break;
					}
					
				} else if (returnValue == 2) { //Card 소환
					victory = pn.pageFour(turn, myHero, yourHero, myHandCard, yourHandCard, myField, yourField, attackValid);
					
					if ( victory == 1 || victory == 2) {
						break;
					}
					
				} else if (returnValue == 3) { //핸드카드 셔플
					
					turnValid = turn % 2;
					
					if ( turnValid == 1 ) {
						pn.pageFive(myHandCard, myDeck);
						
						myHandCard = cf.deckDraw(5, myHandCard, myDeck);
						
					} else if ( turnValid == 0) {
						pn.pageFive(yourHandCard, yourDeck);
						
						yourHandCard = cf.deckDraw(5, yourHandCard, yourDeck);
					}
					
					continue;
					
				} else if (returnValue == 4) { //Turn 종료
					turn++;
					
					turnValid = turn % 2;
					
					if ( turnValid == 1 ) {
						if ( myHandCard.size() < 5) {
							myHandCard = cf.deckDraw(5-myHandCard.size(), myHandCard, myDeck);
						}
						mana = (turn+1)/2;
						
						if ( mana > 10 ) {
							mana = 10;
						}
						
						myHero.setMana(mana);
						
						//attackValid값이 1이면 공격 할 수 있다. 
						for(int i = 0 ; i < 5 ; i++) {
							attackValid[i] = 1; 
						}
						
					} else if ( turnValid == 0 ) {
						
						if ( yourHandCard.size() < 5) {
							yourHandCard = cf.deckDraw(5-yourHandCard.size(), yourHandCard, yourDeck);
						}
						mana = (turn+1)/2;
						
						if ( mana > 10 ) {
							mana = 10;
						}
						
						yourHero.setMana(mana);
						//attackValid값이 1이면 공격 할 수 있다. 
						for(int i = 0 ; i < 5 ; i++) {
							attackValid[i] = 1; 
						}
					}
					
					continue;
				} else if (returnValue == 5) { //항복 선언
					turnValid = turn % 2;
					
					if ( turnValid == 1 ) {
						System.out.println("항복을 선언했습니다. 패배하였습니다...");	
					} else if ( turnValid == 0 ){
						System.out.println("상대편이 항복을 선언했습니다. 승리하였습니다!!!");
					}
					
					break;
				}
			}
		}
	}
}
