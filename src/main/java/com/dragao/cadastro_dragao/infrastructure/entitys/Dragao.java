package com.dragao.cadastro_dragao.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "dragao")
@Entity

public class Dragao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", unique = true)
    private String nome;

    @Column(name = "especie")
    private String especie;

    @Column(name = "classe")
    private String classe;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "especialidade")
    private String especialidade;
}
