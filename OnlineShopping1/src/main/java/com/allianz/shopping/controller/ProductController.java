package com.allianz.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.shopping.DAO.ProductDAOImpl;
import com.allianz.shopping.model.Product;

@RestController
@RequestMapping(value= {"productController"})
public class ProductController {
	
	@Autowired
	private ProductDAOImpl productDAOImpl;
	
	@GetMapping
	public List<Product> findAll(){
		return productDAOImpl.findAll();
		
	}
	

}
