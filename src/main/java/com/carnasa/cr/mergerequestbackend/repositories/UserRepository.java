package com.carnasa.cr.mergerequestbackend.repositories;

import com.carnasa.cr.mergerequestbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
