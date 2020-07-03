package io.github.futurewl.data.jpa.slave.repository;

import io.github.futurewl.data.jpa.slave.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
