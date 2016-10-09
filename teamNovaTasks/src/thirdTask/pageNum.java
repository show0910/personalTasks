package thirdTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pageNum {

	Scanner scan = new Scanner(System.in);
	int num;
	
	// Main Menu
	public int onePage() {
		
		while (1 == 1) {

			System.out.println("******************************");
			System.out.println("**********Card Game***********");
			System.out.println("******************************");
			System.out.println("****원하는 종족 선택**********");
			System.out.println("****1. Human      ************");
			System.out.println("****2. Demon      ************");
			System.out.println("****3. Game Exit  ************");
			System.out.println("******************************");
			System.out.println("******************************");

			num = scan.nextInt();

			if (num == 1 || num == 2) {
				break;
			} else if (num == 3) {
				System.exit(0);
			}
		}

		return num;
	}

	public int pageTwo(int turn, hero myHero, hero yourHero, ArrayList myDeck,
			ArrayList yourDeck, ArrayList myHandCard, ArrayList yourHandCard,
			ArrayList myField, ArrayList yourField) {

		int turnValid = turn % 2;
		int yourLife = yourHero.getLife();
		int myLife = myHero.getLife();
		String yourFieldName1 = "Empty";
		String yourFieldName2 = "Empty";
		String yourFieldName3 = "Empty";
		String yourFieldName4 = "Empty";
		String myFieldName1 = "Empty";
		String myFieldName2 = "Empty";
		String myFieldName3 = "Empty";
		String myFieldName4 = "Empty";
		int myFieldAttack1 = 0;
		int myFieldAttack2 = 0;
		int myFieldAttack3 = 0;
		int myFieldAttack4 = 0;
		int yourFieldAttack1 = 0;
		int yourFieldAttack2 = 0;
		int yourFieldAttack3 = 0;
		int yourFieldAttack4 = 0;
		int myFieldHealth1 = 0;
		int myFieldHealth2 = 0;
		int myFieldHealth3 = 0;
		int myFieldHealth4 = 0;
		int yourFieldHealth1 = 0;
		int yourFieldHealth2 = 0;
		int yourFieldHealth3 = 0;
		int yourFieldHealth4 = 0;
		String handCardName1 = "Empty";
		String handCardName2 = "Empty";
		String handCardName3 = "Empty";
		String handCardName4 = "Empty";
		String handCardName5 = "Empty";
		int consumeMana1 = 0;
		int consumeMana2 = 0;
		int consumeMana3 = 0;
		int consumeMana4 = 0;
		int consumeMana5 = 0;
		int mana = 0;
		int onlyTurn = (turn + 1) / 2;

		
		// 내 필드와 상대방 필드 세팅, 없으면 Empty로

		if (yourField.size() > 0) {
			unit yourField1 = (unit) yourField.get(0);
			yourFieldName1 = yourField1.getName();
			yourFieldAttack1 = yourField1.getAttack();
			yourFieldHealth1 = yourField1.getHealth();
		}

		if (yourField.size() > 1) {
			unit yourField2 = (unit) yourField.get(1);
			yourFieldName2 = yourField2.getName();
			yourFieldAttack2 = yourField2.getAttack();
			yourFieldHealth2 = yourField2.getHealth();
		}

		if (yourField.size() > 2) {
			unit yourField3 = (unit) yourField.get(2);
			yourFieldName3 = yourField3.getName();	
			yourFieldAttack3 = yourField3.getAttack();
			yourFieldHealth3 = yourField3.getHealth();
			
		}

		if (yourField.size() > 3) {
			unit yourField4 = (unit) yourField.get(3);
			yourFieldName4 = yourField4.getName();
			yourFieldAttack4 = yourField4.getAttack();
			yourFieldHealth4 = yourField4.getHealth();
			
		}

		if (myField.size() > 0) {
			unit myField1 = (unit) myField.get(0);
			myFieldName1 = myField1.getName();
			myFieldAttack1 = myField1.getAttack();
			myFieldHealth1 = myField1.getHealth();
		}

		if (myField.size() > 1) {
			unit myField2 = (unit) myField.get(1);
			myFieldName2 = myField2.getName();
			myFieldAttack2 = myField2.getAttack();
			myFieldHealth2 = myField2.getHealth();
		}

		if (myField.size() > 2) {
			unit myField3 = (unit) myField.get(2);
			myFieldName3 = myField3.getName();
			myFieldAttack3 = myField3.getAttack();
			myFieldHealth3 = myField3.getHealth();
		}

		if (myField.size() > 3) {
			unit myField4 = (unit) myField.get(3);
			myFieldName4 = myField4.getName();
			myFieldAttack4 = myField4.getAttack();
			myFieldHealth4 = myField4.getHealth();
		}

		
		
		if (turnValid == 1) { // 내 턴

			mana = myHero.getMana();
			
			// 내 hand 카드 Setting

			if (myHandCard.size() > 0) {
				String name = (myHandCard.get(0).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard1 = (card) myHandCard.get(0);
					handCardName1 = handCard1.getName();
					consumeMana1 = handCard1.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard1 = (spell) myHandCard.get(0);
					handCardName1 = handCard1.getName();
					consumeMana1 = handCard1.getConsumeMana();
				}
			}
			

			if (myHandCard.size() > 1) {
				String name = (myHandCard.get(1).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard2 = (card) myHandCard.get(1);
					handCardName2 = handCard2.getName();
					consumeMana2 = handCard2.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard2 = (spell) myHandCard.get(1);
					handCardName2 = handCard2.getName();
					consumeMana2 = handCard2.getConsumeMana();
				}
			}

			if (myHandCard.size() > 2) {
				String name = (myHandCard.get(2).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard3 = (card) myHandCard.get(2);
					handCardName3 = handCard3.getName();
					consumeMana3 = handCard3.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard3 = (spell) myHandCard.get(2);
					handCardName3 = handCard3.getName();
					consumeMana3 = handCard3.getConsumeMana();
				}
			}
			
			if (myHandCard.size() > 3) {
				String name = (myHandCard.get(3).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard4 = (card) myHandCard.get(3);
					handCardName4 = handCard4.getName();
					consumeMana4 = handCard4.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard4 = (spell) myHandCard.get(3);
					handCardName4 = handCard4.getName();
					consumeMana4 = handCard4.getConsumeMana();
				}
			}
			
			if (myHandCard.size() > 4) {
				String name = (myHandCard.get(4).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard5 = (card) myHandCard.get(4);
					handCardName5 = handCard5.getName();
					consumeMana5 = handCard5.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard5 = (spell) myHandCard.get(4);
					handCardName5 = handCard5.getName();
					consumeMana5 = handCard5.getConsumeMana();
				}
			}
			
			while ( 1==1 ) {
			
				System.out.println("******************************************************************************");
				System.out.println("******** Turn : "+ turn + "    Mana : " + mana + "    아군 Life : "+ myLife);
				System.out.println("******************************************************************************");
				System.out.println("******** 적군 Life                                    ");
				System.out.println("******** │1."+ yourLife + "│");
				System.out.println("********                                                             ");
				System.out.println("******** 적군 Unit                                                            ");
				System.out.println("******** │2."+yourFieldName1+" "+yourFieldAttack1+"/"+yourFieldHealth1+"││3."+ yourFieldName2+" "+yourFieldAttack2+"/"+yourFieldHealth2 + "││4." + yourFieldName3+" "+yourFieldAttack3+"/"+yourFieldHealth3+"││5."+ yourFieldName4 +" "+yourFieldAttack4+"/"+yourFieldHealth4+ "│");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 아군 Unit                                                            ");
				System.out.println("******** │6."+myFieldName1+" "+myFieldAttack1+"/"+myFieldHealth1+"││7."+ myFieldName2+" "+myFieldAttack2+"/"+myFieldHealth2 + "││8." + myFieldName3+" "+myFieldAttack3+"/"+myFieldHealth3+"││9."+ myFieldName4 +" "+myFieldAttack4+"/"+myFieldHealth4+ "│");
				System.out.println("********                                                             ");
				System.out.println("********                                                             ");
				System.out.println("******** 아군 핸드 Card                                                            ");
				System.out.println("******** │10."+handCardName1+"/"+consumeMana1+"││11."+handCardName2+"/"+consumeMana2+"││12."+handCardName3+"/"+consumeMana3+"││13."+handCardName4+"/"+consumeMana4+"││14."+handCardName5+"/"+consumeMana5+"│");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 1. 소환된 유닛으로 공격                  ****************************");
				System.out.println("******** 2. 마법 공격 또는 유닛 소환              ****************************");
				System.out.println("******** 3. 핸드카드 셔플                         ****************************");
				System.out.println("******** 4. 턴   종료                             ****************************");
				System.out.println("******** 5. 항     복                             ****************************");
				System.out.println("******************************************************************************");
	
				num = scan.nextInt();
	
				if ( num == 1 || num == 2 || num == 3|| num == 4 || num ==5 ) {
					break;
				}
			
			}
		} else if (turnValid == 0) { // 상대 턴
			
			mana = yourHero.getMana();
			
			// 내 hand 카드 Setting

			if (yourHandCard.size() > 0) {
				String name = (yourHandCard.get(0).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard1 = (card) yourHandCard.get(0);
					handCardName1 = handCard1.getName();
					consumeMana1 = handCard1.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard1 = (spell) yourHandCard.get(0);
					handCardName1 = handCard1.getName();
					consumeMana1 = handCard1.getConsumeMana();
				}
			}
			

			if (yourHandCard.size() > 1) {
				String name = (yourHandCard.get(1).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard2 = (card) yourHandCard.get(1);
					handCardName2 = handCard2.getName();
					consumeMana2 = handCard2.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard2 = (spell) yourHandCard.get(1);
					handCardName2 = handCard2.getName();
					consumeMana2 = handCard2.getConsumeMana();
				}
			}

			if (yourHandCard.size() > 2) {
				String name = (yourHandCard.get(2).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard3 = (card) yourHandCard.get(2);
					handCardName3 = handCard3.getName();
					consumeMana3 = handCard3.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard3 = (spell) yourHandCard.get(2);
					handCardName3 = handCard3.getName();
					consumeMana3 = handCard3.getConsumeMana();
				}
			}
			
			if (yourHandCard.size() > 3) {
				String name = (yourHandCard.get(3).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard4 = (card) yourHandCard.get(3);
					handCardName4 = handCard4.getName();
					consumeMana4 = handCard4.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard4 = (spell) yourHandCard.get(3);
					handCardName4 = handCard4.getName();
					consumeMana4 = handCard4.getConsumeMana();
				}
			}
			
			if (yourHandCard.size() > 4) {
				String name = (yourHandCard.get(4).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					card handCard5 = (card) yourHandCard.get(4);
					handCardName5 = handCard5.getName();
					consumeMana5 = handCard5.getConsumeMana();
				} else if (name.equals("spell")) {
					card handCard5 = (spell) yourHandCard.get(4);
					handCardName5 = handCard5.getName();
					consumeMana5 = handCard5.getConsumeMana();
				}
			}

			while(1 == 1) {
			
				System.out.println("******************************************************************************");
				System.out.println("******** Turn : "+ turn + "    Mana : " + mana + "    아군 Life : "+ yourLife);
				System.out.println("******************************************************************************");
				System.out.println("******** 적군 Life                                    ");
				System.out.println("******** │1."+ myLife + "│");
				System.out.println("********                                                             ");
				System.out.println("******** 적군 Unit                                                            ");
				System.out.println("******** │2."+myFieldName1+" "+myFieldAttack1+"/"+myFieldHealth1+"││3."+ myFieldName2+" "+myFieldAttack2+"/"+myFieldHealth2 + "││4." + myFieldName3+" "+myFieldAttack3+"/"+myFieldHealth3+"││5."+ myFieldName4 +" "+myFieldAttack4+"/"+myFieldHealth4+ "│");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 아군 Unit                                                            ");
				System.out.println("******** │6."+yourFieldName1+" "+yourFieldAttack1+"/"+yourFieldHealth1+"││7."+ yourFieldName2+" "+yourFieldAttack2+"/"+yourFieldHealth2 + "││8." + yourFieldName3+" "+yourFieldAttack3+"/"+yourFieldHealth3+"││9."+ yourFieldName4 +" "+yourFieldAttack4+"/"+yourFieldHealth4+ "│");
				System.out.println("********                                                             ");
				System.out.println("********                                                             ");
				System.out.println("******** 아군 핸드 Card                                                            ");
				System.out.println("******** │10."+handCardName1+"/"+consumeMana1+"││11."+handCardName2+"/"+consumeMana2+"││12."+handCardName3+"/"+consumeMana3+"││13."+handCardName4+"/"+consumeMana4+"││14."+handCardName5+"/"+consumeMana5+"│");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 1. 소환된 유닛으로 공격                  ****************************");
				System.out.println("******** 2. 마법 공격 또는 유닛 소환              ****************************");
				System.out.println("******** 3. 핸드카드 셔플                         ****************************");
				System.out.println("******** 4. 턴   종료                             ****************************");
				System.out.println("******** 5. 항     복                             ****************************");
				System.out.println("******************************************************************************");
	
				num = scan.nextInt();
				if ( num == 1 || num == 2 || num == 3|| num == 4 || num ==5 ) {
					break;
				}
		
			}
		}

		return num;

	}
	
	// 소환된 유닛으로 공격
	public int pageThree(int turn, hero myHero, hero yourHero, ArrayList myField, ArrayList yourField, int[] attackValid) {
		
		int attackerNum = 0;
		int targetNum = 0;
		int turnValid = turn % 2;
		int myHeroLife = 0;
		int yourHeroLife = 0;
		int targetHealth = 0;
		int attackerHealth = 0 ;
		int victory = 0; // 0이면 계속, 1이면 승리, 2이면 패배
		
		if ( turnValid == 1) {
			
			if ( myField.isEmpty()) {
				System.out.println("** 필드에 소환된 유닛이 없습니다.   *******************");
				return victory;
			}
			
			while(1==1) {
				System.out.println("** 몇번 필드 유닛을 선택하시겠습니까?(6 ~ 9) / 0번 선택시 메인화면으로 이동  *******************");
				
				attackerNum = scan.nextInt();
				
				if ( attackerNum == 0) {
					return victory;
				}
				
				if ( !(attackerNum == 6 || attackerNum == 7 || attackerNum == 8 || attackerNum == 9)) {
					System.out.println("6 ~ 9를 입력해주세요");
					continue;
				}

				attackerNum = attackerNum - 6;
				
				if (!(attackerNum < myField.size())) {
					System.out.println("** Unit이 있는 필드를 선택해 주세요. 다시 선택해주세요.   *******************");
					continue;
				}
				
				if(attackValid[attackerNum] == 0){
					System.out.println("** Unit이 공격 할 수 없는 상태입니다. 다시 선택해 주세요.   *******************");
					continue;
				}
				
				break;
			}
			
			
			while(1==1) {
				System.out.println("** 어떤 대상을 공격하시겠습니까?(1 ~ 5)  / 0번 선택시 메인 화면으로 이동      ********************");
				
				targetNum = scan.nextInt();
				
				if ( targetNum == 0) {
					return victory;
				}
				
				if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
					System.out.println("1 ~ 5를 입력해주세요");
					continue;
				}
				
				targetNum = targetNum-2;
				
				if ( targetNum < yourField.size()) {
					break;
				}
				
				System.out.println("** 공격할 대상이 없습니다. 다시 선택해주세요.    *******************");
			}
			
			unit attacker = (unit) myField.get(attackerNum);
			
			if ( targetNum == -1) {
				yourHeroLife = yourHero.getLife() - attacker.getAttack();
				
				if(yourHeroLife < 1) {
					System.out.println("상대방 영웅이 파괴되었습니다.");
					System.out.println("당신의 승리입니다.");
					return victory = 1;
				}
				yourHero.setLife(yourHeroLife);
				attackValid[attackerNum] = 0;
			} else {
				unit target = (unit) yourField.get(targetNum);
				
				targetHealth = target.getHealth() - attacker.getAttack();
				attackerHealth = attacker.getHealth() - target.getAttack();
				
				if(targetHealth < 1) {
					System.out.println("공격받은 유닛이 파괴되었습니다.");
					yourField.remove(targetNum);
				} else {
					target.setHealth(targetHealth);	
				}
				
				if(attackerHealth < 1) {
					System.out.println("공격한 유닛이 파괴되었습니다.");
					myField.remove(attackerNum);
					
					for(int i = attackerNum ; i < 3 ; i++) {
						attackValid[i] = attackValid[i+1];
					}
					
				} else {
					attacker.setHealth(attackerHealth);	
					attackValid[attackerNum] = 0;
				}
				
				
				
				return victory;
			}
		} else if ( turnValid == 0) {
			
			if ( yourField.isEmpty()) {
				System.out.println("** 필드에 소환된 유닛이 없습니다.   *******************");
				return victory;
			}
			
			while(1==1) {
				System.out.println("** 몇번 필드 유닛을 선택하시겠습니까?(6 ~ 9) / 0번 선택시 메인화면으로 이동  *******************");
				
				attackerNum = scan.nextInt();
				
				if ( attackerNum == 0) {
					return victory;
				}
				
				if ( !(attackerNum == 6 || attackerNum == 7 || attackerNum == 8 || attackerNum == 9)) {
					System.out.println("6 ~ 9를 입력해주세요");
					continue;
				}
				
				attackerNum = attackerNum - 6;

				if (!(attackerNum < yourField.size())) {
					System.out.println("** Unit이 있는 필드를 선택해 주세요. 다시 선택해주세요.   *******************");
					continue;
				}
				
				if(attackValid[attackerNum] == 0){
					System.out.println("** Unit이 공격 할 수 없는 상태입니다. 다시 선택해 주세요.   *******************");
					continue;
				}

				break;
				
			}
			
			
			while(1==1) {
				System.out.println("** 어떤 대상을 공격하시겠습니까?(1 ~ 5) / 0번 선택시 메인 화면으로 이동       ********************");
				
				targetNum = scan.nextInt();
				
				if ( targetNum == 0) {
					return victory;
				}
				
				if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
					System.out.println("1 ~ 5를 입력해주세요");
					continue;
				}
				
				targetNum = targetNum-2;
				
				if ( targetNum < myField.size()) {
					break;
				}
				
				System.out.println("** 공격할 대상이 없습니다. 다시 선택해주세요.    *******************");
			}
			
			unit attacker = (unit) yourField.get(attackerNum);
			
			if ( targetNum == -1) {
				myHeroLife = myHero.getLife() - attacker.getAttack();
				
				if(myHeroLife < 1) {
					System.out.println("당신의 영웅이 파괴되었습니다.");
					System.out.println("당신의 패배입니다.");
					return victory = 2;
				}
				myHero.setLife(myHeroLife);
				attackValid[attackerNum] = 0;
			} else {
				unit target = (unit) myField.get(targetNum);
				
				targetHealth = target.getHealth() - attacker.getAttack();
				attackerHealth = attacker.getHealth() - target.getAttack();
				
				if(targetHealth < 1) {
					System.out.println("공격받은 유닛이 파괴되었습니다.");
					myField.remove(targetNum);
				} else {
					target.setHealth(targetHealth);
				}
				
				if(attackerHealth < 1) {
					System.out.println("공격한 유닛이 파괴되었습니다.");
					yourField.remove(attackerNum);
					
					for(int i = attackerNum ; i < 3 ; i++) {
						attackValid[i] = attackValid[i+1];
					}
				} else {
					attacker.setHealth(attackerHealth);
					attackValid[attackerNum] = 0;
				}
				
				
				
				return victory;
			}
		}
		return victory;
	}
	
	//유닛 소환 및 마법 사용
	public int pageFour(int turn, hero myHero, hero yourHero, ArrayList myHandCard, 
			            ArrayList yourHandCard, ArrayList myField, ArrayList yourField, int[] attackValid) {
		
		int use = 0;
		int turnValid = turn % 2;
		int targetNum = 0;
		int myHeroLife = myHero.getLife();
		int yourHeroLife = yourHero.getLife();
		int targetHealth = 0;
		int victory = 0; //0 기본, 1 승리, 2 패배
		
		if ( turnValid == 1 ) { // 내 턴
		
			while ( 1 == 1 ) {
				
				System.out.println("핸드 카드 중 어떤 카드를 사용하시겠습니까? (10 ~ 14) / 0번 선택시 메인화면으로 이동");
				
				use = scan.nextInt();
				
				if ( use == 0) {
					return victory;
				}
				
				if ( !(use == 10 || use == 11|| use == 12|| use == 13|| use == 14)){
					System.out.println("10 ~ 14번을 선택해주세요.");
					continue;
				}
			
				use = use - 10;
				
				if ( use >= myHandCard.size()) {
					System.out.println("해당 핸드에 보유 중인 카드가 없습니다. 다시 선택해 주세요.");
					continue;
				}
				
				
				String name = (myHandCard.get(use).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					unit unit = (unit) myHandCard.get(use);
					
					if ( myField.size() == 4 ) {
						System.out.println("필드가 꽉 찼습니다.");
						break;
					}
					
					if( unit.getConsumeMana() > myHero.getMana()){
						System.out.println("마나가 부족합니다.");
						continue;
					}
					
					myHero.setMana(myHero.getMana()-unit.getConsumeMana());
					myField.add(unit);
					attackValid[myField.size()-1] = 0;
					myHandCard.remove(use);
					
					return victory;
					
				} else if (name.equals("spell")) {
					spell attackSpell = (spell) myHandCard.get(use);
					
					while ( 1==1 ) {
					
						System.out.println("** 어떤 대상을 공격하시겠습니까?(1 ~ 5)  // 0번 선택시 메인화면으로 이동      ********************");
						
						targetNum = scan.nextInt();
						
						if ( targetNum == 0) {
							return victory;
						}
						
						if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
							System.out.println("1 ~ 5를 입력해주세요");
							continue;
						}
						
						targetNum = targetNum-2;
						
						if ( targetNum < yourField.size()) {
							break;
						}
						
						System.out.println("** 공격할 대상이 없습니다. 다시 선택해주세요.    *******************");
					}
					
					if( attackSpell.getConsumeMana() > myHero.getMana()){
						System.out.println("마나가 부족합니다.");
						continue;
					}
					
					myHero.setMana(myHero.getMana()-attackSpell.getConsumeMana());
					
					myHandCard.remove(use);
					
					if ( targetNum == -1) {
						yourHeroLife = yourHeroLife - attackSpell.getDamage();
						
						if(yourHeroLife < 1) {
							System.out.println("상대의 영웅이 파괴되었습니다.");
							System.out.println("당신의 승리입니다.");
							return victory = 1;
						}
						yourHero.setLife(yourHeroLife);
						return victory;
					} else {
						unit target = (unit) yourField.get(targetNum);
						
						targetHealth = target.getHealth() - attackSpell.getDamage();
						
						if(targetHealth < -1) {
							System.out.println("공격받은 유닛이 파괴되었습니다.");
							yourField.remove(targetNum);
							return victory;
						}
						
						target.setHealth(targetHealth);
						
						return victory;
						
					}
				}
			}
		} else if ( turnValid == 0 ) { // 상대 턴
	
			while ( 1 == 1 ) {
				
				System.out.println("핸드 카드 중 어떤 카드를 사용하시겠습니까? (10 ~ 14) / 0번 선택시 메인화면으로 이동");
				
				use = scan.nextInt();
				
				if ( use == 0) {
					return victory;
				}
				
				if ( !(use == 10 || use == 11|| use == 12|| use == 13|| use == 14)){
					System.out.println("10 ~ 14번을 선택해주세요.");
					continue;
				}
			
				use = use - 10;
				
				//   4        5
				if ( use >= yourHandCard.size()) {
					System.out.println("해당 핸드에 보유 중인 카드가 없습니다. 다시 선택해 주세요.");
					continue;
				}
				
				String name = (yourHandCard.get(use).getClass().getName()).substring(10);
				if (name.equals("unit")) {
					unit unit = (unit) yourHandCard.get(use);
					
					if ( yourField.size() == 4 ) {
						System.out.println("필드가 꽉 찼습니다.");
						break;
					}
					
					if( unit.getConsumeMana() > yourHero.getMana()){
						System.out.println("마나가 부족합니다.");
						continue;
					}
					
					yourHero.setMana(yourHero.getMana()-unit.getConsumeMana());
					
					yourField.add(unit);
					attackValid[myField.size()-1] = 0;
					yourHandCard.remove(use);
					
					return victory;
				} else if (name.equals("spell")) {
					spell attackSpell = (spell) yourHandCard.get(use);
					
					while ( 1==1 ) {
					
						System.out.println("** 어떤 대상을 공격하시겠습니까?(1 ~ 5) // 0번 선택시 메인화면으로 이동       ********************");
						
						targetNum = scan.nextInt();
						
						if ( targetNum == 0) {
							return victory;
						}
						
						if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
							System.out.println("1 ~ 5를 입력해주세요");
							continue;
						}
						
						targetNum = targetNum-2;
						
						if ( targetNum < myField.size()) {
							break;
						}
						
						System.out.println("** 공격할 대상이 없습니다. 다시 선택해주세요.    *******************");
					}
					
					if( attackSpell.getConsumeMana() > yourHero.getMana()){
						System.out.println("마나가 부족합니다.");
						continue;
					}
					
					yourHero.setMana(yourHero.getMana()-attackSpell.getConsumeMana());
					
					yourHandCard.remove(use);
					
					
					
					if ( targetNum == -1) {
						myHeroLife = myHeroLife - attackSpell.getDamage();
						
						if(myHeroLife < 1) {
							System.out.println("당신의 영웅이 파괴되었습니다.");
							System.out.println("당신의 패배입니다.");
							return victory = 2;
						}
						myHero.setLife(myHeroLife);
						return victory;
					} else {
						unit target = (unit) yourField.get(targetNum);
						
						targetHealth = target.getHealth() - attackSpell.getDamage();
						
						if(targetHealth < -1) {
							System.out.println("공격받은 유닛이 파괴되었습니다.");
							yourField.remove(targetNum);
							return victory;
						}
						
						target.setHealth(targetHealth);
						
						return victory;
						
					}					
				}
			}
		}
		
		return victory;
	}
	
	public void pageFive(ArrayList handCard, ArrayList Deck){
		
		for ( int i = 0 ; i < handCard.size(); i++) {
			Deck.add(handCard.get(0));
			handCard.remove(0);
		}
		
		Collections.shuffle(Deck);
		
	}
	
}
