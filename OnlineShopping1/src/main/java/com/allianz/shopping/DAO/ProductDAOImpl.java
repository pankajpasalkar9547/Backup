package com.allianz.shopping.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allianz.shopping.model.Product;

public interface ProductDAOImpl extends JpaRepository<Product , Integer>
{

}
