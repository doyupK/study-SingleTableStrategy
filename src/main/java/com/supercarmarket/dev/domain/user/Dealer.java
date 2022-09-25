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
    @Column(name = "user_seq", nullable = false)
    private Long userSeq;



    private String name;
    private String dealerNumber;
    private String affiliation;
    private String address;

    @ManyToOne
    private Guild guild;

    @ManyToOne
    private Company company;


}
