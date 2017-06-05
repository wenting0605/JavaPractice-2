package ch04;

public class PoliteRunner extends Thread {

	private int tick = 1;
	private int num;

	public PoliteRunner(int num) {
		this.num = num;
	}

	public void run() {
		while (tick < 4000000) { // 原來為400000
			tick++;
			if ((tick % 50000) == 0) {
				System.out.println("Thread #" + num + ", tick = " + tick);
				yield();
			}
		}
	}
}
