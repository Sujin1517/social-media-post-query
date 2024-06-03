package com.example.post.query.domain.response;

import com.example.post.query.entity.Post;

import java.util.Date;
import java.util.UUID;

public record PostResponse(
    Long id,
    UUID userId,
    String content,
    int likeNum,
    int scrapNum,
    Date createdAt,
    String file,
    String fileType
) {
    public static PostResponse from(Post post) {
        return new PostResponse(
                post.getId(),
                post.getUserId(),
                post.getContent(),
                post.getLikeNum(),
                post.getScrapNum(),
                post.getCreatedAt(),
                post.getFile(),
                post.getFileType()
        );
    }
}
