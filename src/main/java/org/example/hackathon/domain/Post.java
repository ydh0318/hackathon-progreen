package org.example.hackathon.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private int postId;       // 게시판 id
    private String postName;  // 제목
    private Date createDate;  // 게시글 작성일
    private String detail;    // 내용
}
