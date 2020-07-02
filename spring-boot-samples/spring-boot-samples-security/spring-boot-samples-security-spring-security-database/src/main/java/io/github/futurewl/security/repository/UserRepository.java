package io.github.futurewl.security.repository;

import io.github.futurewl.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
