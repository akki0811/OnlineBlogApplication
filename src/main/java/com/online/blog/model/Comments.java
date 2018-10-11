package com.online.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comments {
	@Id
	private String commentId;
	private String comment;
	@ManyToOne
	private Blogs blogs;

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Blogs getBlogs() {
		return blogs;
	}

	public void setBlogs(Blogs blogs) {
		this.blogs = blogs;
	}

	public Comments(String commentId, String comment, String blogId) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.blogs = new Blogs(blogId, "", "");
	}

	public Comments() {
	}

	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", comment=" + comment + ", blogs=" + blogs + "]";
	}

}
