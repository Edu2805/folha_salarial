package com.devinhouse.folhasalarial.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "folha_salarial")
public class FolhaSalarial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal inss;
    @Column(nullable = false)
    private BigDecimal fgts;
    @Column(nullable = false)
    private BigDecimal irrf;
    @Column(nullable = false)
    private BigDecimal salario;
}
