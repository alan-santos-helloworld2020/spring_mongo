package com.base.spring_mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.spring_mongo.model.Cliente;
import com.base.spring_mongo.service.ClienteServiceIPMT;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private ClienteServiceIPMT cl;
	
    @GetMapping("/")
    public List<Cliente> listar(){

        return cl.listar();
        
    }

    @GetMapping("/{id}")
    public Cliente pesquisar(@PathVariable String id){

        return cl.pesquisar(id);
        
    }


    @PostMapping("/")
    public Cliente salvar(@RequestBody Cliente cliente){

        return cl.salvar(cliente) ;
        
    }
    
    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente cliente){

        return cl.editar(cliente) ;
        
    }
	
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
    	
    	cl.deletar(id);
    	
    	
    }

}
