package org.spring.springboot.dubbo.impl;

import java.util.List;

import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<City> findAllCity() {
		
		return cityDao.findAllCity();
	}

	@Override
	public City findCityById(Long id) {
		
		return cityDao.findCityById(id);
	}

	@Override
	public Long saveCity(City city) {
		
		return cityDao.saveCity(city);
	}

	@Override
	public Long updateCityById(City city) {
		
		return cityDao.updateCityById(city);
	}

	@Override
	public Long deleteCityById(Long id) {
		
		return cityDao.deleteCityById(id);
	}
}
