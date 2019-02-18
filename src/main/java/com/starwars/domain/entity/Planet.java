package com.starwars.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;


/**
 * The persistent class for the planet database table.
 * 
 */
@Entity
@Table(name="planet")
@NamedQuery(name="Planet.findAll", query="SELECT p FROM Planet p")
@Data
@Builder
public class Planet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	
	private String climate;
	
	private String terrain;
	
	private Integer numberFilms;

}