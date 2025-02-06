package com.carnasa.cr.mergerequestbackend.service.utils;

import com.carnasa.cr.mergerequestbackend.entities.Role;
import com.carnasa.cr.mergerequestbackend.models.RoleDTO;

public class RoleUtils {

    public static RoleDTO toDTO(Role role) {
        return new RoleDTO(
                role.getName()
        );
    }
}
