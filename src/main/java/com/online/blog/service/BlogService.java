package com.online.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.blog.model.Blogs;
import com.online.blog.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	BlogRepository blogRepository;
	
	public List<Blogs> getAllBlogs() {

	List<Blogs> blogs = new ArrayList<>();
	blogRepository.findAll().forEach(blogs::add);
	return blogs;
	}

	public Blogs getBlog(String blogId) {
		return blogRepository.findById(blogId).orElse(null);
	}
	
	public void addBlog(Blogs blogs) {
		blogRepository.save(blogs);

	}
	
	public void updateBlog(Blogs blogs) {
		blogRepository.save(blogs);
	}
	
	public void deleteBlog(String blogId) {
		blogRepository.deleteById(blogId);
	}

}
