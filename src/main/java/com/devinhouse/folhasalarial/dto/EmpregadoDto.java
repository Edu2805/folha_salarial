package com.devinhouse.folhasalarial.dto;

import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.model.Empregado;
import com.devinhouse.folhasalarial.model.FolhaSalarial;
import com.devinhouse.folhasalarial.model.Gestor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpregadoDto {

    @NotBlank(message = "Nome não pode estar vazio!")
    private String nome;

    @org.hibernate.validator.constraints.br.CPF(message = "CPF incorrero!")
    @NotBlank(message = "CPF não pode estar em branco!")
    @Size(max = 11, message = "Digite um CPF válido com 11 dígitos!")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "gestor_id")
    private Gestor gestor;

    @ManyToOne
    @JoinColumn(name = "folha_salarial_id")
    private FolhaSalarial folhaSalarial;

}
