package com.example.demo.core_2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/basic-employee/{employeeId}")
    public EmployeeFirstnameLastnameEmailDTO getBasicEmployee(
            @PathVariable("employeeId") Integer employeeId) {
        return employeeRepository.getBasicEmployee(employeeId);
    }

    @GetMapping("/full-employee/{id}")
    public EmployeeFullInfoDTO getFullInfo(@PathVariable("id") Integer id) {
        return employeeRepository.jenyaThisWillWorkEither(id);
    }

    @GetMapping("/employee-team/{id}")
    public EmployeeTeamDTO getEmployeeTeam(@PathVariable("id") Integer id) {
        return employeeRepository.getEmployeeTeam(id);
    }


    @SneakyThrows
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .firstName("Peter")
                .lastName("Mathews")
                .username("mpeter")
                .email("peter@site.com")
                .isActiveEmployee(true)
                .age(39)
                .city("Rehovot")
                .street("Rotshild")
                .houseNumber("11")
                .apartment("13A")
                .floor(4)
                .employeeStatus(EmployeeStatus.CANDIDATE)
                .build();

        String json = new ObjectMapper()
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(employee);

        System.out.println(getValue());

        System.out.println(json);

        System.out.println(getResult(2, 2));

    }

    private static Integer getResult(int a, int b) {
        return a + b;
    }

    private static String getValue() {
        return getValue_2();
    }

    private static String getValue_2() {
        return "abc";
    }
}
