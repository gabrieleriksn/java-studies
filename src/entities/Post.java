package entities;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> listComments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;       
    }

    public Date getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getListComments() {
        return listComments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addComment(Comment comment) {
        listComments.add(comment);
    }

    public void removeComment(Comment comment) {
        listComments.remove(comment);
    }

    public String toString() {
        // Usando a concatenação...
        
        /*
        String a = getTitle() 
                   + String.format("%n") + getLikes() + " Likes - " 
                   + sdf.format(getMoment()) 
                   + String.format("%n") + getContent() + String.format("%n") + "Comments: ";
        
        for (Comment c : getListComments()) {
            a += String.format("%n") + c.getText();
        }

        return a;
        */
        
        // Usand o StringBuilder...
        StringBuilder sb = new StringBuilder();
        
        sb.append(getTitle() + "\n");
        sb.append(getLikes() + " Likes - ");
        sb.append(sdf.format(getMoment()) + "\n");
        sb.append(getContent());
        
        sb.append("Comments:\n");
        for (Comment c : listComments) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();

    }
}
