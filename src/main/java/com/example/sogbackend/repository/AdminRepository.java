package com.example.sogbackend.repository;

import com.example.sogbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
