package org.example.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private Integer review;
    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Comment(String text, Integer review, User user, Event event) {
        this.text = text;
        this.review = review;
        this.user = user;
        this.event = event;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", review=" + review +
                ", user=" + user +
                ", event=" + event +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id) && Objects.equals(text, comment.text) && Objects.equals(review, comment.review) && Objects.equals(user, comment.user) && Objects.equals(event, comment.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, review, user, event);
    }
}
