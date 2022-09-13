package com.github.williamjbf.jsfstudy.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Date dataCriacao;
    @OneToMany
    @JoinColumn(name = "categoria_id")
    private List<Produto> produtos;

}
