package database.managers;

import database.DataBaseConnector;
import database.entities.EmployeeEntity;

import java.util.List;

public class EmployeeManager {

    private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO employees (first_name, last_name, date_of_birth, email, phone_number)\nVALUES ('%s', '%s', '%s', '%s', '%s');";
    private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM employees WHERE id = %d;";
    private static final String READ_QUERY = "SELECT * FROM employees";

    public static void createEmployee(EmployeeEntity employee){
        String query = String.format(INSERT_EMPLOYEE_QUERY,
            employee.getFirstName(),
            employee.getLastName(),
            employee.getDateOfBirth(),
            employee.getEmail(),
            employee.getPhoneNumber()
        );

        DataBaseConnector.executeUpdate(List.of(query));
    }
    public static void deleteEmployee(long employeeId){
        String query = String.format(DELETE_EMPLOYEE_QUERY, employeeId);

        DataBaseConnector.executeUpdate(List.of(query));
    }
    public static List<EmployeeEntity> readEmployee(){
    }
}
