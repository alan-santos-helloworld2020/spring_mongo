package com.base.spring_mongo.service;
import java.util.List;

import com.base.spring_mongo.model.Cliente;

public interface ClienteService {
	
	
	public List<Cliente> listar();
	
	public Cliente pesquisar(String id);
	
	public Cliente salvar(Cliente cl);
	
	public Cliente editar(Cliente cl);
	
	public void deletar(String id);
	

}








