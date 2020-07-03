package io.github.futurewl.scs.f.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.futurewl.scs.f.service.WeatherReportService;
import io.github.futurewl.scs.f.vo.Weather;
import io.github.futurewl.scs.f.vo.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:08:14
 * @version 1.0
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    private final static Logger logger = LoggerFactory.getLogger(WeatherReportServiceImpl.class);

    private final RestTemplate restTemplate;
    private final StringRedisTemplate stringRedisTemplate;
    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";
    private final Long TIME_OUT = 1800L;

    public WeatherReportServiceImpl(RestTemplate restTemplate, StringRedisTemplate stringRedisTemplate) {
        this.restTemplate = restTemplate;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public Weather getDataByCityId(String cityId) {
        String uri = WEATHER_API + "?citykey=" + cityId;
        return this.doGetWeatherData(uri).getData();
    }

    private WeatherResponse doGetWeatherData(String uri) {
        ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
        String key = uri;
        String strBody = null;
        if (!this.stringRedisTemplate.hasKey(key)) {
            logger.info("未找到Key " + key);
            ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
            if (response.getStatusCodeValue() == 200) {
                strBody = response.getBody();
            }
            ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
        } else {
            logger.info("找到 key " + key + ", value=" + ops.get(key));
            strBody = ops.get(key);
        }
        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;
        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            logger.error("JSON 反序列化异常！", e);
        }
        return weather;
    }


}
