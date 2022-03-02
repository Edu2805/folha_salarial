package com.devinhouse.folhasalarial.repository;

import com.devinhouse.folhasalarial.model.Empregado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Long> {
}
