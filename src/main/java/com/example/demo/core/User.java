package com.example.demo.core;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean isResident;
}
