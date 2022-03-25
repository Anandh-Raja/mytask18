package JavaMultithreading;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private final BlockingQueue<Integer> blockingQueue;
	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue=blockingQueue;
	}

	public void run() {
		for(int i=10;i<=100;i+=10) {
			try {
				System.out.println("OrderProduced"+i);
				blockingQueue.put(i);;
			}catch(InterruptedException e) {
				System.out.println("Producer Interrupt");
			}
		}
		
	}

}
