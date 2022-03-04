package com.devinhouse.folhasalarial.controller;

import com.devinhouse.folhasalarial.dto.CargoDto;
import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.service.CargoService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/cargo")
public class CargoController {

    private CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping("/visualizar")
    public ModelAndView index(){
        List<Cargo> cargos = cargoService.listaTodosCargos();
        ModelAndView mv = new ModelAndView("cargo/visualizar");

        mv.addObject("cargos", cargos);
        return mv;
    }

//    @GetMapping
//    public List<Cargo> listaCargos(){
//        List<Cargo> cargos = cargoService.listaTodosCargos();
//        return cargos;
//    }

    @GetMapping(value = "/{id}")
    public Cargo cargoId(@PathVariable Long id){
        return cargoService.listaCargo(id);

    }

    @PostMapping("/cadastro")
    public Cargo adicionarCargo(@RequestBody CargoDto cargoDto){

        var cargo = new Cargo();
        BeanUtils.copyProperties(cargoDto, cargo);
        Cargo result = cargoService.adicionarCargo(cargo);
        return result;
    }

    @PutMapping(name = "/{id}")
    public Cargo atualizarCargo(@RequestBody Cargo cargo){
        Cargo result = cargoService.adicionarCargo(cargo);
        return result;
    }

    @DeleteMapping
    public void excluirCargo(@RequestBody Cargo cargo){
        cargoService.excluirCargo(cargo);
    }
}
