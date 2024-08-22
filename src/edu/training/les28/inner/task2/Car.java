package edu.training.les28.inner.task2;

public class Car {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	private String year;

	Engine e = new Engine();

	void printInfo() {
		System.out.println("Model: " + model + "\nYear: " + year + "\nEngine: " + e.type + "\nhorsepower:" + e.horsepower);
	}

	class Engine {
		private String type;

		private String horsepower;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getHorsepower() {
			return horsepower;
		}

		public void setHorsepower(String horsepower) {
			this.horsepower = horsepower;
		}

	}

}