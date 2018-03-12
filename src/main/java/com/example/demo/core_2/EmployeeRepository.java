package com.example.demo.core_2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select new com.example.demo.core_2.EmployeeFirstnameLastnameEmailDTO(e.firstName, e.lastName, e.email) from Employee e where e.id = :employeeId")
    EmployeeFirstnameLastnameEmailDTO getBasicEmployee(@Param("employeeId") Integer employeeId);

    @Query("select new com.example.demo.core_2.EmployeeFullInfoDTO(e.firstName, e.lastName, e.username, e.email, e.age) from Employee e where e.id = :employeeId")
    EmployeeFullInfoDTO jenyaThisWillWorkEither(@Param("employeeId") Integer employeeId);

    @Query("select new com.example.demo.core_2.EmployeeTeamDTO(e.firstName, e.lastName, t.teamName) from Employee e, Team t where e.id=:employeeId")
    EmployeeTeamDTO getEmployeeTeam(Integer employeeId);
}