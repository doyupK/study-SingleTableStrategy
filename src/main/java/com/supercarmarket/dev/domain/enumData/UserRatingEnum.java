package com.supercarmarket.dev.domain.enumData;

public enum UserRatingEnum {

    NORMAL(1),
    BRONZE(2),
    SILVER(3),
    GOLD(4),
    DIAMOND(5),
    ADMIN(6),
    CHIEF(7);


    final int grade;

    UserRatingEnum(int grade) {
        this.grade = grade;
    }
}