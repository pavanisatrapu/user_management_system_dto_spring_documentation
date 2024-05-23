package com.myprojects.user_management_system_spring_documentation.service;

import com.myprojects.user_management_system_spring_documentation.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDto createUser(UserDto userDto);
    Optional<UserDto> getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto userDto);
    UserDto deleteUser(Long id);
}
