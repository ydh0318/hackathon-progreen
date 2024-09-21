package org.example.hackathon.mapper;

import org.apache.ibatis.annotations.*;
import org.example.hackathon.domain.Post;

import java.util.List;

@Mapper
public interface PostMapper {

    void insertPost(Post post);

    Post selectPostById(int postId);

    List<Post> selectAllPosts();

    void updatePost(Post post);

    void deletePost(int postId);
}