package com.vasiliskardaras.microservices.product.repository;

import com.vasiliskardaras.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
