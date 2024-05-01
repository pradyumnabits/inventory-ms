package com.prady.shipping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class BookStockDataLoader implements CommandLineRunner {

    private final InventoryRepository inventoryRepository;

    public BookStockDataLoader(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> bookNames = getRealWorldBookNames();

        for (int i = 0; i < 10; i++) {
            BookStock bookStock = new BookStock();
            String randomBookName = getRandomBookName(bookNames);
            bookStock.setBookName(randomBookName);
            bookStock.setBookDescription("Description for " + randomBookName);
            bookStock.setAvailableQuantity(100); // Set the initial quantity
            bookStock.setPrice(19.99); // Set the price
            inventoryRepository.save(bookStock);
        }
    }

    private List<String> getRealWorldBookNames() {
        // Create a list of real-world book names
        List<String> bookNames = new ArrayList<>();
        // General Books
        bookNames.add("To Kill a Mockingbird");
        bookNames.add("1984");
        bookNames.add("Pride and Prejudice");
        bookNames.add("The Great Gatsby");
        bookNames.add("The Catcher in the Rye");
        bookNames.add("The Lord of the Rings");
        bookNames.add("The Hobbit");
        bookNames.add("War and Peace");
        bookNames.add("Crime and Punishment");
        // Technical Books
        bookNames.add("Clean Code: A Handbook of Agile Software Craftsmanship");
        bookNames.add("Design Patterns: Elements of Reusable Object-Oriented Software");
        bookNames.add("Introduction to Algorithms");
        bookNames.add("Effective Java");
        bookNames.add("The Pragmatic Programmer: Your Journey to Mastery");
        bookNames.add("Code Complete: A Practical Handbook of Software Construction");
        bookNames.add("Refactoring: Improving the Design of Existing Code");
        bookNames.add("Cracking the Coding Interview");
        bookNames.add("The Mythical Man-Month: Essays on Software Engineering");
        bookNames.add("The Art of Computer Programming");
        // Add more book names as needed
        return bookNames;
    }

    private String getRandomBookName(List<String> bookNames) {
        Random random = new Random();
        int randomIndex = random.nextInt(bookNames.size());
        return bookNames.get(randomIndex);
    }
}
