//package com.prady.shipping;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.util.function.Consumer;
//
//@Slf4j
//@Component
//public class OrderCreationConsumer {
//
//
//    @Autowired
//    private InventoryRepository inventoryRepository;
//     @Bean
//     public Consumer<BookStock> onOrderCreation() {
//         return (bookStock) -> {
//           log.info("Received the value {} in OrderCreationConsumer", bookStock);
//             inventoryRepository.save(bookStock);
//         };
//     }
//}