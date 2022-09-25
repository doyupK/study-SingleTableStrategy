package com.supercarmarket.dev.domain.product;

import com.supercarmarket.dev.domain.enumData.ProductFuelTypeEnum;
import com.supercarmarket.dev.domain.enumData.ProductTransmissionTypeEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class ProductInformation {

    @Id
    @GeneratedValue
    private Long seq;

    @OneToOne
    private Product product;
    private String carNumber;
    private String registrationDate; // 최초 자동차등록일
    private String displacement;
    private ProductTransmissionTypeEnum productTransmissionTypeEnum;
    private int mileage;
    private String color;
    private boolean accidentHistory;
    private ProductFuelTypeEnum productFuelType;
}
