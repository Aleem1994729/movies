package com.bollywood.repo;

import com.bollywood.model.Bollywood ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BollywoodRepository extends JpaRepository<Bollywood, Integer> {
}

