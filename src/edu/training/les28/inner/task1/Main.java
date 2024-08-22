package edu.training.les28.inner.task1;

public class Main {
	public static void main(String[] args) {

		Book b = new Book();

		Book.Author a = b.new Author();

		b.setTitle("Book01");

		a.setName("New Author1");
		a.setAge("30");
		a.printInfo();

	}

}