package com.hydroakri.blogServer.service;

import java.util.List;

import com.hydroakri.blogServer.entity.Comment;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);
    List<Comment> getCommentsByPostId(Long postId);
}
