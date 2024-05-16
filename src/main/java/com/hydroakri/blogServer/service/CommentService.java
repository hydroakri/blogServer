package com.hydroakri.blogServer.service;

import com.hydroakri.blogServer.entity.Comment;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);
}
