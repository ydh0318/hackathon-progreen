package org.example.hackathon.service;

import org.example.hackathon.domain.Post;
import org.example.hackathon.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }
    public void createPost(Post post) {
        postMapper.insertPost(post);
    }

    public Post getPostById(int postId) {
        return postMapper.selectPostById(postId);
    }

    public List<Post> getAllPosts() {
        return postMapper.selectAllPosts();
    }

    public void updatePost(Post post) {
        postMapper.updatePost(post);
    }

    public void deletePost(int postId) {
        postMapper.deletePost(postId);
    }
}
