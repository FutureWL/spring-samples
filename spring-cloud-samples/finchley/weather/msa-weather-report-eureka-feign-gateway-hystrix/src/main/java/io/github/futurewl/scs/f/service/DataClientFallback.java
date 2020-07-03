package io.github.futurewl.scs.f.service;

import io.github.futurewl.scs.f.vo.City;
import io.github.futurewl.scs.f.vo.Weather;
import io.github.futurewl.scs.f.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:59
 * @version 1.0
 */
@Component
public class DataClientFallback implements DataClient {

    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);
        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);
        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return new WeatherResponse();
    }

}
