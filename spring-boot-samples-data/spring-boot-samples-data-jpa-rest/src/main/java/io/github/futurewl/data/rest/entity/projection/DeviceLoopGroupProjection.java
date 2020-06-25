package io.github.futurewl.data.rest.entity.projection;

import io.github.futurewl.data.rest.entity.DeviceLoopGroup;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "base",types = DeviceLoopGroup.class)
public interface DeviceLoopGroupProjection  {
    String getName();
}
