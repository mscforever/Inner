package edu.training.les28.inner.task5;

public class Main {
	public static void main(String[] args) {

		Greeting greeting = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hello, World!");
			}

		};

		greeting.sayHello();

	}

}