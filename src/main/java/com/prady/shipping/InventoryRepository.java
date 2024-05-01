package com.prady.shipping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<BookStock, Long> {

}
