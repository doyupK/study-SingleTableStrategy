package com.supercarmarket.dev.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.supercarmarket.dev.dto.SignupRequestDto;
import com.supercarmarket.dev.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK) // 실제 내장 톰켓이 랜덤 포트로 올라온다.
@Transactional
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("유저 등록 조회")
    @Test
    public void createUser() throws Exception {

        //given
        String signupRequestDto=new ObjectMapper().writeValueAsString(
                SignupRequestDto.builder()
                        .id("testId")
                        .password("testPassword")
                        .nickname("testNickName")
                        .email("test@dev.com")
                        .phoneNumber("010-0000-0100")
                        .build()
                );

        //when
        ResultActions resultActions = mockMvc.perform(post("/api/v1/user")
                .content(signupRequestDto)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));
        //then
        resultActions
                .andExpect(status().isCreated())
                .andDo(print());
    }
}
