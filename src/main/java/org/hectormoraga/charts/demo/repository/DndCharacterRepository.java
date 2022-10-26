package org.hectormoraga.charts.demo.repository;

import org.hectormoraga.charts.demo.entity.DndCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DndCharacterRepository extends JpaRepository<DndCharacter, Integer>{

}
