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
		
		System.out.println("낚시 쓰레드 작동 시작");
		
		fishingNum = (int)(Math.random()*6)+1;
		
		for ( int i = 0 ; i < fishingNum ; i++ ) {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			randomNum = cf.randomNum();  
			
			// 낚시터 + 미끼 확률 만큼 물고기를 낚을 수 있다.
			if (randomNum < (cf.locChance(md.getLocation()) + cf.bait(md.getBait()))) {
				System.out.println("물고기가 물었다!!!");
		
				md.setBaitValid(1);
				
				break;
				
			} else { // 물고기를 놓쳤다.
				System.out.println("물고기가 도망갔다...");
				md.setBaitValid(0);
				
			}
		}	
	}
}
