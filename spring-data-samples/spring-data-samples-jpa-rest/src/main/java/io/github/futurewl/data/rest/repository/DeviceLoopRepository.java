package io.github.futurewl.data.rest.repository;

import io.github.futurewl.data.rest.entity.DeviceLoop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DeviceLoopRepository extends JpaRepository<DeviceLoop, Long> {
}
