package com.dragao.cadastro_dragao.controller;

import com.dragao.cadastro_dragao.infrastructure.entitys.Dragao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dragao")
@RequiredArgsConstructor
public class DragaoController {

    private final DragaoService dragaoService;

    @PostMapping
    public ResponseEntity<Void> salvarDragao(@RequestBody Dragao dragao){
        dragaoService.salvarDragao(dragao);
        return ResponseEntity.ok().build();
    }
}
