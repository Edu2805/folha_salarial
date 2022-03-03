package com.devinhouse.folhasalarial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empregado")
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "folha_salarial_id")
    FolhaSalarial folhaSalarial;
    @ManyToOne
    @JoinColumn(name = "cargo_id")
    Cargo cargo;
    @ManyToOne
    @JoinColumn(name = "gestor_id")
    Gestor gestor;
}
