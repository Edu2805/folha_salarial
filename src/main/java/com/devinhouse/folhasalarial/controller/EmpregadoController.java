package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.dto.EmpregadoDto;
import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.model.Empregado;
import com.devinhouse.folhasalarial.service.EmpregadoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/empregado")
public class EmpregadoController {

    private EmpregadoService empregadoService;

    public EmpregadoController(EmpregadoService empregadoService) {
        this.empregadoService = empregadoService;
    }

//    @GetMapping
//    public List<Empregado> listaCargos(){
//        List<Empregado> empregados = empregadoService.listaTodosEmpregados();
//        return empregados;
//    }

    @GetMapping("/visualizar")
    public ModelAndView listarEmpregados(){
        List<Empregado> empregados = empregadoService.listaTodosEmpregados();
        ModelAndView mv = new ModelAndView("empregado/visualizar");

        mv.addObject("empregados", empregados);
        return mv;
    }

    @GetMapping(value = "/{id}")
    public Empregado cargoId(@PathVariable Long id){
        return empregadoService.listaEmpregado(id);

    }

    @PostMapping
    public Empregado adicionarCargo(@RequestBody EmpregadoDto empregadoDto){
        var empregado = new Empregado();
        BeanUtils.copyProperties(empregadoDto, empregado);
        Empregado result = empregadoService.adicionarEmpregado(empregado);
        return result;
    }

    @PutMapping(name = "/{id}")
    public Empregado atualizarCargo(@RequestBody Empregado empregado){
        Empregado result = empregadoService.adicionarEmpregado(empregado);
        return result;
    }

    @DeleteMapping
    public void excluirCargo(@RequestBody Empregado empregado){
        empregadoService.excluirEmpregado(empregado);
    }
}
