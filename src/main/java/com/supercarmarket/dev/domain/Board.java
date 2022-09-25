package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.product.Category;
import com.supercarmarket.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;


@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
@NoArgsConstructor
@AllArgsConstructor
public abstract class Board extends TimeStamped{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String contents;

    private Integer likeCount;
    private Integer viewCount;
    private Integer cmtCount;
    private Integer blameCount;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;


}
