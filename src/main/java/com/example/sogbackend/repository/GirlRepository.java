package com.example.sogbackend.repository;

import com.example.sogbackend.model.Girl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GirlRepository extends JpaRepository<Girl, Long> {
    Optional<Girl> findByUserId(String userId);
}
