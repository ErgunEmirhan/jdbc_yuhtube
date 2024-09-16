package com.ajwalker.model;

import com.ajwalker.entity.Video;

public class VideoModel {
	private Video video;
	private Long likeCount;
	private Long dislikeCount;
	private Long commentCount;
	
	
	public VideoModel(Video video, Long likeCount, Long dislikeCount, Long commentCount) {
		this.video = video;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
		this.commentCount = commentCount;
	}
	
	public void showStatistics(){
		System.out.println("likeCount: " + likeCount + " dislikeCount: " + dislikeCount + " commentCount: " + commentCount + "viewCount: " + video.getViewCount());
	}
	
	public Video getVideo() {
		return video;
	}
}