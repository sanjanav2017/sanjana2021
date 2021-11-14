package com.demo.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.repositary.ProductRepositary;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	// injecting the dependencies of ProductRepositary......jpa repositary
	@Autowired
	ProductRepositary productRepositary;  //formed object internally by spring ioc using autwired priniple

	// add prodcut api logic part

	@Override
	public Product updateProductDetails(Product product) {

		Product existingProduct=productRepositary.findById(product.getId()).orElse(null);
		existingProduct.setId(product.getId());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setManufacturer(product.getManufacturer());
		existingProduct.setName(product.getName());
		existingProduct.setUnit(product.getUnit());
		
		return productRepositary.save(existingProduct);
	}








}