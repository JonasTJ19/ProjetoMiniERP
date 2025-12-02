package com.miniErp.miniErp.service.basics;

import com.miniErp.miniErp.model.basics.Produto;
import com.miniErp.miniErp.repository.basics.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtorepository;

    public List<Produto> findAll(){
        return produtorepository.findAll();
    }

    public Optional<Produto> findById(Integer id) {
        return produtorepository.findById(id);
    }

    public Produto save(Produto produto){
        return produtorepository.save(produto);
    }

    public Produto update(Integer id, Produto produto){
        if(!produtorepository.existsById(id)){
            throw new RuntimeException("produto não encontrado");
        }
        produto.setId(id);
        produtorepository.save(produto);
        return produto;
    }

    public void delete(Integer id) {
        if(!produtorepository.existsById(id)){
            throw new RuntimeException("endereço não encontrado");
        }
        produtorepository.deleteById(id);
    }
}
