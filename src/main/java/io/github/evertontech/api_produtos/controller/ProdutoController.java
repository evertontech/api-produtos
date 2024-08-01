package io.github.evertontech.api_produtos.controller;

import io.github.evertontech.api_produtos.model.entity.Produto;
import io.github.evertontech.api_produtos.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping
    public Iterable<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProduto(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @PutMapping(path = "/{id}")
    public Produto atualizar(@RequestBody Produto produto, @PathVariable Long id) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}
