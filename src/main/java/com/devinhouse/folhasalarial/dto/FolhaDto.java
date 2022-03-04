package com.devinhouse.folhasalarial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FolhaDto {

    @NotBlank(message = "INSS não pode estar vazio!")
    private BigDecimal inss;
    @NotBlank(message = "FGTS não pode estar vazio!")
    private BigDecimal fgts;
    @NotBlank(message = "IRRF não pode estar vazio!")
    private BigDecimal irrf;
    @NotBlank(message = "Salário não pode estar vazio!")
    private BigDecimal salario;

}
