package com.ajwalker.entity;

public class Comment extends BaseEntity {
    private Long video_id;
    private Long user_id;
    private String comment;

    {
        this.state = '1';
    }

    public Comment() {
    }

    public Comment(Long video_id, Long user_id, String comment) {
        this.video_id = video_id;
        this.user_id = user_id;
        this.comment = comment;
    }

    public Comment(Long id, Long video_id, Long user_id, String comment) {
        super.id = id;
        this.video_id = video_id;
        this.user_id = user_id;
        this.comment = comment;
    }

    public Long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Long video_id) {
        this.video_id = video_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + getId() +
                "video_id=" + video_id +
                ", user_id=" + user_id +
                ", comment='" + comment + '\'' +
                ", state=" + state +
                '}';
    }
}
