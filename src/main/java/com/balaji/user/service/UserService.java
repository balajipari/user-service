package com.balaji.user.service;

import com.balaji.user.model.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {
    public void createOrUpdateUser(UserDto user);
    public List<UserDto> getUsers();
    public UserDto getUserById(UUID id);
    public void delete(UUID id);
}
