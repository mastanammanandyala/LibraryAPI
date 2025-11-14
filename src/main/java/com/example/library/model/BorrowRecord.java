package com.example.library.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "borrow_records")
public class BorrowRecord {
    @Id
    @GeneratedValue
    private UUID id;

    private UUID bookId;
    private UUID borrowerId;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    private double fineAmount;

    private boolean active;
}
