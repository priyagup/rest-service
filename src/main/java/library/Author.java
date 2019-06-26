package library;

public class Author {
	
	private final String author_name;
	private final String country;
	
	public Author(String author_name, String country) {
		this.author_name = author_name;
		this.country = country;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public String getCountry() {
		return country;
	}

}
