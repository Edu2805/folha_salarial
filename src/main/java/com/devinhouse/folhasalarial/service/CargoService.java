package com.devinhouse.folhasalarial.service;

import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;
    private final List<Cargo> cargos = new ArrayList<>();

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> listaTodosCargos(){
        return (List<Cargo>) cargoRepository.findAll();
    }

    public Cargo listaCargo(Long id){

        Cargo result = cargoRepository.findById(id).get();
        return result;
    }

    public Cargo adicionarCargo(Cargo cargo){

        Cargo result = cargoRepository.save(cargo);
        return result;
    }

    public Cargo atualizarCargo(Cargo cargo){
        Cargo result = cargoRepository.save(cargo);
        return result;
    }

    public void excluirCargo(Cargo cargo){
        cargoRepository.delete(cargo);
    }
}
