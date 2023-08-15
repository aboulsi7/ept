package database.entities;

import java.util.Date;

public class EmployeeEntity {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth;
    private final String email;
    private final String phoneNumber;

    private EmployeeEntity(long id, String firstName, String lastName, String dateOfBirth, String email, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class EmployeeEntityBuilder {
        private long id;
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String email;
        private String phoneNumber;

        public EmployeeEntityBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public EmployeeEntityBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeEntityBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeEntityBuilder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public EmployeeEntityBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeEntityBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeEntity createEmployeeEntity() {
            return new EmployeeEntity(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        }
    }
}
