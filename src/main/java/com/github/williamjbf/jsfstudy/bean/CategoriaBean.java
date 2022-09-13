package com.github.williamjbf.jsfstudy.bean;

import com.github.williamjbf.jsfstudy.model.Categoria;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CategoriaBean {

    Categoria categoria = new Categoria();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
