package com.cydeo.service;

import com.cydeo.entity.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;

public class CommentService {

    private CommentRepository dataBase;
    private CommentNotificationProxy emailNotification;


    public void publishComment(Comment comment){
//    REQUIREMENTS:
        
        //save to DB
        dataBase.storeComment(comment);
        //send as email
        emailNotification.sendComment(comment);

    }



}
