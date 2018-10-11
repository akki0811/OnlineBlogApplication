package com.online.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.blog.model.Blogs;
import com.online.blog.service.BlogService;

@RestController
public class BlogController {
	@Autowired
	private BlogService blogService;

	@RequestMapping("/blogs")
	public List<Blogs> getAllBlogs() {
		return blogService.getAllBlogs();

	}

	@RequestMapping("/blogs/{blogId}")
	public Blogs getBlog(@PathVariable String blogId) {
		return blogService.getBlog(blogId);

	}

	@RequestMapping(value = "/blogs", method = RequestMethod.POST)
	public void addBlog(@RequestBody Blogs blogs) {
		blogService.addBlog(blogs);

	}

	@RequestMapping(value = "/blogs/{BlogId}", method = RequestMethod.PUT)
	public void updateBlog(@RequestBody Blogs blogs) {
		blogService.updateBlog(blogs);

	}

	@RequestMapping(value = "/blogs/{blogId}", method = RequestMethod.DELETE)
	public void deleteBlog(@PathVariable String blogId) {
		blogService.deleteBlog(blogId);

	}
}
