//package com.supercarmarket.dev.service.impl;
//
//import com.supercarmarket.dev.domain.user.User;
//import com.supercarmarket.dev.domain.enumData.UserRatingEnum;
//import com.supercarmarket.dev.domain.enumData.UserRoleEnum;
//import com.supercarmarket.dev.dto.SignupRequestDto;
//import com.supercarmarket.dev.repository.UserRepository;
//import com.supercarmarket.dev.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class UserServiceImpl implements UserService {
//
//    private final UserRepository userRepository;
//
////    @Override
////    public User createUser(SignupRequestDto signupRequestDto) {
////        User user = User.builder()
////                .email(signupRequestDto.getEmail())
////                .password(signupRequestDto.getPassword())
////                .nickname(signupRequestDto.getNickname())
////                .phoneNumber(signupRequestDto.getPhoneNumber())
////                .rating(UserRatingEnum.NORMAL)
////                .role(UserRoleEnum.NORMAL)
////                .build();
////
////        return userRepository.save(user);
////    }
//}
