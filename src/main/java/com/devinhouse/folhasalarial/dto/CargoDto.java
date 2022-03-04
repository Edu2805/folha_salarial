package com.devinhouse.folhasalarial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CargoDto {

    @NotBlank(message = "Cargo não pode estar vazio!")
    private String nome;
}
