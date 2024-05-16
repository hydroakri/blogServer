package com.hydroakri.blogServer.service;

import java.util.List;

import com.hydroakri.blogServer.entity.Post;

public interface PostService {

    Post savePost(Post post);
    List<Post> getAllPosts();
    Post getPostById(Long postid);
    void likePost(Long postId);

}
