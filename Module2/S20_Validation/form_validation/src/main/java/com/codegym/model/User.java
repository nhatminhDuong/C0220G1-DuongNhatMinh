package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^0\\d{9}", message = "Invalid phone number!")
    private String phoneNumber;

    @NotNull
    @Min(value = 18, message = "Age must be greater than or equal to 18!")
    private Byte age;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9]+[a-zA-Z0-9-._]+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]{2,6}$", message = "Invalid email address!")
    private String email;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
