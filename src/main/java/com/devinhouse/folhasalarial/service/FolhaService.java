package com.devinhouse.folhasalarial.service;


import com.devinhouse.folhasalarial.model.FolhaSalarial;
import com.devinhouse.folhasalarial.repository.FolhaSalarialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FolhaService {

    private final FolhaSalarialRepository folhaSalarialRepository;
    //verificar
    private final List<FolhaSalarial> folhasSalariais = new ArrayList<>();

    @Autowired
    public FolhaService(FolhaSalarialRepository folhaSalarialRepository) {
        this.folhaSalarialRepository = folhaSalarialRepository;
    }

    public List<FolhaSalarial> listaTodasFolhas(){
        return (List<FolhaSalarial>) folhaSalarialRepository.findAll();
    }

    public FolhaSalarial listaFolha(Long id){

        FolhaSalarial result = folhaSalarialRepository.findById(id).get();
        return result;
    }

    public FolhaSalarial adicionarFolha(FolhaSalarial folhaSalarial){

        FolhaSalarial result = folhaSalarialRepository.save(folhaSalarial);
        return result;
    }

    public FolhaSalarial atualizarFolha(FolhaSalarial folhaSalarial){
        FolhaSalarial result = folhaSalarialRepository.save(folhaSalarial);
        return result;
    }

    public void excluirFolha(FolhaSalarial folhaSalarial){
        folhaSalarialRepository.delete(folhaSalarial);
    }
}
