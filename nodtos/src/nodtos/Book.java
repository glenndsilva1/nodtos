package nodtos;


public class Book {
	private String isbn;
	private String name;
	private String title;
	
	public Book() {
		this.isbn = "1234";
		this.name = "ABC";
		this.title = "NoTitle";
	}
	
	public String printTo(Media media) {
		return media.with("isbn", this.isbn).with("title",this.title).with("name",this.name).value();
	}

	public static void main(String args[]) {
		Media media = new JsonMedia(new JsonPage());
		System.out.println(new Book().printTo(media));
	}
}
