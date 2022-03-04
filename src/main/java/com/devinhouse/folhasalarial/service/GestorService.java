package com.devinhouse.folhasalarial.service;

import com.devinhouse.folhasalarial.model.Gestor;
import com.devinhouse.folhasalarial.repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GestorService {

    private final GestorRepository gestorRepository;
    //verificar
    private final List<Gestor> gestores = new ArrayList<>();

    public GestorService(GestorRepository gestorRepository) {
        this.gestorRepository = gestorRepository;
    }

    public List<Gestor> listaTodosGestores(){
        return (List<Gestor>) gestorRepository.findAll();
    }

    public Gestor listaGestor(Long id){

        Gestor result = gestorRepository.findById(id).get();
        return result;
    }

    public Gestor adicionarGestor(Gestor gestor){

        Gestor result = gestorRepository.save(gestor);
        return result;
    }

    public Gestor atualizarGestor(Gestor gestor){
        Gestor result = gestorRepository.save(gestor);
        return result;
    }

    public void excluirGestor(Gestor gestor){
        gestorRepository.delete(gestor);
    }
}
