package com.github.williamjbf.jsfstudy.bean;

import com.github.williamjbf.jsfstudy.model.Produto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ProdutoBean {

    private Produto produto = new Produto();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
