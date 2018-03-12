package com.example.demo.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserPresentation {
    private String firstName;
    private String lastName;
    private String username;
}
