package com.online.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Blogs {

	@Id
	private String blogId;
	private String blogHeading;
	@Lob
	private String blogDescription;

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	public String getBlogHeading() {
		return blogHeading;
	}

	public void setBlogHeading(String blogHeading) {
		this.blogHeading = blogHeading;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

	public Blogs(String blogId, String blogHeading, String blogDescription) {
		super();
		this.blogId = blogId;
		this.blogHeading = blogHeading;
		this.blogDescription = blogDescription;
	}

	public Blogs() {
	}

	@Override
	public String toString() {
		return "Blogs [BlogId=" + blogId + ", BlogHeading=" + blogHeading + ", BlogDescription=" + blogDescription
				+ "]";
	}

}
