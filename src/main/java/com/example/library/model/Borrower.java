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
@Table(name = "borrowers")
public class Borrower {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;

    @Enumerated(EnumType.STRING)
    private MembershipType membershipType;

    private int maxBorrowLimit;
}
