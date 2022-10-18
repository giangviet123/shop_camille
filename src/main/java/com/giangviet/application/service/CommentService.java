package com.giangviet.application.service;

import com.giangviet.application.entity.Comment;
import com.giangviet.application.model.request.CreateCommentPostRequest;
import com.giangviet.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
