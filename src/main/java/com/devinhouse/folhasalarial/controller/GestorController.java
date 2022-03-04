package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.dto.GestorDto;
import com.devinhouse.folhasalarial.model.Empregado;
import com.devinhouse.folhasalarial.model.FolhaSalarial;
import com.devinhouse.folhasalarial.model.Gestor;
import com.devinhouse.folhasalarial.service.GestorService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/gestor")
public class GestorController {

    private GestorService gestorService;

    public GestorController(GestorService gestorService) {
        this.gestorService = gestorService;
    }

//    @GetMapping
//    public List<Gestor> listaGestores(){
//        List<Gestor> gestor = gestorService.listaTodosGestores();
//        return gestor;
//    }

    @GetMapping("/visualizar")
    public ModelAndView listarEmpregados(){
        List<Gestor> gestores = gestorService.listaTodosGestores();
        ModelAndView mv = new ModelAndView("gestor/visualizar");

        mv.addObject("gestores", gestores);
        return mv;
    }

    @GetMapping(value = "/{id}")
    public Gestor gestorId(@PathVariable Long id){
        return gestorService.listaGestor(id);

    }

    @PostMapping
    public Gestor adicionarGestor(@RequestBody GestorDto gestorDto){

        var gestor = new Gestor();
        BeanUtils.copyProperties(gestorDto, gestor);
        Gestor result = gestorService.adicionarGestor(gestor);
        return result;
    }

    @PutMapping(name = "/{id}")
    public Gestor atualizarGestor(@RequestBody Gestor gestor){
        Gestor result = gestorService.atualizarGestor(gestor);
        return result;
    }

    @DeleteMapping
    public void excluirGestor(@RequestBody Gestor gestor){
        gestorService.excluirGestor(gestor);
    }
}
