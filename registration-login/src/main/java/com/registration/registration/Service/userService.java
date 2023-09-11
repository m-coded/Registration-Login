package com.registration.registration.Service;

import java.util.List;

import com.registration.registration.User;
import com.registration.registration.DTO.UserDto;

public interface userService {

	 void saveUser(UserDto userDto);

	    User findUserByEmail(String email);

	    List<UserDto> findAllUsers();
}
