package com.supercarmarket.dev.domain.enumData;

public enum PartnerInquiryCategoryEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    PartnerInquiryCategoryEnum(boolean code) {
        this.code = code;
    }
}
