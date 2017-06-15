package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.City;

public interface CityDao {

	List<City> findAllCity();
	
	City findCityById(Long id);
	
	Long saveCity(City city);
	
	Long updateCityById(City city);
	
	Long deleteCityById(Long id);
	
}
