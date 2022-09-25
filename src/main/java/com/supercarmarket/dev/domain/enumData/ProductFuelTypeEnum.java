package com.supercarmarket.dev.domain.enumData;

public enum ProductFuelTypeEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductFuelTypeEnum(boolean code) {
        this.code = code;
    }
}
