package com.supercarmarket.dev.domain.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Guild {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    private String guildName;
    private String guildAddress;
    private String guildRegNum;
    private String guildPhone;
}
