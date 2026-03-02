package com.meuprojeto.curso.repositories;

import com.meuprojeto.curso.entities.Category;
import com.meuprojeto.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
