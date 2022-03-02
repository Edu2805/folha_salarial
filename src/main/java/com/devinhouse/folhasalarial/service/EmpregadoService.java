package com.devinhouse.folhasalarial.service;

import com.devinhouse.folhasalarial.model.Empregado;
import com.devinhouse.folhasalarial.repository.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpregadoService {

    private final EmpregadoRepository empregadoRepository;
    private final List<Empregado> empregados = new ArrayList<>();

    @Autowired
    public EmpregadoService(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    public List<Empregado> listaTodosEmpregados(){
        return (List<Empregado>) empregadoRepository.findAll();
    }

    public Empregado listaEmpregado(Long id){

        Empregado result = empregadoRepository.findById(id).get();
        return result;
    }

    public Empregado adicionarEmpregado(Empregado empregado){

        Empregado result = empregadoRepository.save(empregado);
        return result;
    }

    public Empregado atualizarEmpregado(Empregado empregado){
        Empregado result = empregadoRepository.save(empregado);
        return result;
    }

    public void excluirEmpregado(Empregado empregado){
        empregadoRepository.delete(empregado);
    }
}
