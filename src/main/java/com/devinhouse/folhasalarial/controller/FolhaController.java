package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.model.FolhaSalarial;
import com.devinhouse.folhasalarial.service.FolhaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/folha")
public class FolhaController {

    private FolhaService folhaService;

    public FolhaController(FolhaService folhaService) {
        this.folhaService = folhaService;
    }

    @GetMapping
    public List<FolhaSalarial> listaFolhas(){
        List<FolhaSalarial> folha = folhaService.listaTodasFolhas();
        return folha;
    }

    @GetMapping(value = "/{id}")
    public FolhaSalarial folhaId(@PathVariable Long id){
        return folhaService.listaFolha(id);

    }

    @PostMapping
    public FolhaSalarial adicionarFolha(@RequestBody FolhaSalarial folhaSalarial){
        FolhaSalarial result = folhaService.adicionarFolha(folhaSalarial);
        return result;
    }

    @PutMapping(name = "/{id}")
    public FolhaSalarial atualizarFolha(@RequestBody FolhaSalarial folhaSalarial){
        FolhaSalarial result = folhaService.atualizarFolha(folhaSalarial);
        return result;
    }

    @DeleteMapping
    public void excluirFolha(@RequestBody FolhaSalarial folhaSalarial){
        folhaService.excluirFolha(folhaSalarial);
    }
}
