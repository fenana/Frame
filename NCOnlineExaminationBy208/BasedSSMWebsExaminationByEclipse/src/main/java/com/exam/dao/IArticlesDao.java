package com.exam.dao;

import java.util.List;

import com.exam.model.Articles;

public interface IArticlesDao {
	
	Integer add(Articles model);
	Integer delete(int id);
	Integer update(Articles model);
	List<Articles> findAll();
	Articles findById(int id);

}
