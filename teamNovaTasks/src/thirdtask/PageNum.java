package thirdtask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PageNum {

    Scanner scan = new Scanner(System.in);
    int num;
    
    // Main Menu
    public int onePage() {
        
        while (1 == 1) {

            System.out.println("******************************");
            System.out.println("**********Card Game***********");
            System.out.println("******************************");
            System.out.println("****���ϴ� ���� ����**********");
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

    public int pageTwo(int turn, long startTime, Hero myHero, Hero yourHero, ArrayList myDeck,
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
        
        long endTime = System.currentTimeMillis();
		
		long lastTime = 180000 - (endTime - startTime); // 180000 = 3��
		long timeMin = lastTime / 60000;                // �� ���
		long timeSec = (lastTime - (timeMin * 60000)) / 1000;
        
        // �� �ʵ�� ���� �ʵ� ����, ������ Empty��

        if (yourField.size() > 0) {
            Unit yourField1 = (Unit) yourField.get(0);
            yourFieldName1 = yourField1.getName();
            yourFieldAttack1 = yourField1.getAttack();
            yourFieldHealth1 = yourField1.getHealth();
        }

        if (yourField.size() > 1) {
            Unit yourField2 = (Unit) yourField.get(1);
            yourFieldName2 = yourField2.getName();
            yourFieldAttack2 = yourField2.getAttack();
            yourFieldHealth2 = yourField2.getHealth();
        }

        if (yourField.size() > 2) {
            Unit yourField3 = (Unit) yourField.get(2);
            yourFieldName3 = yourField3.getName();    
            yourFieldAttack3 = yourField3.getAttack();
            yourFieldHealth3 = yourField3.getHealth();
            
        }

        if (yourField.size() > 3) {
            Unit yourField4 = (Unit) yourField.get(3);
            yourFieldName4 = yourField4.getName();
            yourFieldAttack4 = yourField4.getAttack();
            yourFieldHealth4 = yourField4.getHealth();
            
        }

        if (myField.size() > 0) {
            Unit myField1 = (Unit) myField.get(0);
            myFieldName1 = myField1.getName();
            myFieldAttack1 = myField1.getAttack();
            myFieldHealth1 = myField1.getHealth();
        }

        if (myField.size() > 1) {
            Unit myField2 = (Unit) myField.get(1);
            myFieldName2 = myField2.getName();
            myFieldAttack2 = myField2.getAttack();
            myFieldHealth2 = myField2.getHealth();
        }

        if (myField.size() > 2) {
            Unit myField3 = (Unit) myField.get(2);
            myFieldName3 = myField3.getName();
            myFieldAttack3 = myField3.getAttack();
            myFieldHealth3 = myField3.getHealth();
        }

        if (myField.size() > 3) {
            Unit myField4 = (Unit) myField.get(3);
            myFieldName4 = myField4.getName();
            myFieldAttack4 = myField4.getAttack();
            myFieldHealth4 = myField4.getHealth();
        }

        
        
        if (turnValid == 1) { // �� ��

        	myHero.setTurnInit(1);
            mana = myHero.getMana();
            
            // �� hand ī�� Setting

            if (myHandCard.size() > 0) {
                String name = (myHandCard.get(0).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard1 = (Card) myHandCard.get(0);
                    handCardName1 = handCard1.getName();
                    consumeMana1 = handCard1.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard1 = (Spell) myHandCard.get(0);
                    handCardName1 = handCard1.getName();
                    consumeMana1 = handCard1.getConsumeMana();
                }
            }
            

            if (myHandCard.size() > 1) {
                String name = (myHandCard.get(1).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard2 = (Card) myHandCard.get(1);
                    handCardName2 = handCard2.getName();
                    consumeMana2 = handCard2.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard2 = (Spell) myHandCard.get(1);
                    handCardName2 = handCard2.getName();
                    consumeMana2 = handCard2.getConsumeMana();
                }
            }

            if (myHandCard.size() > 2) {
                String name = (myHandCard.get(2).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard3 = (Card) myHandCard.get(2);
                    handCardName3 = handCard3.getName();
                    consumeMana3 = handCard3.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard3 = (Spell) myHandCard.get(2);
                    handCardName3 = handCard3.getName();
                    consumeMana3 = handCard3.getConsumeMana();
                }
            }
            
            if (myHandCard.size() > 3) {
                String name = (myHandCard.get(3).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard4 = (Card) myHandCard.get(3);
                    handCardName4 = handCard4.getName();
                    consumeMana4 = handCard4.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard4 = (Spell) myHandCard.get(3);
                    handCardName4 = handCard4.getName();
                    consumeMana4 = handCard4.getConsumeMana();
                }
            }
            
            if (myHandCard.size() > 4) {
                String name = (myHandCard.get(4).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard5 = (Card) myHandCard.get(4);
                    handCardName5 = handCard5.getName();
                    consumeMana5 = handCard5.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard5 = (Spell) myHandCard.get(4);
                    handCardName5 = handCard5.getName();
                    consumeMana5 = handCard5.getConsumeMana();
                }
            }
            
            while ( 1==1 ) {
            
            	System.out.println("******************************************************************************");
				System.out.println("******** Turn : "+ turn + "    Mana : " + mana + "    �Ʊ� Life : "+ myLife + "    ���� �ð�  : "+ timeMin +"�� " + timeSec + "��");
				System.out.println("******************************************************************************");
				System.out.println("******** ���� Life                                    ");
				System.out.println("******** ��1."+ yourLife + "��");
				System.out.println("********                                                             ");
				System.out.println("******** ���� Unit                                                            ");
				System.out.println("******** ��2."+yourFieldName1+" "+yourFieldAttack1+"/"+yourFieldHealth1+"����3."+ yourFieldName2+" "+yourFieldAttack2+"/"+yourFieldHealth2 + "����4." + yourFieldName3+" "+yourFieldAttack3+"/"+yourFieldHealth3+"����5."+ yourFieldName4 +" "+yourFieldAttack4+"/"+yourFieldHealth4+ "��");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** �Ʊ� Unit                                                            ");
				System.out.println("******** ��6."+myFieldName1+" "+myFieldAttack1+"/"+myFieldHealth1+"����7."+ myFieldName2+" "+myFieldAttack2+"/"+myFieldHealth2 + "����8." + myFieldName3+" "+myFieldAttack3+"/"+myFieldHealth3+"����9."+ myFieldName4 +" "+myFieldAttack4+"/"+myFieldHealth4+ "��");
				System.out.println("********                                                             ");
				System.out.println("********                                                             ");
				System.out.println("******** �Ʊ� �ڵ� Card                                                            ");
				System.out.println("******** ��10."+handCardName1+"/"+consumeMana1+"����11."+handCardName2+"/"+consumeMana2+"����12."+handCardName3+"/"+consumeMana3+"����13."+handCardName4+"/"+consumeMana4+"����14."+handCardName5+"/"+consumeMana5+"��");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 1. ��ȯ�� �������� ����                  ****************************");
				System.out.println("******** 2. ���� ���� �Ǵ� ���� ��ȯ              ****************************");
				System.out.println("******** 3. �ڵ�ī�� ����                         ****************************");
				System.out.println("******** 4. ��   ����                             ****************************");
				System.out.println("******** 5. ī�� ����                             ****************************");
				System.out.println("******** 6. ��     ��                             ****************************");
				System.out.println("******************************************************************************");
		    
                num = scan.nextInt();
    
                if ( lastTime < 1 ) {
					if ( num == 4 || num == 6) {
						break;
					}
					System.out.println("3���� �������ϴ�. �����Ḧ ���ּ���.");
				} else if ( lastTime > 0) {
					if ( num == 1 || num == 2 || num == 3|| num == 4 || num ==5 || num == 6) {
						break;
					}
				}
            
            }
        } else if (turnValid == 0) { // ��� ��
            
            mana = yourHero.getMana();
            yourHero.setTurnInit(1);
            
            // �� hand ī�� Setting

            if (yourHandCard.size() > 0) {
                String name = (yourHandCard.get(0).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard1 = (Card) yourHandCard.get(0);
                    handCardName1 = handCard1.getName();
                    consumeMana1 = handCard1.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard1 = (Spell) yourHandCard.get(0);
                    handCardName1 = handCard1.getName();
                    consumeMana1 = handCard1.getConsumeMana();
                }
            }
            

            if (yourHandCard.size() > 1) {
                String name = (yourHandCard.get(1).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard2 = (Card) yourHandCard.get(1);
                    handCardName2 = handCard2.getName();
                    consumeMana2 = handCard2.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard2 = (Spell) yourHandCard.get(1);
                    handCardName2 = handCard2.getName();
                    consumeMana2 = handCard2.getConsumeMana();
                }
            }

            if (yourHandCard.size() > 2) {
                String name = (yourHandCard.get(2).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard3 = (Card) yourHandCard.get(2);
                    handCardName3 = handCard3.getName();
                    consumeMana3 = handCard3.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard3 = (Spell) yourHandCard.get(2);
                    handCardName3 = handCard3.getName();
                    consumeMana3 = handCard3.getConsumeMana();
                }
            }
            
            if (yourHandCard.size() > 3) {
                String name = (yourHandCard.get(3).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard4 = (Card) yourHandCard.get(3);
                    handCardName4 = handCard4.getName();
                    consumeMana4 = handCard4.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard4 = (Spell) yourHandCard.get(3);
                    handCardName4 = handCard4.getName();
                    consumeMana4 = handCard4.getConsumeMana();
                }
            }
            
            if (yourHandCard.size() > 4) {
                String name = (yourHandCard.get(4).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Card handCard5 = (Card) yourHandCard.get(4);
                    handCardName5 = handCard5.getName();
                    consumeMana5 = handCard5.getConsumeMana();
                } else if (name.equals("Spell")) {
                    Card handCard5 = (Spell) yourHandCard.get(4);
                    handCardName5 = handCard5.getName();
                    consumeMana5 = handCard5.getConsumeMana();
                }
            }

            while(1 == 1) {

				System.out.println("******************************************************************************");
				System.out.println("******** Turn : "+ turn + "    Mana : " + mana + "    �Ʊ� Life : "+ yourLife + "    ���� �ð�  : "+ timeMin +"�� " + timeSec + "��");
				System.out.println("******************************************************************************");
				System.out.println("******** ���� Life                                    ");
				System.out.println("******** ��1."+ myLife + "��");
				System.out.println("********                                                             ");
				System.out.println("******** ���� Unit                                                            ");
				System.out.println("******** ��2."+myFieldName1+" "+myFieldAttack1+"/"+myFieldHealth1+"����3."+ myFieldName2+" "+myFieldAttack2+"/"+myFieldHealth2 + "����4." + myFieldName3+" "+myFieldAttack3+"/"+myFieldHealth3+"����5."+ myFieldName4 +" "+myFieldAttack4+"/"+myFieldHealth4+ "��");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** �Ʊ� Unit                                                            ");
				System.out.println("******** ��6."+yourFieldName1+" "+yourFieldAttack1+"/"+yourFieldHealth1+"����7."+ yourFieldName2+" "+yourFieldAttack2+"/"+yourFieldHealth2 + "����8." + yourFieldName3+" "+yourFieldAttack3+"/"+yourFieldHealth3+"����9."+ yourFieldName4 +" "+yourFieldAttack4+"/"+yourFieldHealth4+ "��");
				System.out.println("********                                                             ");
				System.out.println("********                                                             ");
				System.out.println("******** �Ʊ� �ڵ� Card                                                            ");
				System.out.println("******** ��10."+handCardName1+"/"+consumeMana1+"����11."+handCardName2+"/"+consumeMana2+"����12."+handCardName3+"/"+consumeMana3+"����13."+handCardName4+"/"+consumeMana4+"����14."+handCardName5+"/"+consumeMana5+"��");
				System.out.println("******************************************************************************");
				System.out.println("******************************************************************************");
				System.out.println("******** 1. ��ȯ�� �������� ����                  ****************************");
				System.out.println("******** 2. ���� ���� �Ǵ� ���� ��ȯ              ****************************");
				System.out.println("******** 3. �ڵ�ī�� ����                         ****************************");
				System.out.println("******** 4. ��   ����                             ****************************");
				System.out.println("******** 5. ī�� ����                             ****************************");
				System.out.println("******** 6. ��     ��                             ****************************");
				System.out.println("******************************************************************************");
	
				num = scan.nextInt();
				
				if ( lastTime < 1 ) {
					if ( num == 4 || num == 6) {
						break;
					}
					System.out.println("3���� �������ϴ�. �����Ḧ ���ּ���.");
				} else if ( lastTime > 0) {
					if ( num == 1 || num == 2 || num == 3|| num == 4 || num ==5 || num ==6) {
						break;
					}
				}
            }
        }
        return num;
    }
    
    // ��ȯ�� �������� ����
    public int pageThree(int turn, Hero myHero, Hero yourHero, ArrayList myField, ArrayList yourField, int[] attackValid) {
        
        int attackerNum = 0;
        int targetNum = 0;
        int turnValid = turn % 2;
        int myHeroLife = 0;
        int yourHeroLife = 0;
        int targetHealth = 0;
        int attackerHealth = 0 ;
        int victory = 0; // 0�̸� ���, 1�̸� �¸�, 2�̸� �й�
        
        if ( turnValid == 1) {
            
            if ( myField.isEmpty()) {
                System.out.println("** �ʵ忡 ��ȯ�� ������ �����ϴ�.   *******************");
                return victory;
            }
            
            while(1==1) {
                System.out.println("** ��� �ʵ� ������ �����Ͻðڽ��ϱ�?(6 ~ 9) / 0�� ���ý� ����ȭ������ �̵�  *******************");
                
                attackerNum = scan.nextInt();
                
                if ( attackerNum == 0) {
                    return victory;
                }
                
                if ( !(attackerNum == 6 || attackerNum == 7 || attackerNum == 8 || attackerNum == 9)) {
                    System.out.println("6 ~ 9�� �Է����ּ���");
                    continue;
                }

                attackerNum = attackerNum - 6;
                
                Unit attacker = (Unit) myField.get(attackerNum);
                
                if (!(attackerNum < myField.size())) {
                    System.out.println("** Unit�� �ִ� �ʵ带 ������ �ּ���. �ٽ� �������ּ���.   *******************");
                    continue;
                }
                
                if(attackValid[attackerNum] == 0){
                    System.out.println("** Unit�� ���� �� �� ���� �����Դϴ�. �ٽ� ������ �ּ���.   *******************");
                    continue;
                }
                
                if ( attacker.getNoActTurn() != 0) {
					System.out.println("�� ������ ��� �ֽ��ϴ�. �ٽ� ������ �ּ���.");
					continue;
				}
                
                break;
            }
            
            
            while(1==1) {
                System.out.println("** � ����� �����Ͻðڽ��ϱ�?(1 ~ 5)  / 0�� ���ý� ���� ȭ������ �̵�      ********************");
                
                targetNum = scan.nextInt();
                
                if ( targetNum == 0) {
                    return victory;
                }
                
                if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
                    System.out.println("1 ~ 5�� �Է����ּ���");
                    continue;
                }
                
                targetNum = targetNum-2;
                
                if ( targetNum < yourField.size()) {
                    break;
                }
                
                System.out.println("** ������ ����� �����ϴ�. �ٽ� �������ּ���.    *******************");
            }
            
            Unit attacker = (Unit) myField.get(attackerNum);
            
            if ( targetNum == -1) {
                yourHeroLife = yourHero.getLife() - attacker.getAttack();
                
                if(yourHeroLife < 1) {
                    System.out.println("���� ������ �ı��Ǿ����ϴ�.");
                    System.out.println("����� �¸��Դϴ�.");
                    return victory = 1;
                }
                yourHero.setLife(yourHeroLife);
                attackValid[attackerNum] = 0;
            } else {
                Unit target = (Unit) yourField.get(targetNum);
                
                targetHealth = target.getHealth() - attacker.getAttack();
                attackerHealth = attacker.getHealth() - target.getAttack();
                
                if(targetHealth < 1) {
                    System.out.println("���ݹ��� ������ �ı��Ǿ����ϴ�.");
                    yourField.remove(targetNum);
                } else {
                    target.setHealth(targetHealth);    
                }
                
                if(attackerHealth < 1) {
                    System.out.println("������ ������ �ı��Ǿ����ϴ�.");
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
                System.out.println("** �ʵ忡 ��ȯ�� ������ �����ϴ�.   *******************");
                return victory;
            }
            
            while(1==1) {
                System.out.println("** ��� �ʵ� ������ �����Ͻðڽ��ϱ�?(6 ~ 9) / 0�� ���ý� ����ȭ������ �̵�  *******************");
                
                attackerNum = scan.nextInt();
                
                if ( attackerNum == 0) {
                    return victory;
                }
                
                if ( !(attackerNum == 6 || attackerNum == 7 || attackerNum == 8 || attackerNum == 9)) {
                    System.out.println("6 ~ 9�� �Է����ּ���");
                    continue;
                }
                
                attackerNum = attackerNum - 6;

                Unit attacker = (Unit) yourField.get(attackerNum);
                
                if (!(attackerNum < yourField.size())) {
                    System.out.println("** Unit�� �ִ� �ʵ带 ������ �ּ���. �ٽ� �������ּ���.   *******************");
                    continue;
                }
                
                if(attackValid[attackerNum] == 0){
                    System.out.println("** Unit�� ���� �� �� ���� �����Դϴ�. �ٽ� ������ �ּ���.   *******************");
                    continue;
                }

                if ( attacker.getNoActTurn() != 0) {
					System.out.println("�� ������ ��� �ֽ��ϴ�. �ٽ� ������ �ּ���.");
					continue;
				}
                
                break;
                
            }
            
            
            while(1==1) {
                System.out.println("** � ����� �����Ͻðڽ��ϱ�?(1 ~ 5) / 0�� ���ý� ���� ȭ������ �̵�       ********************");
                
                targetNum = scan.nextInt();
                
                if ( targetNum == 0) {
                    return victory;
                }
                
                if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
                    System.out.println("1 ~ 5�� �Է����ּ���");
                    continue;
                }
                
                targetNum = targetNum-2;
                
                if ( targetNum < myField.size()) {
                    break;
                }
                
                System.out.println("** ������ ����� �����ϴ�. �ٽ� �������ּ���.    *******************");
            }
            
            Unit attacker = (Unit) yourField.get(attackerNum);
            
            if ( targetNum == -1) {
                myHeroLife = myHero.getLife() - attacker.getAttack();
                
                if(myHeroLife < 1) {
                    System.out.println("����� ������ �ı��Ǿ����ϴ�.");
                    System.out.println("����� �й��Դϴ�.");
                    return victory = 2;
                }
                myHero.setLife(myHeroLife);
                attackValid[attackerNum] = 0;
            } else {
                Unit target = (Unit) myField.get(targetNum);
                
                targetHealth = target.getHealth() - attacker.getAttack();
                attackerHealth = attacker.getHealth() - target.getAttack();
                
                if(targetHealth < 1) {
                    System.out.println("���ݹ��� ������ �ı��Ǿ����ϴ�.");
                    myField.remove(targetNum);
                } else {
                    target.setHealth(targetHealth);
                }
                
                if(attackerHealth < 1) {
                    System.out.println("������ ������ �ı��Ǿ����ϴ�.");
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
    
    //���� ��ȯ �� ���� ���
    public int pageFour(int turn, Hero myHero, Hero yourHero, ArrayList myHandCard, 
                        ArrayList yourHandCard, ArrayList myField, ArrayList yourField, int[] attackValid) {
        
        int use = 0;
        int turnValid = turn % 2;
        int targetNum = 0;
        int myHeroLife = myHero.getLife();
        int yourHeroLife = yourHero.getLife();
        int targetHealth = 0;
        int victory = 0; //0 �⺻, 1 �¸�, 2 �й�
        
        if ( turnValid == 1 ) { // �� ��
        
            while ( 1 == 1 ) {
                
                System.out.println("�ڵ� ī�� �� � ī�带 ����Ͻðڽ��ϱ�? (10 ~ 14) / 0�� ���ý� ����ȭ������ �̵�");
                
                use = scan.nextInt();
                
                if ( use == 0) {
                    return victory;
                }
                
                if ( !(use == 10 || use == 11|| use == 12|| use == 13|| use == 14)){
                    System.out.println("10 ~ 14���� �������ּ���.");
                    continue;
                }
            
                use = use - 10;
                
                if ( use >= myHandCard.size()) {
                    System.out.println("�ش� �ڵ忡 ���� ���� ī�尡 �����ϴ�. �ٽ� ������ �ּ���.");
                    continue;
                }
                
                
                String name = (myHandCard.get(use).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Unit unit = (Unit) myHandCard.get(use);
                    
                    if ( myField.size() == 4 ) {
                        System.out.println("�ʵ尡 �� á���ϴ�.");
                        break;
                    }
                    
                    if( unit.getConsumeMana() > myHero.getMana()){
                        System.out.println("������ �����մϴ�.");
                        continue;
                    }
                    
                    myHero.setMana(myHero.getMana()-unit.getConsumeMana());
                    myField.add(unit);
                    
                    if ( unit.getSpecAbility() != 1) { //���� 
                    	attackValid[myField.size()-1] = 0;
                    }
                    myHandCard.remove(use);
                    
                    return victory;
                    
                } else if (name.equals("Spell")) {
                    Spell attackSpell = (Spell) myHandCard.get(use);
                    
                    if(attackSpell.getAbilityNum()==1 || attackSpell.getAbilityNum()==3) { //Damage �ִ� Spell
                    	
                    	while ( 1==1 ) {
                            
                            System.out.println("** � ����� �����Ͻðڽ��ϱ�?(1 ~ 5)  // 0�� ���ý� ����ȭ������ �̵�      ********************");
                            
                            targetNum = scan.nextInt();
                            
                            if ( targetNum == 0) {
                                return victory;
                            }
                            
                            if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
                                System.out.println("1 ~ 5�� �Է����ּ���");
                                continue;
                            }
                            
                            targetNum = targetNum-2;
                            
                            if ( targetNum < yourField.size()) {
                                break;
                            }
                            
                            System.out.println("** ������ ����� �����ϴ�. �ٽ� �������ּ���.    *******************");
                        }
                        
                        if( attackSpell.getConsumeMana() > myHero.getMana()){
                            System.out.println("������ �����մϴ�.");
                            continue;
                        }
                        
                        myHero.setMana(myHero.getMana()-attackSpell.getConsumeMana());
                        
                        myHandCard.remove(use);
                        
                        if ( targetNum == -1) {
                            yourHeroLife = yourHeroLife - attackSpell.getDamage();
                            
                            if(yourHeroLife < 1) {
                                System.out.println("����� ������ �ı��Ǿ����ϴ�.");
                                System.out.println("����� �¸��Դϴ�.");
                                return victory = 1;
                            }
                            yourHero.setLife(yourHeroLife);
                            return victory;
                        } else {
                            Unit target = (Unit) yourField.get(targetNum);
                            
                            targetHealth = target.getHealth() - attackSpell.getDamage();
                            
                            if(targetHealth < 1) {
                                System.out.println("���ݹ��� ������ �ı��Ǿ����ϴ�.");
                                yourField.remove(targetNum);
                                return victory;
                            }
                            
                            target.setHealth(targetHealth);
                            
                            return victory;
                            
                        }
                    	
                    }else if ( attackSpell.getAbilityNum() == 2 || attackSpell.getAbilityNum() == 4) { //���� ������Ű�� Spell
						
						while ( 1==1 ) {
							
							System.out.println("** � ����� �����Ͻðڽ��ϱ�?(2 ~ 5)  // 0�� ���ý� ����ȭ������ �̵�      ********************");
							
							targetNum = scan.nextInt();
							
							if ( targetNum == 0) {
								return victory;
							}
							
							if ( !(targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
								System.out.println("2 ~ 5�� �Է����ּ���");
								continue;
							}
							
							targetNum = targetNum-2;
							
							if ( targetNum < yourField.size()) {
								break;
							}
							
							System.out.println("** ������ ����� �����ϴ�. �ٽ� �������ּ���.    *******************");
						}
						
						if( attackSpell.getConsumeMana() > myHero.getMana()){
							System.out.println("������ �����մϴ�.");
							continue;
						}
						
						myHero.setMana(myHero.getMana()-attackSpell.getConsumeMana());
						
						myHandCard.remove(use);
						
						if(attackSpell.getAbilityNum() == 2 ) {
						
							Unit target = (Unit) yourField.get(targetNum);
							
							target.setNoActTurn(2);
							
						} else if (attackSpell.getAbilityNum() == 4) {
							
							int size = yourField.size();
							
							for ( int i = 0 ; i < size; i++) {
							
								Unit target = (Unit) yourField.get(targetNum);
								
								target.setNoActTurn(1);
								
							}
							
						}
					}
				}
			}
        } else if ( turnValid == 0 ) { // ��� ��
    
            while ( 1 == 1 ) {
                
                System.out.println("�ڵ� ī�� �� � ī�带 ����Ͻðڽ��ϱ�? (10 ~ 14) / 0�� ���ý� ����ȭ������ �̵�");
                
                use = scan.nextInt();
                
                if ( use == 0) {
                    return victory;
                }
                
                if ( !(use == 10 || use == 11|| use == 12|| use == 13|| use == 14)){
                    System.out.println("10 ~ 14���� �������ּ���.");
                    continue;
                }
            
                use = use - 10;
                
                //   4        5
                if ( use >= yourHandCard.size()) {
                    System.out.println("�ش� �ڵ忡 ���� ���� ī�尡 �����ϴ�. �ٽ� ������ �ּ���.");
                    continue;
                }
                
                String name = (yourHandCard.get(use).getClass().getName()).substring(10);
                if (name.equals("Unit")) {
                    Unit unit = (Unit) yourHandCard.get(use);
                    
                    if ( yourField.size() == 4 ) {
                        System.out.println("�ʵ尡 �� á���ϴ�.");
                        break;
                    }
                    
                    if( unit.getConsumeMana() > yourHero.getMana()){
                        System.out.println("������ �����մϴ�.");
                        continue;
                    }
                    
                    yourHero.setMana(yourHero.getMana()-unit.getConsumeMana());
                    
                    yourField.add(unit);
                    if(unit.getSpecAbility() != 1) {
                    	attackValid[yourField.size()-1] = 0;	
                    }
                    yourHandCard.remove(use);
                    
                    return victory;
                } else if (name.equals("Spell")) {
                    Spell attackSpell = (Spell) yourHandCard.get(use);
                    
                    while ( 1==1 ) {
                    
                        System.out.println("** � ����� �����Ͻðڽ��ϱ�?(1 ~ 5) // 0�� ���ý� ����ȭ������ �̵�       ********************");
                        
                        targetNum = scan.nextInt();
                        
                        if ( targetNum == 0) {
                            return victory;
                        }
                        
                        if ( !(targetNum == 1 || targetNum == 2 || targetNum == 3 || targetNum == 4 || targetNum == 5)) {
                            System.out.println("1 ~ 5�� �Է����ּ���");
                            continue;
                        }
                        
                        targetNum = targetNum-2;
                        
                        if ( targetNum < myField.size()) {
                            break;
                        }
                        
                        System.out.println("** ������ ����� �����ϴ�. �ٽ� �������ּ���.    *******************");
                    }
                    
                    if( attackSpell.getConsumeMana() > yourHero.getMana()){
                        System.out.println("������ �����մϴ�.");
                        continue;
                    }
                    
                    yourHero.setMana(yourHero.getMana()-attackSpell.getConsumeMana());
                    
                    yourHandCard.remove(use);
                    
                    
                    
                    if ( targetNum == -1) {
                        myHeroLife = myHeroLife - attackSpell.getDamage();
                        
                        if(myHeroLife < 1) {
                            System.out.println("����� ������ �ı��Ǿ����ϴ�.");
                            System.out.println("����� �й��Դϴ�.");
                            return victory = 2;
                        }
                        myHero.setLife(myHeroLife);
                        return victory;
                    } else {
                        Unit target = (Unit) myField.get(targetNum);
                        
                        targetHealth = target.getHealth() - attackSpell.getDamage();
                        
                        if(targetHealth < 1) {
                            System.out.println("���ݹ��� ������ �ı��Ǿ����ϴ�.");
                            myField.remove(targetNum);
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
        
    	int size = handCard.size();
    	
        for ( int i = 0 ; i < size; i++) {
            Deck.add(handCard.get(0));
            handCard.remove(0);
        }
        
        Collections.shuffle(Deck);
        
    }
    
    public void pageSix(int num, ArrayList list) {
    	
    	if ( !(list.size() > num)) {
    		System.out.println("�ش� ��ȣ���� ī�尡 �����ϴ�.");
    		return;
    	}
    	
    	String name = (list.get(num).getClass().getName()).substring(10);
    	
    	if (name.equals("Unit")){
    		Unit unit = (Unit) list.get(num);
    		String specAbil = null;
    		
    		if ( unit.getSpecAbility() == 0) {
    			specAbil = "����";
    		} else if ( unit.getSpecAbility() == 1) {
    			specAbil = "���� - ��ȯ�� �Ͽ� ��� ���� �� �� �ִ�.";
    		} 
//    		else if ( unit.getSpecAbility() == 2) {
//    			specAbil = "��� - �ٸ� �����̳� ������ ���� �� �� ����.";
//    		}
    		
    		
    		System.out.println("**************************");
            System.out.println("***** Unit ***************");
            System.out.println("***** 1.��    �� : " + unit.getName());
            System.out.println("***** 2.�Һ񸶳� : " + unit.getConsumeMana());
            System.out.println("***** 3.��    �� : " + unit.getSpecies());
            System.out.println("***** 4.�� �� �� : " + unit.getAttack());
            System.out.println("***** 5.ü    �� : " + unit.getHealth());
            System.out.println("***** 6.Ư���ɷ� : " +  specAbil);
            System.out.println("**************************");
            System.out.println("**************************");
            
    		
    	} else if ( name.equals("Spell")) {
    		Spell spell = (Spell) list.get(num);
    		
    		String specAbil = null;
    		
    		if ( spell.getAbilityNum() == 1) {
    			specAbil = "Unit �Ǵ� ĳ���Ϳ��� 2 Damage";
    		} else if ( spell.getAbilityNum() == 2) {
    			specAbil = "�� ������ 2�ϰ� �󸰴�.";
    		} else if ( spell.getAbilityNum() == 3) {
    			specAbil = "Unit���� 4 ���ظ� �ش�.";
    		} else if ( spell.getAbilityNum() == 4) {
    			specAbil = "�� ���� ��ü�� 1�ϰ� �󸰴�.";
    		}

    		System.out.println("**************************");
            System.out.println("***** Spell ***************");
            System.out.println("***** 1.��    �� : " + spell.getName());
            System.out.println("***** 2.�Һ񸶳� : " + spell.getConsumeMana());
            System.out.println("***** 3.��    �� : " + spell.getSpecies());
            System.out.println("***** 4.�� �� �� : " + spell.getDamage());
            System.out.println("***** 6.Ư���ɷ� : " +  specAbil);
            System.out.println("**************************");
            System.out.println("**************************");
    	}
    }
}