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
		
		System.out.println("���� ����Ǿ����ϴ�. ������ 4�� �����ּ���");
		
	}
}
