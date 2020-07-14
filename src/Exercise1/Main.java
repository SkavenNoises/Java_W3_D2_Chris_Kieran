package Exercise1;

public class Main {

	public static void main(String[] args) {
		Author author = new Author("abs", "abc@abc.com", 'm', "instragram.com/author");
		System.out.println(author.toString());

		Book book = new Book("TestBook", author, 25.99);
		System.out.println(book.toString());
	}
}
