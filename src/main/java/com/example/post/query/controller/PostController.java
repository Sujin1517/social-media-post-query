package com.example.post.query.controller;

import com.example.post.query.domain.response.PostResponse;
import com.example.post.query.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public List<PostResponse> getAllPosts() {
        return null;
    }

    @GetMapping("{id}")
    public PostResponse getPostById(@PathVariable Long id) {
        return null;
    }
}
