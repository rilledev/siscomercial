package com.rjdev.siscomercial.repositories;

import com.rjdev.siscomercial.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
