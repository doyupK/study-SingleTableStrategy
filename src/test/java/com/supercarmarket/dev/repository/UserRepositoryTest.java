package com.supercarmarket.dev.repository;

import com.supercarmarket.dev.domain.user.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userRepository가Null이아님() {
        assertThat(userRepository).isNotNull();
    }

    @Test
    public void 유저등록() {
        // given
        final User user = User.builder()
                .id("userId")
                .password("userPassword")
                .email("user@test.com")
                .nickname("userNickname")
                .phoneNumber("010-0000-1111")
                .build();

        // when
        final User result = userRepository.save(user);

        // then
        assertThat(result.getId()).isNotNull();
        assertThat(result.getId()).isEqualTo("userId");
        assertThat(result.getPassword()).isEqualTo("userPassword");
        assertThat(result.getEmail()).isEqualTo("user@test.com");
        assertThat(result.getNickname()).isEqualTo("userNickname");
        assertThat(result.getPhoneNumber()).isEqualTo("010-0000-1111");
    }

}