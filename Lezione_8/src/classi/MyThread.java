package classi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyThread extends Thread {
	
	private Logger log = LoggerFactory.getLogger(MyThread.class);
	private String message;

	public MyThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++) {
			try {
				log.info("N." + (i + 1) + " - " + message);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				log.error(e.getMessage());
			}
		}
		
	}
	
	
	
}
