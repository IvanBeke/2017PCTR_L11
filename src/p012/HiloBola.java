package p012;

public class HiloBola implements Runnable {

	private final Ball bola;

	public HiloBola(Ball bola) {
		this.bola = bola;
	}

	@Override
	public void run() {
		while (true) {
			bola.move();
			bola.reflect();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}
