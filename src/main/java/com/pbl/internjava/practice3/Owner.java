package com.pbl.internjava.practice3;

public class Owner {
    private String idNumber;
    private String fullName;
    private String email;

    public Owner(String idNumber, String fullName, String email) {
        if (!idNumber.matches("\\d{12}")) {
            throw new IllegalArgumentException("ID number must be exactly 12 digits!");
        }
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
            throw new IllegalArgumentException("Invalid email format!");
        }
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return fullName + " (ID: " + idNumber + ", Email: " + email + ")";
    }
}

