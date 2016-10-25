package br.com.fiap.dao;

import java.util.List;

public interface Dao<T> {
	T adicionar(T entidade);
	void cadastrar(T entidade);
	List<T> listar();
	T buscar(int id); 
}
