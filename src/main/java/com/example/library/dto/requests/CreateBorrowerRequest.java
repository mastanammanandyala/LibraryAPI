package com.example.library.dto.requests;

import com.example.library.model.MembershipType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateBorrowerRequest {
    @NotBlank
    private String name;
    @Email
    private String email;
    private MembershipType membershipType = MembershipType.BASIC;
}
