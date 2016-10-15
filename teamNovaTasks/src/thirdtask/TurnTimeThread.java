package thirdtask;

import java.util.Scanner;

public class TurnTimeThread extends Thread{

	Scanner scan = new Scanner(System.in);
	
	public void run() {
		
		try {
			Thread.sleep(180000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("턴이 종료되었습니다. 턴종료 4를 눌러주세요");
		
	}
}
