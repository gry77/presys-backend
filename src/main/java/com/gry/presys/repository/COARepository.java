package com.gry.presys.repository;

import com.gry.presys.entities.TCoaDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface COARepository extends JpaRepository<TCoaDO, Integer> {

}
