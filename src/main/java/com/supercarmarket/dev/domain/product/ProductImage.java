package com.supercarmarket.dev.domain.product;

import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class ProductImage {
    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    private Product product;

    private String productUrl;
}
