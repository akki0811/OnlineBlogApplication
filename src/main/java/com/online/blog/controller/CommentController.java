package com.online.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.blog.model.Blogs;
import com.online.blog.model.Comments;
import com.online.blog.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;

	@RequestMapping("/blogs/{blogId}/comments")
	public List<Comments> getAllComments(@PathVariable String blogId) {
		return commentService.getAllComments(blogId);

	}

	@RequestMapping("/blogs/{blogId}/comments/{commentId}")
	public Comments getComment(@PathVariable String commentId) {
		return commentService.getComment(commentId);

	}

	@RequestMapping(value = "/blogs/{blogId}/comments", method = RequestMethod.POST)
	public void addBlog(@RequestBody Comments comments, @PathVariable String blogId) {
		comments.setBlogs(new Blogs(blogId, "", ""));
		commentService.addComment(comments);

	}

	@RequestMapping(value = "/blogs/{blogId}/comment/{commentId}", method = RequestMethod.PUT)
	public void updateBlog(@RequestBody Comments comments, @PathVariable String blogId,
			@PathVariable String CommentId) {
		comments.setBlogs(new Blogs(blogId, "", ""));
		commentService.updateComment(comments);

	}

	@RequestMapping(value = "/blogs/{blogId}/comments/{commentId}", method = RequestMethod.DELETE)
	public void deleteBlog(@PathVariable String commentId) {
		commentService.deleteComment(commentId);

	}

}
