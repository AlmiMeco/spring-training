package com.cydeo.service;

import com.cydeo.entity.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Scope(BeanDefinition.SCOPE_SINGLETON) <-- default scope for Beans
public class CommentService {

    //    'final' keyword will make sure you don't forget to create a Constructor (Implicit AutoWiring)
    private final CommentRepository commentDataBase;
    private final CommentNotificationProxy emailNotification;

    public void publishComment(Comment comment) {
//    REQUIREMENTS:

        //save to DB
        commentDataBase.storeComment(comment);
        //send as email
        emailNotification.sendComment(comment);

    }

    //    @Autowiring (Dependency Injection) done implicitly
    @Autowired
    public CommentService(CommentRepository commentDataBase, @Qualifier("emailCommentNotificationProxy") CommentNotificationProxy emailNotification) {
        this.commentDataBase = commentDataBase;
        this.emailNotification = emailNotification;
    }
}
