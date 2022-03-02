package com.devinhouse.folhasalarial.repository;

import com.devinhouse.folhasalarial.model.FolhaSalarial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolhaSalarialRepository extends CrudRepository<FolhaSalarial, Long> {
}
