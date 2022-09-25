package com.supercarmarket.dev.domain.product;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private String modelName;
    private String modelTrim;

    @ManyToOne
    private ProductBrand productBrand;

}
