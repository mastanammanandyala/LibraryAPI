package com.example.library.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String author;

    @Enumerated(EnumType.STRING)
    private Category category;

    private boolean isAvailable;
    private int totalCopies;
    private int availableCopies;

    private boolean deleted = false;
}
