package com.qa.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.product.entity.Product;
import com.qa.product.exception.ProductAlreadyExistsException;
import com.qa.product.service.ProductService;

@RestController
@RequestMapping("api/v1/product-service")
public class ProductController {

	@Autowired
	ProductService prodService;
	
	
	ResponseEntity<?> responseEntity;
	
	@PostMapping("/product")
	public ResponseEntity<?> saveProduct(@RequestBody Product product) throws ProductAlreadyExistsException {
		Product createdProduct;  
		try {		
				
				createdProduct = this.prodService.saveProduct(product);
				
		} catch (ProductAlreadyExistsException e) {
			throw e;
		}
		responseEntity = new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
		return responseEntity;
	}
	
	
}
