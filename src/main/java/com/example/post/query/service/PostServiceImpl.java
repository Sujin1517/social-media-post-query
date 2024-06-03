package com.example.post.query.service;

import com.example.post.query.domain.response.PostResponse;
import com.example.post.query.entity.Post;
import com.example.post.query.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;

    @Override
    public List<PostResponse> getAllPosts() {
        return postRepository.findAll().stream()
                .map(PostResponse::from).toList();
    }

    @Override
    public PostResponse getPostById(Long id) {
        return PostResponse.from(postRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new));
    }

    @Override
    public void savePost(Post req) {
        Post post = Post.builder()
                .id(req.getId())
                .userId(req.getUserId())
                .content(req.getContent())
                .likeNum(0)
                .scrapNum(0)
                .createdAt(req.getCreatedAt())
                .file(req.getFile())
                .fileType(req.getFileType())
                .isDisable(false)
                .build();
        postRepository.save(post);
    }

    @Override
    public void deletePost(Post req) {
        Post post = postRepository.findById(req.getId()).orElseThrow(IllegalArgumentException::new);
        postRepository.delete(post);
    }
}
