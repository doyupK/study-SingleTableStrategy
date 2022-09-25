package com.supercarmarket.dev.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.supercarmarket.dev.dto.SignupRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // 실제 내장 톰켓이 랜덤 포트로 올라온다.
@Transactional
public class UserControllerRestTemplateTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private static HttpHeaders headers;

    @BeforeAll
    public static void init() {
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
    }
    // RestTemplate Test
    @Test
    public void 회원가입() throws Exception{
        //given
        SignupRequestDto signupRequestDto = SignupRequestDto.builder()
                .id("testId")
                .password("password")
                .nickname("testNickname")
                .email("user@test.com")
                .phoneNumber("010-1111-0000")
                .build();
        String content = new ObjectMapper().writeValueAsString(signupRequestDto);
        HttpEntity<String> request = new HttpEntity<>(content,headers);


        //when
        ResponseEntity<String> response =
                restTemplate.exchange("/api/v1/user", HttpMethod.POST,request, String.class);
        //then
        DocumentContext dc = JsonPath.parse(response.getBody());
        String id = dc.read("$.id");
        assertEquals(201, response.getStatusCodeValue());
        assertEquals("testId", id);
    }
}
