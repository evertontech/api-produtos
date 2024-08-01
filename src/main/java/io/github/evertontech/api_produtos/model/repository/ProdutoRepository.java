package io.github.evertontech.api_produtos.model.repository;

import io.github.evertontech.api_produtos.model.entity.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
