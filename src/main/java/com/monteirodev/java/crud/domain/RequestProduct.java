package com.monteirodev.java.crud.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(

        Long id,
        @NotBlank(message = "Name is mandatory")
        String name,
        @NotNull(message = "Price is mandatory")
        Integer price_in_cents) {
}
