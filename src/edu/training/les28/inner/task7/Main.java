package edu.training.les28.inner.task7;

public class Main {
	public static void main(String[] args) {

		double radius = 10;

		Shape circle = new Shape() {

			@Override
			public double area() {
				return radius * radius * Math.PI;
			}

		};

		System.out.println("circle area with radius " + radius + " : " + circle.area());

	}

}