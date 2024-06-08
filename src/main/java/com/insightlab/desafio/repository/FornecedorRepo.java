package com.insightlab.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.insightlab.desafio.model.Fornecedor;


@RepositoryRestResource(path = "fornecedores")
public interface FornecedorRepo extends JpaRepository<Fornecedor, Long>{
    
}