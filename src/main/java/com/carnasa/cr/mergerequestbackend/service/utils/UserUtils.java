package com.carnasa.cr.mergerequestbackend.service.utils;

import com.carnasa.cr.mergerequestbackend.entities.User;
import com.carnasa.cr.mergerequestbackend.models.UserDTO;

import java.util.stream.Collectors;

public class UserUtils {

    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getAddress(),
                user.getCity(),
                user.getCounty(),
                user.getCountry(),
                user.getRoles()
                        .stream()
                        .map(RoleUtils::toDTO)
                        .collect(Collectors.toSet()),
                user.getProgrammingLanguages()
                        .stream()
                        .map(ProgrammingLanguageUtils::toDTO)
                        .collect(Collectors.toSet())
        );
    }
}
