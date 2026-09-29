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
                () -> new RuntimeException("Nome não encontrado!")
        );
    }

    public void deletarDragaoPorNome(String nome){
        repository.deleteByNome(nome);
    }

    public void autalizarDragaoPorId(Integer id, Dragao dragao){
        Dragao dragaoEntity = repository.findById(id).orElseThrow(() ->
                    new RuntimeException("Dragao nao encontrado"));
        Dragao dragaoAtualizado = Dragao.builder()
                .nome(dragao.getNome() != null ? dragao.getNome() :
                        dragaoEntity.getNome())
                .especie(dragao.getEspecie() != null ? dragao.getEspecie() :
                        dragaoEntity.getEspecie())
                .id(dragaoEntity.getId())
                .build();

        repository.saveAndFlush(dragaoAtualizado);
    }
}
