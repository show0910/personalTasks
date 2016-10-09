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
		
		//attackValid���� 1�̸� ���� �� �� �ִ�. 
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

			// ù Deck Draw(5��)
			myHandCard = cf.deckDraw(5, myHandCard, myDeck);
			yourHandCard = cf.deckDraw(5, yourHandCard, yourDeck);

			
			
			while (1 == 1) {

				//Unit ����
				returnValue = pn.pageTwo(turn, myHero, yourHero, myDeck,
						yourDeck, myHandCard, yourHandCard, myField, yourField);

				if (returnValue == 1) { //Unit �Ǵ� Hero ����
					victory = pn.pageThree(turn, myHero, yourHero, myField, yourField, attackValid);
				
					if ( victory == 1 || victory == 2) {
						break;
					}
					
				} else if (returnValue == 2) { //Card ��ȯ
					victory = pn.pageFour(turn, myHero, yourHero, myHandCard, yourHandCard, myField, yourField, attackValid);
					
					if ( victory == 1 || victory == 2) {
						break;
					}
					
				} else if (returnValue == 3) { //�ڵ�ī�� ����
					
					turnValid = turn % 2;
					
					if ( turnValid == 1 ) {
						pn.pageFive(myHandCard, myDeck);
						
						myHandCard = cf.deckDraw(5, myHandCard, myDeck);
						
					} else if ( turnValid == 0) {
						pn.pageFive(yourHandCard, yourDeck);
						
						yourHandCard = cf.deckDraw(5, yourHandCard, yourDeck);
					}
					
					continue;
					
				} else if (returnValue == 4) { //Turn ����
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
						
						//attackValid���� 1�̸� ���� �� �� �ִ�. 
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
						//attackValid���� 1�̸� ���� �� �� �ִ�. 
						for(int i = 0 ; i < 5 ; i++) {
							attackValid[i] = 1; 
						}
					}
					
					continue;
				} else if (returnValue == 5) { //�׺� ����
					turnValid = turn % 2;
					
					if ( turnValid == 1 ) {
						System.out.println("�׺��� �����߽��ϴ�. �й��Ͽ����ϴ�...");	
					} else if ( turnValid == 0 ){
						System.out.println("������� �׺��� �����߽��ϴ�. �¸��Ͽ����ϴ�!!!");
					}
					
					break;
				}
			}
		}
	}
}
