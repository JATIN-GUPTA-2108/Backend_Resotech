package com.melardev.spring.oauth_server.repositories;

import com.melardev.spring.oauth_server.entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    @Query("select new Role(r.id, r.name) from Role r where r.name= :roleName")
    Optional<Role> findByNameHql(String roleName);
}
