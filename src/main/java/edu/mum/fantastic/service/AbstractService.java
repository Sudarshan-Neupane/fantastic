package edu.mum.fantastic.service;

public interface AbstractService<T> {
	
	public void add(T t);

	public void update(T t);

	public void remove(T t);
}
