package com.internjava.application.service;

import com.internjava.application.entity.Comment;
import com.internjava.application.model.request.CreateCommentPostRequest;
import com.internjava.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
