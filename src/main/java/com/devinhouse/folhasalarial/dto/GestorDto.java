package com.devinhouse.folhasalarial.dto;

import com.devinhouse.folhasalarial.model.Cargo;
import com.devinhouse.folhasalarial.model.FolhaSalarial;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GestorDto {

    @NotBlank(message = "Nome não pode estar vazio!")
    private String nome;
    @org.hibernate.validator.constraints.br.CPF(message = "CPF incorrero!")
    @NotBlank(message = "CPF não pode estar em branco!")
    @Size(max = 11, message = "Digite um CPF válido com 11 dígitos!")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "folha_salarial_id")
    private FolhaSalarial folhaSalarial;

    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
}
