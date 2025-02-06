package com.carnasa.cr.mergerequestbackend.service;

import com.carnasa.cr.mergerequestbackend.entities.User;
import com.carnasa.cr.mergerequestbackend.models.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    Page<UserDTO> findAll(Integer page, Integer pageSize);
    Optional<UserDTO> findById(Long id);
    Optional<UserDTO> update(User user);
    UserDTO save(User user);
    void deleteById(Long id);

}
