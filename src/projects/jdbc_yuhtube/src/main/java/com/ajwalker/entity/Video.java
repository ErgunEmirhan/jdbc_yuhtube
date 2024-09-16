package com.ajwalker.entity;

public class Video extends BaseEntity {
    private Long creator_id;
    private String title;
    private String content;
    private String description;
    private Integer viewCount;
    
    public Integer getViewCount() {
        return viewCount;
    }
    
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
    
    public Video() {
    }

    public Video(Long creator_id, String title, String content, String description) {
        this.creator_id = creator_id;
        this.title = title;
        this.content = content;
        this.description = description;
    }

    public Video(Long id, Long creator_id, String title, String content, String description) {
        super.id = id;
        this.creator_id = creator_id;
        this.title = title;
        this.content = content;
        this.description = description;
    }

    public Long getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(Long creator_id) {
        this.creator_id = creator_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + getId() +
                "creator_id=" + creator_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}