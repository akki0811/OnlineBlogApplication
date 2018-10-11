package com.online.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.online.blog.model.Blogs;


public interface BlogRepository extends CrudRepository<Blogs,String>{

	

}
