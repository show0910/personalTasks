package firstTask;

public class fishingThread extends Thread {

	comFunction cf = new comFunction();
	model md = null;
	int fishingNum = 0;
	int randomNum = 0;
	
	public void process(model md) {
		this.md = md;
	}
	
	public void run() {
		
		System.out.println("���� ������ �۵� ����");
		
		fishingNum = (int)(Math.random()*6)+1;
		
		for ( int i = 0 ; i < fishingNum ; i++ ) {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			randomNum = cf.randomNum();  
			
			// ������ + �̳� Ȯ�� ��ŭ ����⸦ ���� �� �ִ�.
			if (randomNum < (cf.locChance(md.getLocation()) + cf.bait(md.getBait()))) {
				System.out.println("����Ⱑ ������!!!");
		
				md.setBaitValid(1);
				
				break;
				
			} else { // ����⸦ ���ƴ�.
				System.out.println("����Ⱑ ��������...");
				md.setBaitValid(0);
				
			}
		}	
	}
}
