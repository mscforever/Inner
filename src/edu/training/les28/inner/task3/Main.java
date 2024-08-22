package edu.training.les28.inner.task3;

public class Main {
	public static void main(String[] args) {

		University.Student student = new University.Student();

		student.setId(1);
		student.setName("Романенко Дмитрий Игоревич");

		System.out.println("Student: " + student.getName() + "\nId: " + student.getId());

	}

}