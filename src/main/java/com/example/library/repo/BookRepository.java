package com.example.library.repo;

import com.example.library.model.Book;
import com.example.library.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
    Optional<Book> findFirstByTitleIgnoreCaseAndAuthorIgnoreCaseAndDeletedFalse(String title, String author);
    Page<Book> findAllByDeletedFalse(Pageable pageable);
    Page<Book> findAllByCategoryAndDeletedFalse(Category category, Pageable pageable);
    Page<Book> findAllByIsAvailableAndDeletedFalse(boolean isAvailable, Pageable pageable);
    Page<Book> findAllByCategoryAndIsAvailableAndDeletedFalse(Category category, boolean isAvailable, Pageable pageable);
}
