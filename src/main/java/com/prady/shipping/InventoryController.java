package com.prady.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class InventoryController {

   @Autowired
   private InventoryRepository bookStockRepository;

    @PutMapping("/stocks")
    public BookStock updateStock(@RequestBody BookStock bookStock) {
        return bookStockRepository.save(bookStock);
    }

    @GetMapping("/stocks")
    public List<BookStock> getAllStocks() {
        return bookStockRepository.findAll();
    }

    @GetMapping("/stocks/{bookId}")
    BookStock getStock(@PathVariable("bookId") Long bookId) {
        return bookStockRepository.findById(bookId).orElse(null);
    }

}
