package com.supercarmarket.dev.domain.enumData;

public enum ProductRatingEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    ProductRatingEnum(boolean code) {
        this.code = code;
    }
}
