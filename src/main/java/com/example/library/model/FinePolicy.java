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
@Table(name = "fine_policy")
public class FinePolicy {
    @Id
    @GeneratedValue
    private UUID id;

    private String category;
    private double finePerDay;
}
