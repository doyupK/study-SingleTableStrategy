package com.supercarmarket.dev.domain.magazine;

import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.user.User;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("MAGAZINE")
public class Magazine extends Board {


    private String mgzBannerImageUrl;





}
