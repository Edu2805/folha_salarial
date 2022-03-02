package com.devinhouse.folhasalarial.repository;

import com.devinhouse.folhasalarial.model.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Long> {
}
