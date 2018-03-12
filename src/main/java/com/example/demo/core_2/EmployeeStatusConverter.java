package com.example.demo.core_2;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class EmployeeStatusConverter implements AttributeConverter<EmployeeStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus attribute) {
        return attribute == null ? null : attribute.getId();
    }

    @Override
    public EmployeeStatus convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : EmployeeStatus.getById(dbData);
    }
}
