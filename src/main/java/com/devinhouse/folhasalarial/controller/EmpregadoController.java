package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.model.Empregado;
import com.devinhouse.folhasalarial.service.EmpregadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empregado")
public class EmpregadoController {

    private EmpregadoService empregadoService;

    public EmpregadoController(EmpregadoService empregadoService) {
        this.empregadoService = empregadoService;
    }

    @GetMapping
    public List<Empregado> listaEmpregados(){
        List<Empregado> empregados = empregadoService.listaTodosEmpregados();
        return empregados;
    }

    @GetMapping(value = "/{id}")
    public Empregado empregadoId(@PathVariable Long id){
        return empregadoService.listaEmpregado(id);

    }

    @PostMapping
    public Empregado adicionarEmpregado(@RequestBody Empregado empregado){
        Empregado result = empregadoService.adicionarEmpregado(empregado);
        return result;
    }

    @PutMapping(name = "/{id}")
    public Empregado atualizarEmpregado(@RequestBody Empregado empregado){
        Empregado result = empregadoService.atualizarEmpregado(empregado);
        return result;
    }

    @DeleteMapping
    public void excluirEmpregado(@RequestBody Empregado empregado){
        empregadoService.excluirEmpregado(empregado);
    }
}
