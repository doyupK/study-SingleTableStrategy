package com.supercarmarket.dev.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.supercarmarket.dev.domain.user.User;
import com.supercarmarket.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket.dev.domain.enumData.UserRoleEnum;
import com.supercarmarket.dev.dto.SignupRequestDto;
import com.supercarmarket.dev.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
//@WebMvcTest(PostController.class)    이거도 왜 안되지 ?
@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserServiceImpl userService;

    private MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @DisplayName("유저 등록 조회")
    @Test
    public void createUser() throws Exception {

        //given
        SignupRequestDto signupRequestDto=
                SignupRequestDto.builder()
                        .id("testId")
                        .password("testPassword")
                        .nickname("testNickName")
                        .email("test@dev.com")
                        .phoneNumber("010-0000-0100")
                        .build();
        User user = User.builder()
                .id("testId")
                .password("testPassword")
                .nickname("testNickName")
                .email("test@dev.com")
                .phoneNumber("010-0000-0100")
                .rating(UserRatingEnum.NORMAL)
                .role(UserRoleEnum.NORMAL)
                .build();
        user.setCreate_datetime(LocalDateTime.now());


        when(userService.createUser(any(SignupRequestDto.class))).thenReturn(user); // stub - 행동 정의

        //when
        ResultActions resultActions = mockMvc.perform(post("/api/v1/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("UTF-8")
                        .content(objectMapper.writeValueAsString(signupRequestDto))
                        .accept(MediaType.APPLICATION_JSON));
        //then
        resultActions
                .andExpect(status().isCreated())
                .andDo(MockMvcResultHandlers.print());
    }
}