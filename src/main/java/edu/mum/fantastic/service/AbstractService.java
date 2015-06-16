package edu.mum.fantastic.service;

import java.util.List;

public interface AbstractService<T> {
	
	public void add(T t);

	public void update(T t);

	public void remove(T t);
	
	public List<T> findAll();
}
