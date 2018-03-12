package com.example.demo.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select new " +
            "com.example.demo.core.UserPresentation (" +
            "u.firstName, " +
            "u.lastName, " +
            "u.username) from User u where u.id = :userId")
    UserPresentation getPresentation(@Param("userId") Integer id);
}
