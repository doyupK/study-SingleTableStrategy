package com.supercarmarket.dev.domain.enumData;

public enum PartnerInquiryStatusEnum {
    BEFORE_CONFIRM(false),
    OK_CONFIRM(true);

    boolean code;

    PartnerInquiryStatusEnum(boolean code) {
        this.code = code;
    }
}

