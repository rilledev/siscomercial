package com.rjdev.siscomercial.services;

import com.rjdev.siscomercial.dto.ProductDTO;
import com.rjdev.siscomercial.entities.Product;
import com.rjdev.siscomercial.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
}
