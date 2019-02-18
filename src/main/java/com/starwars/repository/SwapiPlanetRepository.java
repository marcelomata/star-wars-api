package com.starwars.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.starwars.domain.swapi.PlanetSwapi;
import com.starwars.domain.swapi.StartWarsPlanets;

@Repository
public class SwapiPlanetRepository {

	@Autowired
    private RestTemplate restTemplate;
	
	private static final String SWAPI_PLANETS_URL = "https://swapi.co/api/planets/"; 
	
	public List<PlanetSwapi> getAllSwapiPlanets() {
		StartWarsPlanets planets = restTemplate.getForObject(SWAPI_PLANETS_URL, StartWarsPlanets.class);
		return planets.getPlanets();
	}

	public int getNumberOfFilmsByPlanetName(String name) {
		PlanetSwapi planet = getPlanetByName(name);
		if(planet != null) {
			return planet.getFilms().size();
		}
		return 0;
	}
	
	public PlanetSwapi getPlanetByName(String name) {
		List<PlanetSwapi> planets = getAllSwapiPlanets();
		for (PlanetSwapi planetSwapi : planets) {
			if(planetSwapi.getName().equalsIgnoreCase(name)) {
				return planetSwapi;
			}
		}
		return null;
	}
	
}
