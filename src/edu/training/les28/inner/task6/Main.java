package edu.training.les28.inner.task6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Random rnd = new Random();
				int s = rnd.nextInt(1000);
				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println(i);
						Thread.sleep(1000 + s);
					}
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		});

		thread.start();
	}
}
