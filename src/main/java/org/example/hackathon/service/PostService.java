package org.example.hackathon.service;

import jakarta.transaction.Transactional;
import org.example.hackathon.domain.PostDto;
import org.example.hackathon.domain.PostEntity;
import org.example.hackathon.domain.PostRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;


    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional
    public void savePost(String postName,String postContent)
    {
        String datetime= LocalDateTime.now(ZoneId.of("Asia/Seoul"))
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        PostEntity post= PostDto.toEntity(new PostDto(postName,datetime,postContent));
        postRepository.save(post);
    }

    @Transactional
    public List<PostEntity> getAllPosts(){
        return postRepository.findAll();
    }
}
