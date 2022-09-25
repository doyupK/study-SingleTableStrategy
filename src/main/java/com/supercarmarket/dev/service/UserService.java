package com.supercarmarket.dev.service;

import com.supercarmarket.dev.domain.user.User;
import com.supercarmarket.dev.dto.SignupRequestDto;

public interface UserService {

    User createUser(SignupRequestDto signupRequestDto);
}
