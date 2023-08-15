package database;

import java.util.List;

public class TablesCreator {
    private static final String CREATE_EMPLOYEE_TABLE = """
                CREATE TABLE employees (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    first_name VARCHAR(255),
                    last_name VARCHAR(255),
                    date_of_birth DATE,
                    email VARCHAR(255),
                    phone_number VARCHAR(20)
                );""";

    private static final String CREATE_WORK_SESSION_TABLE = """
                CREATE TABLE work_sessions (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    employee_id INT,
                    start_time DATETIME,
                    end_time DATETIME,
                    FOREIGN KEY (employee_id) REFERENCES employees(id)
                );""";

    public static void main(String[] args) {
        DataBaseConnector.executeUpdate(List.of(CREATE_EMPLOYEE_TABLE, CREATE_WORK_SESSION_TABLE));
    }
}
