package com.example.library.dto.requests;

import com.example.library.model.Category;
import lombok.Data;

@Data
public class UpdateBookRequest {
    private String title;
    private String author;
    private Category category;
    private Integer totalCopies;
}
