package io.github.futurewl.security.repository;

import io.github.futurewl.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Set<Role> findRolesByUsers_Id(Integer id);

}
