package org.hectormoraga.charts.demo.service;

import java.util.List;

import org.hectormoraga.charts.demo.entity.DndCharacter;
import org.springframework.stereotype.Service;

@Service
public interface DndCharacterService {
	public DndCharacter getCharacterById(int id);
	public List<DndCharacter> gerAllCharacters();
}
