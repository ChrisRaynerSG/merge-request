package com.carnasa.cr.mergerequestbackend.models;

import java.util.Set;

public class UserDTO {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final String city;
    private final String county;
    private final String country;
    private final Set<RoleDTO> roles;
    private final Set<ProgrammingLanguageDTO> programmingLanguages;

    public UserDTO(String firstName,
                   String lastName,
                   String email,
                   String phoneNumber,
                   String address,
                   String city,
                   String county,
                   String country,
                   Set<RoleDTO> roles,
                   Set<ProgrammingLanguageDTO> programmingLanguages) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.county = county;
        this.country = country;
        this.roles = roles;
        this.programmingLanguages = programmingLanguages;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public Set<ProgrammingLanguageDTO> getProgrammingLanguages() {
        return programmingLanguages;
    }
}
