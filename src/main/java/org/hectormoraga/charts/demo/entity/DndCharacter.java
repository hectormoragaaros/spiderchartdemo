package org.hectormoraga.charts.demo.entity;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dnd_characters")
public class DndCharacter {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "char_type", nullable = false)
	private String characterType;
	@Column(name = "strength", nullable = false)
	private Double strength;
	@Column(name = "dextery", nullable = false)
	private Double dextery;
	@Column(name = "constitution", nullable = false)
	private Double constitution;
	@Column(name = "intelligence", nullable = false)
	private Double intelligence;
	@Column(name = "wisdom", nullable = false)
	private Double wisdom;
	@Column(name = "charisma", nullable = false)
	private Double charisma;
	@Column(name = "path", nullable = false)
	private String path;

	public DndCharacter(String characterType, Double strength, Double dextery, Double constitution, Double intelligence,
			Double wisdom, Double charisma, Path imageFilePath) {
		this.characterType = characterType;
		this.strength = strength;
		this.dextery = dextery;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.path = imageFilePath.toString();
	}

	public DndCharacter() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCharacterType() {
		return characterType;
	}

	public void setCharacterType(String characterType) {
		this.characterType = characterType;
	}

	public Double getStrength() {
		return strength;
	}

	public void setStrength(Double strength) {
		this.strength = strength;
	}

	public Double getDextery() {
		return dextery;
	}

	public void setDextery(Double dextery) {
		this.dextery = dextery;
	}

	public Double getConstitution() {
		return constitution;
	}

	public void setConstitution(Double constitution) {
		this.constitution = constitution;
	}

	public Double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Double intelligence) {
		this.intelligence = intelligence;
	}

	public Double getWisdom() {
		return wisdom;
	}

	public void setWisdom(Double wisdom) {
		this.wisdom = wisdom;
	}

	public Double getCharisma() {
		return charisma;
	}

	public void setCharisma(Double charisma) {
		this.charisma = charisma;
	}

	public Path getPath() {
		return Paths.get(URI.create("file:///" + path));
	}

	public void setPath(Path path) {
		this.path = path.toString();
	}

	@Override
	public String toString() {
		return "DnDCharacter [id=" + id + ", type=" + characterType + ", str=" + strength + ", dex=" + dextery
				+ ", con=" + constitution + ", int=" + intelligence + ", wis=" + wisdom + ", cha=" + charisma
				+ ", path=" + path + "]";
	}
}
