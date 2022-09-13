package com.qa.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.product.entity.Product;
import com.qa.product.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	ProductRepository prodRepo;
	
	@Override
	public Product saveProduct(Product product) {
		return prodRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return null;
	}

	@Override
	public Product getProductById(int id) {
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		return null;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
