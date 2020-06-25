package io.github.futurewl.data.rest.repository;

import io.github.futurewl.data.rest.entity.Project2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface Project2Repository extends JpaRepository<Project2, Long> {
}
