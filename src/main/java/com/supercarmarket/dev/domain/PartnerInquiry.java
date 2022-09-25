package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.enumData.PartnerInquiryCategoryEnum;
import com.supercarmarket.dev.domain.enumData.PartnerInquiryStatusEnum;
import com.supercarmarket.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class PartnerInquiry extends TimeStamped{
    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    private User user;

    private String title;
    private String contents;
    private String attachmentUrl;
    private PartnerInquiryStatusEnum partnerInquiryStatusEnum;
    private PartnerInquiryCategoryEnum partnerInquiryCategoryEnum;

}
