package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.entity.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {


    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Java");
        comment.setText("Wooden Spoon");


        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        System.out.println(cs1 == cs2);
//        --> true  (if : Scope = Singleton)
//        --> false (if : Scope = Prototype)


        /* Singleton Vs Prototype Scopes Explained in Depth under Day 03 {Spring Core} */




    }


}
