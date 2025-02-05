package com.carnasa.cr.mergerequestbackend.repositories;

import com.carnasa.cr.mergerequestbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
