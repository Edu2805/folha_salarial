package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.dto.FolhaDto;
import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.model.FolhaSalarial;
import com.devinhouse.folhasalarial.service.FolhaService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/folha")
public class FolhaController {

    private FolhaService folhaService;

    public FolhaController(FolhaService folhaService) {
        this.folhaService = folhaService;
    }

//    @GetMapping
//    public List<FolhaSalarial> listaFolhas(){
//        List<FolhaSalarial> folha = folhaService.listaTodasFolhas();
//        return folha;
//    }

    @GetMapping("/visualizar")
    public ModelAndView index(){
        List<FolhaSalarial> folhas = folhaService.listaTodasFolhas();
        ModelAndView mv = new ModelAndView("folha/visualizar");

        mv.addObject("folhas", folhas);
        return mv;
    }

    @GetMapping(value = "/{id}")
    public FolhaSalarial folhaId(@PathVariable Long id){
        return folhaService.listaFolha(id);

    }

    @PostMapping
    public FolhaSalarial adicionarFolha(@RequestBody FolhaDto folhaDto){

        var folha = new FolhaSalarial();
        BeanUtils.copyProperties(folhaDto, folha);
        FolhaSalarial result = folhaService.adicionarFolha(folha);
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
