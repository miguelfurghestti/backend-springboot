package com.example.aulamichellibrito.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aulamichellibrito.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}