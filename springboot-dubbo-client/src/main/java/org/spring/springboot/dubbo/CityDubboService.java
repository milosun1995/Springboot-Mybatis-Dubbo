package org.spring.springboot.dubbo;

import java.util.List;

import org.spring.springboot.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by bysocket on 28/02/2017.
 */
public interface CityDubboService {

	City findCityById(Long id);
}
