package edu.training.les28.inner.task1;

public class Book {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	class Author {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		private String age;

		void printInfo() {

			System.out.println("Book: " + title + " \nAuthor: " + name + " \nAge: " + age);
		}
	}

}