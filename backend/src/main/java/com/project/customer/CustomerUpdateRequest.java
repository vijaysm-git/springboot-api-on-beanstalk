package com.project.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
