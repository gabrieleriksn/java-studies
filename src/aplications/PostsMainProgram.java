package aplications;

import entities.Post;
import entities.Comment;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostsMainProgram {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Post 1
        Date moment1 = sdf.parse("21/06/2018 13:05:44");
        String title1 = "Travelling to New Zealand";
        String content1 = "I'm going to visit this wonderful country!";
        int likes1 = 12;

        Post post1 = new Post(moment1, title1, content1, likes1);

        // Post 2
        Date moment2 = sdf.parse("28/07/2018 23:14:19");
        String title2 = "Good night guys";
        String content2 = "See you tomorrow";
        int likes2 = 5;

        Post post2 = new Post(moment2, title2, content2, likes2);

        // Comments 1
        Comment comment1A = new Comment("Have a nice trip");
        Comment comment1B = new Comment("Whow that's awesome!");
        post1.addComment(comment1A);
        post1.addComment(comment1B);

        // Comments 2
        Comment comment2A = new Comment("Good night");
        Comment comment2B = new Comment("May the Force be with you");
        post2.addComment(comment2A);
        post2.addComment(comment2B);

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}
