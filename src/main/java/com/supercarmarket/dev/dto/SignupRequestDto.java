package com.supercarmarket.dev.dto;

import lombok.*;

@Builder
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class SignupRequestDto {
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String phoneNumber;

}
