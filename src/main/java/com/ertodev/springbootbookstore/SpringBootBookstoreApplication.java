package com.ertodev.springbootbookstore;

import com.ertodev.springbootbookstore.model.Book;
import com.ertodev.springbootbookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootBookstoreApplication implements CommandLineRunner {
	private final BookRepository bookRepository;

	public SpringBootBookstoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	public static void main(String[] args) {SpringApplication.run(SpringBootBookstoreApplication.class, args);



	}


	@Override
	public void run(String... args) throws Exception {

		Book book = Book.builder()
				.name("Yanık Buğdaylar")
				.author("ahmet gunbağ")
				.stock(5)
				.price(15.0).build();
		Book book1 = Book.builder()
				.name("Yanık Buğdaylar1")
				.author("ahmet gunbağ")
				.stock(3)
				.price(12.0).build();

		bookRepository.saveAll(Arrays.asList(book,book1));





	}
}

