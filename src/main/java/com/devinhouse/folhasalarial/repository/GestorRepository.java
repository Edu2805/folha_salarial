package com.devinhouse.folhasalarial.repository;

import com.devinhouse.folhasalarial.model.Gestor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorRepository extends CrudRepository<Gestor, Long> {
}
