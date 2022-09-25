package com.supercarmarket.dev.domain.user;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Dealer {

    @Id

    private Long seq;

    @OneToOne
    @JoinColumn
    private User user;

    private String name;
    private String dealerNumber;
    private String affiliation;
    private String address;


}
