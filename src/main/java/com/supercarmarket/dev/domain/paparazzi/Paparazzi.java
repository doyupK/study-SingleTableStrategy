package com.supercarmarket.dev.domain.paparazzi;

import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.TimeStamped;
import com.supercarmarket.dev.domain.user.User;
import com.supercarmarket.dev.domain.enumData.PaparazziRatingEnum;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("PAPARAZZI")
public class Paparazzi extends Board {

    @LastModifiedDate
    private LocalDateTime przModifiedDatetime;

    private PaparazziRatingEnum przRating;





}
