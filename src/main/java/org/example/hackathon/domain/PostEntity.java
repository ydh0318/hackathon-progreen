package org.example.hackathon.domain;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String postName;
    private String postDate;
    private String postContent;


    public PostDto toDto()
    {
        return PostDto.builder()
                .postName(this.postName)
                .postDate(this.postDate)
                .postContent(this.postContent)
                .build();
    }
}
