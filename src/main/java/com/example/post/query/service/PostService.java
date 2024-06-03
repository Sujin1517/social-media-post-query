package com.example.post.query.service;

import com.example.post.query.domain.response.PostResponse;
import com.example.post.query.entity.Post;

import java.util.List;

public interface PostService {
    List<PostResponse> getAllPosts();
    PostResponse getPostById(Long id);
    void savePost(Post req);
    void deletePost(Post req);
}
