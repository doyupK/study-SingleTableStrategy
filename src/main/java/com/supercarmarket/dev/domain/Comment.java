package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.paparazzi.Paparazzi;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Comment extends TimeStamped {

    @Id
    @GeneratedValue
    private Long seq;
    @ManyToOne
    private com.supercarmarket.dev.domain.user.User User;
    @ManyToOne
    private Paparazzi paparazzi;
    private String contents;
}
