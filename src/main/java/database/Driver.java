package database;

import database.entities.EmployeeEntity;
import database.managers.EmployeeManager;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        EmployeeEntity employee = new EmployeeEntity.EmployeeEntityBuilder()
                .setFirstName("Karim")
                .setLastName("Serhan")
                .setDateOfBirth("1998-10-05")
                .setEmail("kouki@gmail.com")
                .setPhoneNumber("76123456")
                .createEmployeeEntity();

        EmployeeManager.deleteEmployee(1);
    }

}
