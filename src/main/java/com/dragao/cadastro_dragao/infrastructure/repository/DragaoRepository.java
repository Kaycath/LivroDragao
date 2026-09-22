package com.dragao.cadastro_dragao.infrastructure.repository;

import com.dragao.cadastro_dragao.infrastructure.entitys.Dragao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DragaoRepository extends JpaRepository <Dragao, Integer> {

    Optional<Dragao> findByNome(String nome);
}
