package com.dragao.cadastro_dragao.controller;

import com.dragao.cadastro_dragao.infrastructure.entitys.Dragao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public ResponseEntity<Dragao> buscarDragaoPorNome(@RequestParam String nome){
        return ResponseEntity.ok(dragaoService.buscarDragaoPorNome(nome));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarDragaoPorNome(@RequestParam String nome){
        dragaoService.deletarDragaoPorNome(nome);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarDragaoPorId(@RequestParam Dragao dragao,
                                                     @RequestBody Integer id) {
        dragaoService.autalizarDragaoPorId(id, dragao);
        return ResponseEntity.ok().build();
    }
}
