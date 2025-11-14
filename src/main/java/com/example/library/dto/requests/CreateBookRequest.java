package com.example.library.dto.requests;

import com.example.library.model.Category;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateBookRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String author;
    private Category category = Category.OTHER;
    @Min(1)
    private int copies = 1;
}
