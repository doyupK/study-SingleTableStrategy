package com.supercarmarket.dev.domain.download;

import com.supercarmarket.dev.domain.Board;
import com.supercarmarket.dev.domain.TimeStamped;
import com.supercarmarket.dev.domain.user.User;
import lombok.*;

import javax.persistence.*;
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("DOWNLOAD")
public class Download extends Board {



    String attachmentUrl;

}
