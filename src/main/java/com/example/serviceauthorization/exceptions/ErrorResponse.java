package com.example.serviceauthorization.exceptions;

import com.example.serviceauthorization.UserImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {

    private final List<Violation> errors;
}

