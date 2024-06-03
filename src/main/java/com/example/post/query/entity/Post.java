package com.example.post.query.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Builder
@Table(name = "POSTS")
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    private Long id;
    @Column(name = "USER_ID")
    private UUID userId;
    @Column(name = "POST_CONTENT")
    private String content;
    @Column(name = "POST_LIKE_NUM")
    private int likeNum;
    @Column(name = "POST_SCRAP_NUM")
    private int scrapNum;
    @Column(name = "POST_CREATED_AT")
    private Date createdAt;
    @Column(name = "POST_FILE")
    private String file;
    @Column(name = "POST_FILE_TYPE")
    private String fileType;
    @Column(name = "POST_DISABLE")
    private Boolean isDisable;
}
