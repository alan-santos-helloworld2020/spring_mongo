package com.base.spring_mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.spring_mongo.model.Cliente;
import com.base.spring_mongo.repository.ClienteRepository;

@Service
public class ClienteServiceIPMT implements ClienteService{

	@Autowired
	private ClienteRepository cl;
	
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return this.cl.findAll();
	}

	@Override
	public Cliente pesquisar(String id) {
		// TODO Auto-generated method stub
		return this.cl.findById(id).orElseThrow(() -> new IllegalArgumentException("Este Cliente não Existe!"));
	}

	@Override
	public Cliente salvar(Cliente cl) {
		// TODO Auto-generated method stub
		return this.cl.save(cl);
	}

	@Override
	public Cliente editar(Cliente cl) {
		// TODO Auto-generated method stub
		return this.cl.save(cl);
	}

	@Override
	public void deletar(String id) {
		// TODO Auto-generated method stub
		this.cl.deleteById(id);
		
	}
	
    

	

}
