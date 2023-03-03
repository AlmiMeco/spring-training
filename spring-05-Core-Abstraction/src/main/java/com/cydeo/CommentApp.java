package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.entity.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {

        /* OLD WAY {Pre-Spring} */
//        CommentService commentTest = new CommentService();
//        commentTest.publishComment(new Comment("Alberto", " Hey what's up man? "));

        /* NEW WAY */

//----------------------------------------------------------------------------------------------------------------------
        // Entity/Model is usually handled on user side (UI) or already pre-defined in dB
        Comment comment = new Comment();
        comment.setAuthor("Dad");
        comment.setText("Grabbing milk ... brb");
//----------------------------------------------------------------------------------------------------------------------

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }


}
