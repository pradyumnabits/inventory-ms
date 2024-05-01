package com.prady.shipping;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookStock {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long bookId;

        @NotNull
        private String bookName;

        private String bookDescription;


        private int availableQuantity;

        private double price;

}
