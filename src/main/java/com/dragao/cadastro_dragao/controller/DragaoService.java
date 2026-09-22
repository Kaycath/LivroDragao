package com.dragao.cadastro_dragao.controller;

import com.dragao.cadastro_dragao.infrastructure.entitys.Dragao;
import com.dragao.cadastro_dragao.infrastructure.repository.DragaoRepository;
import org.springframework.stereotype.Service;

@Service
public class DragaoService {
    private final DragaoRepository repository;


    public DragaoService(DragaoRepository repository) {
        this.repository = repository;
    }

    public void salvarDragao(Dragao dragao){
        repository.saveAndFlush(dragao);
    }

    public Dragao buscarDragaoPorNome(String nome){

        return repository.findByNome(nome).orElseThrow(
                () -> new RuntimeException("Nome nãp encontrado!")
        );
    }
}
