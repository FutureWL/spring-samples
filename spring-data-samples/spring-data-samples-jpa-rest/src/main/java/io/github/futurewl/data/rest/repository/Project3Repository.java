package io.github.futurewl.data.rest.repository;

import io.github.futurewl.data.rest.entity.Project3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface Project3Repository extends JpaRepository<Project3, Long> {
}
