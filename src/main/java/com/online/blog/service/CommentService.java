package com.online.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.blog.model.Comments;
import com.online.blog.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository commentRepository;

	public List<Comments> getAllComments(String blogId) {
		List<Comments> comments = new ArrayList<>();
		commentRepository.findByBlogsBlogId(blogId).forEach(comments::add);
		return comments;
	}

	public Comments getComment(String CommentId) {
		return commentRepository.findById(CommentId).orElse(null);
	}

	public void addComment(Comments comments) {
		commentRepository.save(comments);

	}

	public void updateComment(Comments comments) {
		commentRepository.save(comments);
	}

	public void deleteComment(String CommentId) {
		commentRepository.deleteById(CommentId);
	}

}
