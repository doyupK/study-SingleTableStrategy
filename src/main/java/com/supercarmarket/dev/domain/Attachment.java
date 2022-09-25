package com.supercarmarket.dev.domain;

import com.supercarmarket.dev.domain.download.Download;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Attachment {
    @Id
    @GeneratedValue
    private Long Seq;

    private String dattAttachmentUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    private Board board;


}
