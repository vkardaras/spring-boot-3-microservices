package com.vasiliskardaras.microservices.product.service;

import com.vasiliskardaras.microservices.product.dto.ProductRequest;
import com.vasiliskardaras.microservices.product.model.Product;
import com.vasiliskardaras.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created successfully");
    }
}