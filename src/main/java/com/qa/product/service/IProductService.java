package com.qa.product.service;

import java.util.List;

import com.qa.product.entity.Product;
import com.qa.product.exception.ProductAlreadyExistsException;

public interface IProductService {

	//CRUD operations
	public Product saveProduct(Product product) throws ProductAlreadyExistsException;
	public List<Product> getAllProduct();
	public Product getProductById(int id);
	public Product updateProduct(Product product);
	public boolean deleteProduct(int id);
	
	
}
