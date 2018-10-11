package com.online.blog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.online.blog.model.Comments;

public interface CommentRepository extends CrudRepository<Comments, String> {

	public List<Comments> findByBlogsBlogId(String blogId);
}
