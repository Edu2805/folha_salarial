package com.devinhouse.folhasalarial.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "gestor")
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "folha_salarial_id")
    FolhaSalarial folhaSalarial;
    @ManyToOne
    @JoinColumn(name = "cargo_id")
    Cargo cargo;

}
