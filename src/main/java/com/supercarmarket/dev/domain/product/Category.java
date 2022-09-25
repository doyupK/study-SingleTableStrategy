package com.supercarmarket.dev.domain.product;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer seq;

    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "parents_id")
    private Category parentsId;

    @OneToMany(mappedBy = "parentsId")
    private List<Category> sonCategory;
}
