package com.example.library.repo;

import com.example.library.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, UUID> {
    List<BorrowRecord> findByBorrowerId(UUID borrowerId);
    List<BorrowRecord> findByActiveTrue();
    List<BorrowRecord> findByDueDateBeforeAndActiveTrue(LocalDate date);
    List<BorrowRecord> findByBookIdAndBorrowerIdAndActiveTrue(UUID bookId, UUID borrowerId);
}
