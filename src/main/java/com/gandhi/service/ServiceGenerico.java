package com.gandhi.service;

import java.util.List;

import org.springframework.stereotype.Repository;


public interface ServiceGenerico <T, ID>{
	
	public List<T> getAll();
	
	public T findById(ID id);
	
	public T save(T t);
	
	public T update (T t);
	
	public void delete (ID id);

}
