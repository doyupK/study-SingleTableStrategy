package com.supercarmarket.dev.domain.product;

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
public class ProductBrand {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    private String brandName;

}
