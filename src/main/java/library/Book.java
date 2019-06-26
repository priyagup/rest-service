package library;

public class Book {
	private final String title;
    private final String department;
    
    public Book(String title, String department) {
    	this.title = title;
    	this.department = department;
    }

	public String getTitle() {
		return title;
	}

	public String getDepartment() {
		return department;
	}
    
}
