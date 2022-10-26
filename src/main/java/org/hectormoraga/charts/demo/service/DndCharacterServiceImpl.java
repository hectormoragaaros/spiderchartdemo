package org.hectormoraga.charts.demo.service;

import java.util.List;
import java.util.Optional;

import org.hectormoraga.charts.demo.entity.DndCharacter;
import org.hectormoraga.charts.demo.repository.DndCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dnDCharacterService")
public class DndCharacterServiceImpl implements DndCharacterService {

	@Autowired
	private DndCharacterRepository dndCharacterRepository;

	@Override
	public DndCharacter getCharacterById(int id) {
		Optional<DndCharacter> opt = dndCharacterRepository.findById(id);
		
		if (opt.isEmpty()) {
			throw new RuntimeException("Personaje no existe - id:" + id);
		}
		
		return opt.get();
	}

	@Override
	public List<DndCharacter> gerAllCharacters() {
		List<DndCharacter> listaPersonajes = dndCharacterRepository.findAll();
		
		return listaPersonajes;
	}
	
}
