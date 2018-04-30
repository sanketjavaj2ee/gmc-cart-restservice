package com.globalmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globalmart.domain.Product;
import com.globalmart.repository.ProductRepository;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/gmproducts")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/getProducts")
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@DeleteMapping("delete/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}
}
