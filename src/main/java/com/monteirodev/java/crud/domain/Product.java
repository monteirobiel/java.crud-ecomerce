package com.monteirodev.java.crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product")
@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Integer price_in_cents;

    public Product(RequestProduct data) {
        this.name = data.name();
        this.price_in_cents = data.price_in_cents();
    }
}
