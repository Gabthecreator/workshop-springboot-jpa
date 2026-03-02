package com.meuprojeto.curso.repositories;

import com.meuprojeto.curso.entities.Category;
import com.meuprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
