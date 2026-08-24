package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allthings.allthings.entity.Fornecedor;
import br.com.allthings.allthings.repository.FornecedorRepository;

@Service
public class FornecedorService {
    
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    //método para excluir
    public void deleteById(Integer id){
        fornecedorRepository.deleteById(id);
    }

    //método para editar
    public Fornecedor findById(Integer id){
        return fornecedorRepository.findById(id).orElse(null);
    }
}
