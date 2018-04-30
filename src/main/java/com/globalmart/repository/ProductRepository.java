package com.globalmart.repository;


import org.springframework.data.repository.CrudRepository;

import com.globalmart.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}

