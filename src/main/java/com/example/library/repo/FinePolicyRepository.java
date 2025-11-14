package com.example.library.repo;

import com.example.library.model.FinePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FinePolicyRepository extends JpaRepository<FinePolicy, UUID> {
    Optional<FinePolicy> findByCategoryIgnoreCase(String category);
}
