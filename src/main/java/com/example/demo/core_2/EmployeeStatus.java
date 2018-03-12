package com.example.demo.core_2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EmployeeStatus {

    CANDIDATE(1),
    EMPLOYEE(2),
    FORMER_EMPLOYEE(3);

    private Integer id;

    @JsonValue
    public Integer getId() {
        return id;
    }

    @JsonCreator
    public static EmployeeStatus getById(Integer id) {
        if (id == null) {
            return null;
        }

        for (EmployeeStatus employeeStatus : values()) {
            if (employeeStatus.getId().equals(id)) {
                return employeeStatus;
            }
        }

        throw new IllegalArgumentException(
                String.format("No id with value %s", id));
    }
}
