package com.carnasa.cr.mergerequestbackend.service.impl;

import com.carnasa.cr.mergerequestbackend.entities.User;
import com.carnasa.cr.mergerequestbackend.models.UserDTO;
import com.carnasa.cr.mergerequestbackend.repositories.UserRepository;
import com.carnasa.cr.mergerequestbackend.service.UserService;
import com.carnasa.cr.mergerequestbackend.service.utils.ServiceUtils;
import com.carnasa.cr.mergerequestbackend.service.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public Page<UserDTO> findAll(Integer page, Integer pageSize) {
        PageRequest pageRequest = ServiceUtils.buildPageRequest(page, pageSize);
        return userRepository.findAll(pageRequest).map(UserUtils::toDTO);
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id).map(UserUtils::toDTO);
    }

    @Override
    public Optional<UserDTO> update(User user) {
        return Optional.of(UserUtils.toDTO(userRepository.save(user)));
    }

    @Override
    public UserDTO save(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
