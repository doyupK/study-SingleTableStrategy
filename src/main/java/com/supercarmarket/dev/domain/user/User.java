package com.supercarmarket.dev.domain.user;

import com.supercarmarket.dev.domain.TimeStamped;
import com.supercarmarket.dev.domain.enumData.UserRatingEnum;
import com.supercarmarket.dev.domain.enumData.UserRoleEnum;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "user_table")
public class User extends TimeStamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private String userId;
    private String userPassword;
    private String userNickname;
    private String userProfileUrl;
    private String userEmail;
    private String userPhone;
    private String userSocial;

    @Enumerated(EnumType.STRING) // ORDINAL의 순서가 아닌 문자열 값으로 들어가야 추후 ENUM이 추가되었을때 DB가 꼬이지 않는다
    private UserRatingEnum userRating;
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;
    @OneToOne
    @JoinColumn
    private Dealer dealer;

}