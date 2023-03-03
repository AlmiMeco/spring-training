package com.cydeo.proxy;

import com.cydeo.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class BannerCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Banner Notification for comment: " + comment.getText());
    }
}
