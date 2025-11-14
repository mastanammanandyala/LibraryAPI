package com.example.library.dto.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.UUID;

@Data
public class ReturnRequest {
    @NotNull
    private UUID bookId;
    @NotNull
    private UUID borrowerId;
}
