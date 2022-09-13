package com.github.williamjbf.jsfstudy.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private Date dataDeValidade;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categorias;

}
