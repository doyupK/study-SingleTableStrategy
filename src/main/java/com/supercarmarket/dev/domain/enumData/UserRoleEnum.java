package com.supercarmarket.dev.domain.enumData;

public enum UserRoleEnum {
    NORMAL(false),
    DEALER(true);

    final boolean type;

    UserRoleEnum(boolean type) {
        this.type = type;
    }
}