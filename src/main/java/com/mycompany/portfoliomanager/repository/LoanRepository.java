package com.mycompany.portfoliomanager.repository;

import com.mycompany.portfoliomanager.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    Optional<Loan> findById(Long id);
}