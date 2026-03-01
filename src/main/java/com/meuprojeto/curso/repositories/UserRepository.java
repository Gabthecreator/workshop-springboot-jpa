package com.meuprojeto.curso.repositories;

import com.meuprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
