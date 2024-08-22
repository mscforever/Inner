package edu.training.les28.inner.task2;

public class Main {
	public static void main(String[] args) {

		Car c = new Car();

		c.setModel("Ford Fusion");
		c.setYear("2018");
		c.e.setType("Sport");
		c.e.setHorsepower("249");

		c.printInfo();

	}

}