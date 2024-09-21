package org.example.hackathon.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PostDto {
    private String postName;
    private String postDate;
    private String postContent;

    public static PostEntity toEntity(PostDto dto){
        return PostEntity.builder()
                .postName(dto.postName)
                .postDate(dto.postDate)
                .postContent(dto.postContent)
                .build();
    }

}
