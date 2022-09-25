package com.supercarmarket.dev.domain.product;

import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.TimeStamped;
import com.supercarmarket.dev.domain.user.User;
import com.supercarmarket.dev.domain.enumData.ProductRatingEnum;
import com.supercarmarket.dev.domain.enumData.ProductStatusEnum;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("PRODUCT")
public class Product extends Board {



    private String  subtitle;
    private int price;

    private String performanceUrl;    //성능검사표
    private String insuranceUrl;     //보험이력
    private ProductStatusEnum productStatusEnum;
    private ProductRatingEnum productRatingEnum;
    private Boolean appear;

    @ManyToOne
    private ProductModel productModel;



}
