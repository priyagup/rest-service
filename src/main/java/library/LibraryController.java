package library;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LibraryController {
	
	private static final String template = "Hello, %s!";
	private final String book_name = "DataStructure";
    private final String author = "Priya Gupta";
    
    // Another way 
    @GetMapping("/book/{area}")
    public Book displaybook(@PathVariable String area ) {
		return new Book(book_name, area);
    	
    }
    
    @GetMapping("/book/Author")
    public Author displayAuthor(@RequestParam(value = "location", defaultValue = "USA") String location,
    		@RequestParam(value = "authorname", defaultValue = "USA") String author ) {
    	return new Author(author,location );
    }
}
