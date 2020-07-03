package io.github.futurewl.scs.f.service.impl;

import io.github.futurewl.scs.f.service.WeatherDataClient;
import io.github.futurewl.scs.f.service.WeatherReportService;
import io.github.futurewl.scs.f.vo.Weather;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    private final WeatherDataClient weatherDataClient;

    public WeatherReportServiceImpl(WeatherDataClient weatherDataClient) {
        this.weatherDataClient = weatherDataClient;
    }

    @Override
    public Weather getDataByCityId(String cityId) {
        return weatherDataClient.getDataByCityId(cityId).getData();
    }

}
