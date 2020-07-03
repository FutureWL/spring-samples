package io.github.futurewl.data.rest.repository;

import io.github.futurewl.data.rest.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
